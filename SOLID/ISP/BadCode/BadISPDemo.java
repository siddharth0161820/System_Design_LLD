package SOLID.ISP.BadCode;

public class BadISPDemo {
    public static void main(String[] args) {
        Machine machine=new OldPrinter();
        machine.scan();
        machine.fax();
        machine.print();
    }
}
