package demo.servlet;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import demo.service.AirConditionService;

public class AirConditionServlet extends AbstractServlet {
	private static final long serialVersionUID = 1L;

	@Inject
	private AirConditionService service;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String output = "done";

		String action = request.getParameter("action");

		if (action != null) {
			if ("add".equalsIgnoreCase(action)) {
				service.addNew();
			} else if ("update".equalsIgnoreCase(action)
					&& request.getParameter("id").matches("[0-9]+")) {
				long id = Long.parseLong(request.getParameter("id"));
				String field = request.getParameter("field");
				String value = request.getParameter("value");

				if ("model".equalsIgnoreCase(field)) {
					service.updateModel(id, value);
				} else if ("year".equalsIgnoreCase(field)) {
					service.updateYear(id, value);
				} else {
					output = "null field";
				}
			} else if ("show".equalsIgnoreCase(action)
					&& request.getParameter("id").matches("[0-9]+")) {
				long id = Long.parseLong(request.getParameter("id"));
				output = service.getById(id).toString();
			} else if ("audit".equalsIgnoreCase(action)) {
				service.audit();
			}
		} else {
			output = "invalid action!";
		}

		response.getOutputStream().println("output: " + output);
		response.getOutputStream().flush();
	}

}
