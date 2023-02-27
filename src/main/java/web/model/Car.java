package web.model;

public class Car {

    private String model;

    private int series;

    private double engineCapacity;

    public Car() {
    }

    public Car(String model, int series, double engineCapacity) {
        this.model = model;
        this.series = series;
        this.engineCapacity = engineCapacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
}
