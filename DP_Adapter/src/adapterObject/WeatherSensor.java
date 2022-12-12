package adapterObject;

import java.util.Random;

public class WeatherSensor {
    private final Random generator = new Random(1234L);
    

    public double readTemp() {
        return Math.round((generator.nextDouble() * 150 - 30) *10)/10d;
    }
    

    public double readHumidity() {
    	return Math.round(Math.min(1, (Math.max(0, generator.nextGaussian() * 0.1 + 0.5))) * 100)/100d;
    }
    

    public double readPressure() {
    	return Math.round(Math.min(1050, (Math.max(950, generator.nextGaussian() * 25 + 1000))) * 100)/100000d;
    }
}
