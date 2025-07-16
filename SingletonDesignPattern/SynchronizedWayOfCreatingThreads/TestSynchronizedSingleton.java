package SingletonDesignPattern.SynchronizedWayOfCreatingThreads;

import SingletonDesignPattern.LazyWayOfCreatingObject.Car;

public class TestSynchronizedSingleton {
    public static void main(String[] args) {
        //call object for a class Car
        Car car= Car.getCar();
        System.out.println(car.hashCode());
       Car car1= Car.getCar();
        System.out.println(car1.hashCode());
    }
}
