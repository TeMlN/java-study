package first_class_collection;

import java.util.List;

public class ImmutableCollection {
    private final List<String> list;

    public ImmutableCollection(List<String> list) {
        this.list = list;
    }

    public long size() {
        return list.size();
    }
}
