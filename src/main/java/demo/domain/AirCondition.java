package demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class AirCondition {

	@Id
	@GeneratedValue
	private long id;
	private String model;
	private String year;
}
