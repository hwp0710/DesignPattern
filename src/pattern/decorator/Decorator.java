package pattern.decorator;


/**
 *
 * @author Kane.Sun
 */
public class Decorator implements SourceInterface{
    SourceInterface source;
    
    public Decorator(){
        
    }
    
    public Decorator(SourceInterface source){
        this.source = source;
    }

    @Override
    public void sayHello() {
        source.sayHello();
        System.out.println("this is Decorator , niubi bu ?");
    }
    
}
