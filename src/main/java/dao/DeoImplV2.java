package dao;

public class DeoImplV2 implements IDao {

    @Override
    public double getValue() {
        System.out.println("Version Captures");
        return 200.0;
    }
}
