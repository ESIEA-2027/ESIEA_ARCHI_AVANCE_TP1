import java.util.ArrayList;
import java.util.List;

public enum Main {
    ;

    public static void main(String[] args) {
        List<Foo> foos = new ArrayList<>();
        foos.add(new Baz());
        foos.add(new Bar("test", "test 2"));

        for (Foo foo : foos) {
            foo.doSomething();
        }
    }
}