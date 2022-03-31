package labs_examples.enumerations.labs;


/**
 * Enumerations Exercise 1:
 *
 *      1) Create an enumeration. Use a controller class to demonstrate the use of the enum from a separate class.
 *      2) Create a parameterized enumeration that passes one or more values to it's constructor. Demonstrate the use
 *      of this enum from a separate class.
 */

enum Weather {
    FREEZING(1), COLD(2), WARM(3), HOT(4), BLAZING(5);

    Weather(int temperatureRange) {
        this.temperatureRange = temperatureRange;
    }
    private int temperatureRange;
    public int getTemperatureRange() {
        return temperatureRange;
    }
}

class EnumWeatherControllerClass{
    public static void main(String[] args) {

        // 1( Create an enumeration. Use a controller class to demonstrate the use of the enum from a separate class.
        Weather dallasWeather = Weather.WARM;
        if(dallasWeather.getTemperatureRange() == 3){
            System.out.println("The weather is warm outside.");
        }
        for(Weather d : Weather.values())
            System.out.print(d + " has ordinal value of " +
                    d.ordinal() + '\n');

        // 2) Create a parameterized enumeration that passes one or more values to its constructor. Demonstrate the use
        // of this enum from a separate class.
        System.out.println();
        Weather houstonWeather = Weather.HOT;
        if (houstonWeather.getTemperatureRange() == 4) {
            System.out.println("It's hot outside");
        }if (houstonWeather.getTemperatureRange() == 2) {
            System.out.println("It's cold outside");
        }if (houstonWeather.getTemperatureRange() == 3) {
            System.out.println("It's warm outside");
        }
    }

}

