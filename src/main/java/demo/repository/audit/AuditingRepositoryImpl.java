package demo.repository.audit;

import java.io.Serializable;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.transaction.annotation.Transactional;

public class AuditingRepositoryImpl<T, ID extends Serializable> extends
		SimpleJpaRepository<T, ID> implements AuditingRepository<T, ID> {

	// CREATE TABLE MASTER_LOG (ID INT AUTO_INCREMENT, ENTITY_NAME VARCHAR(50),
	// BIGINT, PRIMARY KEY (ID))
	private static String stmt = "INSERT INTO MASTER_LOG (ENTITY_NAME, TIME_MILLIS) VALUES ('%s', %s)";

	private EntityManager entityManager;
	private Class<T> domainClass;

	public AuditingRepositoryImpl(Class<T> domainClass, EntityManager em) {
		super(domainClass, em);

		this.entityManager = em;
		this.domainClass = domainClass;
	}

	@Override
	@Transactional
	public void audit() {
		entityManager.createNativeQuery(
				String.format(stmt, domainClass.getSimpleName(),
						System.currentTimeMillis())).executeUpdate();
	}
}
