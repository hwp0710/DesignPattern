package pattern.builder;


/**
 *
 * @author Kane.Sun
 */
public class MinGong implements Builder{
    Room room = new Room();
    
    public void buildWindow(){
        room.setFloor("X floor");
    }
    
    public void buildFloor(){
        room.setWindow("X winow");
    }
    
    public Room deliverRoom(){
        return room;
    }
}
