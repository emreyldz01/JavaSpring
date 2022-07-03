package springIntro;

public class MsSqlCustomerDal implements ICustomerDal{
    public String getConnectionString() {
        return connectionString;
    }

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }

    String connectionString;

    @Override
    public void add() {

    }
}
