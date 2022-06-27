package builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BuilderDefaultClass {

    private Long id;

    private String name;

    @Builder.Default
    private boolean isExpired = false;
}
