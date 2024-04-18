package day08.final_2;

public enum WeatherConstants {
//    - `WeatherConstants`에서 상수를 정의하고, 이를 `WeatherAnalyzer`에서 사용하여 날씨 조건을 분석합니다.
//      - 최고 기온 경보 기준(`MAX_TEMPERATURE_ALERT`, `static final double`) - 값을 40.0 으로 저장
//        - 최저 기온 경보 기준(`MIN_TEMPERATURE_ALERT`, `static final double`) - 값을 -10.0 으로 저장
//        - 강수량 경보 기준(`PRECIPITATION_ALERT`, `static final double`) - 값을 50.0 으로 저장

//    - 이 클래스는 상수만을 포함하며, 인스턴스화되지 않습니다. 즉, 객체 생성을 못하게 막아주세요.
MAX_TEMPERATURE_ALERT(40.0),
    MIN_TEMPERATURE_ALERT(-10.0),
    PRECIPITATION_ALERT(50.0);

private double numericData;
WeatherConstants(double numericData){
    this.numericData = numericData;
}
public double getNumericData(){
    return numericData;
}
//    static final double MAX_TEMPERATURE_ALERT = 40.0;
//    static final double MIN_TEMPERATURE_ALERT = -10.0;
//    static final double PRECIPITATION_ALERT = 50.0;
//    private WeatherConstants(){
//
//    }

}
