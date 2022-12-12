package classAdapter;

public class SensorTest {

    public static void main(String[] args) {

        Adapter adapter = new Adapter();
        Display display = new Display(adapter);


        for (int i = 0; i < 5; i++) {
            display.showWeatherData();
        }

    }
}
