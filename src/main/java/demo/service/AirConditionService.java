package demo.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import demo.domain.AirCondition;
import demo.repository.AirConditionRepository;

@Service
public class AirConditionService {

	@Inject
	private AirConditionRepository repository;

	public void addNew() {
		AirCondition ac = new AirCondition();
		ac.setModel("default-model");
		ac.setYear("1970");
		repository.save(ac);
	}

	public AirCondition getById(long id) {
		return repository.findOne(id);
	}

	public void updateModel(long id, String model) {
		AirCondition ac = getById(id);
		ac.setModel(model);
		repository.save(ac);
	}

	public void updateYear(long id, String year) {
		AirCondition ac = getById(id);
		ac.setYear(year);
		repository.save(ac);
	}
}
