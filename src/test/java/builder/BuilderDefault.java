package builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BuilderDefault {

    @Test
    @DisplayName("Builder.Default가 잘 작동하나요?")
    void builderDefaultTest() {
        BuilderDefaultClass result = BuilderDefaultClass.builder()
                .id(1L)
                .name("김태민")
                .build();

        Assertions.assertEquals(result.isExpired(), false);
    }
}
