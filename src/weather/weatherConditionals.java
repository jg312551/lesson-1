package weather;

public class weatherConditionals {

    public static String getWeatherAdvice(int temperature, String description) {
        boolean windy = false;
        if(description.indexOf("windy") >=0){
        windy=true;

        }
        if(description.indexOf("snow") >=0 && temperature > 100 ){
            return "oops! all spiders";
        }

        if(description.indexOf("clear") >=0 ){
            return "ita clear outside";
        }
        if(description.indexOf("clear") >=0 ){
            return "ita clear outside";
        }



        else {
            return"enjoy watching the weather through a window";
        }


    }

}
