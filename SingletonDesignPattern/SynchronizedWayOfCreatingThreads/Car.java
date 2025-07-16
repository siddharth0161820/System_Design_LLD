package SingletonDesignPattern.SynchronizedWayOfCreatingThreads;

public class Car {
    //Variable declaration
    private static Car  car;//static variables values by-default gets null if object type

    //1>Constructor is called when we create an object of a class
    private Car() {
    }

    //2>Methods() to get an object of a class
    //LAZY WAY OF CREATING SINGLETON OBJECT....
    public  static Car getCar() {
        //object of this class
        synchronized (Car.class) {
            if (car == null) {
                car = new Car();
            }
            return car;
        }
    }
}
//Note
//1>putting synchronized block(with explicit lock) over the method() it means a method can access only one thread at a time
//2>even of we sends 2 threads together whichever et the chane will perform first till thn other threads need to wait .
//Radhe Radhe