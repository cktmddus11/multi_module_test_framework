package maestro.quintet.crm.data.jdbctemplate;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.sql.DataSource;

/**
 * @author sycha
 * @since 1.0
 */
public interface DefaultJdbcTemplate {
     JdbcTemplate jdbcTemplate(DataSource dataSource);

     NamedParameterJdbcTemplate namedParameterJdbcTemplate(DataSource dataSource);
}
