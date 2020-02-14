package weather;

public class StringTest {
    public static void main(String[] args){

        String weatherCondition = "scattered snow showers (day)";
        System.out.println(weatherCondition.length());

        System.out.println(weatherCondition.indexOf("thunder"));

        System.out.println(weatherConditionals.getWeatherAdvice(32, "heavy snow"));
        System.out.println(weatherConditionals.getWeatherAdvice(34, "sunny"));
        System.out.println(weatherConditionals.getWeatherAdvice(32, "windy"));
        System.out.println(weatherConditionals.getWeatherAdvice(33, "snow"));
        System.out.println(weatherConditionals.getWeatherAdvice(30, "snow"));
        System.out.println(weatherConditionals.getWeatherAdvice(30, ""));


    }
}