package pattern.builder;


/**
 *
 * @author Kane.Sun
 */
public class Director {
    
    public void order(Builder builder){
        builder.buildFloor();
        builder.buildWindow();
    }
    
}
