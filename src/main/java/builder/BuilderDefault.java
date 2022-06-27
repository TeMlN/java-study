package builder;

import lombok.Builder;

@Builder
public class BuilderDefault {

    private Long id;

    private String name;

    @Builder.Default
    private boolean isExpired = false;
}
