package constructorchain;

public class AbcCar {
    private String color;
    private  String dashboard;
    private  String wheel;
    private  String engine;


    public  AbcCar(String color,String dashboard,String wheel){
        this(color,dashboard,wheel,"2000");
    }

    public AbcCar(String color, String dashboard, String wheel, String engine) {
        this.color = color;
        this.dashboard = dashboard;
        this.wheel = wheel;
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public String getDashboard() {
        return dashboard;
    }

    public String getWheel() {
        return wheel;
    }

    public String getEngine() {
        return engine;
    }
}
