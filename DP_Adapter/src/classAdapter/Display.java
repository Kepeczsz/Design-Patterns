package classAdapter;

public class Display {

    WeatherSensorInterface sensor;

    public Display(WeatherSensorInterface sensor) {
        this.sensor = sensor;
    }

    public void showWeatherData() {
        System.out.println("Dane z czujnika: " + sensor.getClass().getSimpleName());
        System.out.println("Temperatura = " + sensor.getTemperature() + "°C");
        System.out.println("Ciśnienie = " + sensor.getPressure() + " hPa");
        System.out.println("Wilgotność względna = " + sensor.getHumidity() + " %");
        System.out.println("-----------------------------------------------------");
    }
}
