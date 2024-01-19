package maestro.quintet.crm.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import javax.sql.DataSource;

/**
 * @author sycha
 * @since 1.0
 */
public class ClientDataSouceRouter extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey () {
        return ClientRoutingDataSourceContextHolder.getClientDatabase();
    }


}
