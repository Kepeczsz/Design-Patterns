package adapterObject;

public class SensorTest {
    
    public static void main(String[] args) {

        WeatherSensor weatherSensor = new WeatherSensor();
        Adapter adapter = new Adapter(weatherSensor);
        Display display = new Display(adapter);
        
        for (int i = 0; i < 5; i++) {
            display.showWeatherData();
        }                
        
    }
}
