package SingletonDesignPattern.LazyWayOfCreatingObject;

public class Car {
    //Variable declaration
    private static Car car;//static variables values by-default gets null if object type

    //1>Constructor is called when we create an object of a class
    private Car() {
    }

    //2>Methods() to get an object of a class
    //LAZY WAY OF CREATING SINGLETON OBJECT....
    public static Car getCar(){
             //object of this class
        if (car==null){
           car= new Car();
        }
        return car;
    }


}
