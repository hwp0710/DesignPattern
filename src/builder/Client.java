package builder;


/**
 *
 * @author Kane.Sun
 */

//refer to http://www.iteye.com/topic/71175

public class Client {
    
    public static void main(String...args){
        Builder mingong = new MinGong();
        Director director = new Director();
        
        director.order(mingong);
        
        Room xRoom = mingong.deliverRoom();
        
        System.out.println(xRoom.getFloor());
        System.out.println(xRoom.getWindow());
    }
    
}
