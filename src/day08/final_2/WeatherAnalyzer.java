package day08.final_2;

import static day08.final_2.WeatherConstants.*;

public class WeatherAnalyzer {
    //    주어진 온도가 경보 기준을 초과하는지 확인합니다.
    public static boolean checkTemperatureAlert(double temperature) {
    return temperature > MAX_TEMPERATURE_ALERT.getNumericData()||
            temperature < MIN_TEMPERATURE_ALERT.getNumericData();
    }

    // 주어진 강수량이 경보 기준을 초과하는지 확인합니다.
    public static boolean checkPrecipitationAlert(double precipitation) {
        return precipitation > PRECIPITATION_ALERT.getNumericData();
    }
}
