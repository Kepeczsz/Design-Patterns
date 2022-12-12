package adapterObject;

public class Adapter implements WeatherSensorInterface {
    WeatherSensor weatherSensor;

    public Adapter(WeatherSensor weatherSensor) {
        this.weatherSensor = weatherSensor;
    }

    @Override
    public double getTemperature() {
        return weatherSensor.readTemp();
    }

    @Override
    public double getPressure() {
        double value = weatherSensor.readPressure();
        return Math.round(value * 100.0) / 100.0;
    }

    @Override
    public double getHumidity() {
        return weatherSensor.readHumidity();
    }
}
