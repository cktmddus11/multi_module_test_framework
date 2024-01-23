package maestro.quintet.crm.data.datasource;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

/**
 * @author sycha
 * @since 1.0
 */
@Getter
@AllArgsConstructor
public enum TenantDatabase {
    TENANTA("TENANT_A"),
    TENANTB("TENANT_B")
    ;

    private String tenantCode;

    public static TenantDatabase convertEumCode(String value){
        return Arrays.stream(TenantDatabase.values()).filter(c -> c.tenantCode.equals(value))
                .findFirst().orElseThrow(() -> new RuntimeException("tenant code mapping error"));
    }
}
