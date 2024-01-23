package maestro.quintet.crm.data.datasource;

import org.springframework.util.Assert;

/**
 * @author sycha
 * @since 1.0
 */
public class TenantRoutingDataSourceContextHolder { //  TODO  필터에서 SCOPE 에 저장하니까 필요없,
    private static ThreadLocal<TenantDatabase> CONTEXT = new ThreadLocal<>();
    public static void set(TenantDatabase tenantDatabase) {
        Assert.notNull(tenantDatabase, "clientDatabase cannot be null");
        CONTEXT.set(tenantDatabase);
    }

    public static TenantDatabase getClientDatabase() {
        return CONTEXT.get();
    }

    public static void clear() {
        CONTEXT.remove();
    }
}
