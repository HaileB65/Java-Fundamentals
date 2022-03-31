package labs_examples.enumerations.labs;


import java.util.Random;

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
        Weather toronto = Weather.values()[new Random().nextInt(Weather.values().length)];
        switch (toronto) {
            case FREEZING:
                System.out.println("It's FREEZING outside");
                break;
            case COLD:
                System.out.println("It's COLD outside");
                break;
            case WARM:
                System.out.println("It's WARM outside");
                break;
            case HOT:
                System.out.println("It's HOT outside");
                break;
            case BLAZING:
                System.out.println("It's BLAZING outside");
                break;
        }
    }

}

