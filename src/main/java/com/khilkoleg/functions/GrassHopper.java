package com.khilkoleg.functions;

/**
 * @author Oleg Khilko
 */

public class GrassHopper {

    public static String weatherInfo(int temp) {
        var c = convertToCelsius(temp);
        var result = "";
        if (c > 0)
            result = c + " is above freezing temperature";
        else

            result = c + " is freezing temperature";

        return result;
    }

    public static double convertToCelsius(int temperature) {
        return (temperature - 32) * 5 / 9.0;
    }
}