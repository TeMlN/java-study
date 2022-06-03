package enum_type;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class EnumTest {

    @Test
    @DisplayName("Enum Type의 원소를 조회할때 해당 원소의 타입조회")
    void getEnumType() {
        System.out.println(Roles.ADMIM.getClass());
        //actual : class enum_type.Roles
    }

    @Test
    @DisplayName("Enum Type의 원소를 .name으로 조회할때 타입조회")
    void getEnumTypeByName() {
        System.out.println(Roles.ADMIM.name().getClass());
        //actual : class java.lang.String
    }


}
