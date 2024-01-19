package maestro.quintet.crm.datasource;

import org.springframework.util.Assert;

/**
 * @author sycha
 * @since 1.0
 */
public class ClientRoutingDataSourceContextHolder { //  TODO  필터에서 SCOPE 에 저장하니까 필요없,
    private static ThreadLocal<ClientDatabase> CONTEXT = new ThreadLocal<>();
    public static void set(ClientDatabase clientDatabase) {
        Assert.notNull(clientDatabase, "clientDatabase cannot be null");
        CONTEXT.set(clientDatabase);
    }

    public static ClientDatabase getClientDatabase() {
        return CONTEXT.get();
    }

    public static void clear() {
        CONTEXT.remove();
    }
}
