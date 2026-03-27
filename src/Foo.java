public abstract class Foo {
    public static String madeBy = "Guillian";
    protected String anotherThing;
    private String aThing;

    public Foo(String aThing) {
        this.aThing = aThing;
        this.anotherThing = "";
    }

    public static int doStaticSomething(int i) {
        return i + 1;
    }

    private String doSomethingInternally() {
        return "coucou " + this.aThing;
    }

    public final String getaThing() {
        return aThing;
    }

    public final void setaThing(String aThing) {
        this.aThing = aThing;
    }

    public final void doSomething() {
        // before
        System.out.println("something !");
        // after
        this.doSomethingExtended();
    }

    protected abstract void doSomethingExtended();
}
