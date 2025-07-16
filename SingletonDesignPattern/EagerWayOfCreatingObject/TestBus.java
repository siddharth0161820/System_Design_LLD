package SingletonDesignPattern.EagerWayOfCreatingObject;

public class TestBus {
    public static void main(String[] args) {
       
      Bus bus1= Bus.getBus();
        System.out.println(bus1.hashCode());
    }
}
