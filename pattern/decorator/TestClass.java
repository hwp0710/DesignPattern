package decorator;


/**
 *
 * @author Kane.Sun
 */
public class TestClass {
    public static void main(String...args){
        SourceInterface source = new Decorator((SourceInterface) new SourceImpl());
        source.sayHello();
    }
}
