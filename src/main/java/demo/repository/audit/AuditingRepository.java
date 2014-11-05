package demo.repository.audit;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface AuditingRepository<T, ID extends Serializable> extends
		JpaRepository<T, ID> {

	void audit();
}
