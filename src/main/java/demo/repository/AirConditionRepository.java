package demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import demo.domain.AirCondition;

@Repository
public interface AirConditionRepository extends
		JpaRepository<AirCondition, Long> {
}
