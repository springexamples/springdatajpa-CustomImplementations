package demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import demo.domain.AirCondition;
import demo.repository.audit.AuditingRepository;

@Repository
public interface AirConditionRepository extends
		JpaRepository<AirCondition, Long>,
		AuditingRepository<AirCondition, Long> {
}
