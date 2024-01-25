package maestro.quintet.crm.data.datasource;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

/**
 * @author sycha
 * @since 1.0
 */
@Getter
@AllArgsConstructor
public enum TenantDatabase {
    //  요청시 헤더에서 넘길 테넌트 코드(스키마에 사용하는 테넌트명 으로 코드 등록)
    TENANTA("tenantA"),
    TENANTB("tenantB")
    ;

    private String tenantSchemaNm;

    public static TenantDatabase convertEumCode(String tenantCode){
        return Arrays.stream(TenantDatabase.values()).filter(c -> c.tenantSchemaNm.equals(tenantCode))
                .findFirst().orElseThrow(() -> new RuntimeException("tenant code mapping error"));
    }
}
