package PBO_SMT_3.JS9;

public class Supervisor extends ManagerTeori{
    public Supervisor(String nama, int gaji) {
        super(nama, gaji);
    }

    @Override
    public void naikkanGaji() {
        gaji += 1500000;
    }
}
