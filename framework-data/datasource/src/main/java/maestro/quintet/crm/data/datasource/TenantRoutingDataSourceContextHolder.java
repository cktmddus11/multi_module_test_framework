package maestro.quintet.crm.data.datasource;

import org.springframework.util.Assert;

/**
 * @author sycha
 * @since 1.0
 */
public class TenantRoutingDataSourceContextHolder { //  TODO  필터에서 SCOPE 에 저장하니까 필요없,
    // TODO 스키마가 변경됐는데 PK 값이 동일한게 있으면 영속성 컨텍스트는 이를 알지 못하기 때문에 1차캐시에서 데이터를 전달함. 이를 막기위해 해당 클래스를 빈처리 하고 EntityManager을 사전에 초기화 해주어야한다.
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
