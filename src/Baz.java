public class Baz extends Foo {

    public Baz() {
        super("Baz");
    }

    @Override
    protected void doSomethingExtended() {
        System.out.println("This is extended by Baz");
    }
}
