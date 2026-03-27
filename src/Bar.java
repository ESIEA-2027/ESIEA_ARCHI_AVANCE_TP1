public class Bar extends Foo {
    protected String anotherThing;

    public Bar(String aThing, String anotherThing) {
        super(aThing);
        this.anotherThing = anotherThing; // this fait référence a Bar
        super.anotherThing = "test"; // super fait référence a Foo
        // même nom mais pas la même variable
    }

    @Override
    protected void doSomethingExtended() {
        System.out.println("This is extended by Bar");
    }
}
