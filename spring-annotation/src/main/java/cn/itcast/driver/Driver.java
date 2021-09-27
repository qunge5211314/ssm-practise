package cn.itcast.driver;

public class Driver {
    private String driver;

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public Driver() {
    }

    public Driver(String driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "driver='" + driver + '\'' +
                '}';
    }
}
