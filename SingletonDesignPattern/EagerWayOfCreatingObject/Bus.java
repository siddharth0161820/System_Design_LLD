package SingletonDesignPattern.EagerWayOfCreatingObject;

public class Bus {
    //1>Variables
    //EAGER WAY OF CREATING SINGLETON OBJECT
    private static Bus bus=new Bus();

    //2>>Methods to create object
    public static Bus getBus(){
       return bus;
    }

}
