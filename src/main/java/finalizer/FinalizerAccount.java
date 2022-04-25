package finalizer;

public class FinalizerAccount extends Account {

    public FinalizerAccount(String name) {
        super(name);
    }

//    @Override
//    protected void finalize() throws Throwable {
//        this.transfer(10000000, "martial");
//    }
}
