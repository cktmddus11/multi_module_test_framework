package maestro.quintet.crm.data.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

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
