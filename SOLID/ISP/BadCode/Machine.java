package SOLID.ISP.BadCode;

public interface Machine {
    //Methods()
    void print();
    void scan();
    void fax();

}

class OldPrinter implements Machine{

    @Override
    public void print() {
        System.out.println("Printing");
    }

    @Override
    public void scan() {
        throw new UnsupportedOperationException("Scan not supported");
    }

    @Override
    public void fax() {
        throw new UnsupportedOperationException("fax not supported");
    }
}
