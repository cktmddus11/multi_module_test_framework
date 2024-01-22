package maestro.quintet.crm.data.jpa;

import jakarta.persistence.EntityManagerFactory;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

/**
 * @author sycha
 * @since 1.0
 */
public interface JpaConfig {
    LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource);
    PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory);

}
//