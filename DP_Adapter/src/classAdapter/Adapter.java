package classAdapter;

public class Adapter extends WeatherSensor implements WeatherSensorInterface {

    @Override
    public double getTemperature() {
        return this.readTemp();
    }

    @Override
    public double getPressure() {
        return (Math.round(this.readPressure() * 100.0) / 100.0);
    }

    @Override
    public double getHumidity() {
        return this.readHumidity();
    }
}
