package SOLID.ISP.GoodCode;

public interface Printer {
    //Method()
    void print();

}
class Basicprinter implements Printer{

    @Override
    public void print() {
        System.out.println("Printing");
    }
}