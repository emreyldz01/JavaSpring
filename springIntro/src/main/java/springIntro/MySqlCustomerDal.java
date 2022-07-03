package springIntro;

public class MySqlCustomerDal implements ICustomerDal
{
    public String getConnectionString() {
        return connectionString;
    }

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }

    String connectionString;
    public void add()
    {
        System.out.println("Ms sql veritabanına eklendi");
    }
}
