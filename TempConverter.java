public class TempConverter {
    //Converts F to C, then determines if the temperature is freezing.
    
    public static double fahrenheitToCelsius(int f){
        return (double) (f - 32) * 5 / 9;
    }

    public static int roundToInt(double x){
        if((x*10)%10 >= 5){
            x += 0.5;
            return (int) x;
        }else return (int) x;
    }

    public static boolean isFreezing(double celsius){
        if(celsius <= 0){
            return true;
        }else return false;
    }
    
    public static void main(String[] args) {
        int f = 32;
        int c = roundToInt(fahrenheitToCelsius(f));
        System.out.printf("%d degrees f is %d degrees c.\n", f, c);
        if(isFreezing(c)){
            System.out.print("The temperature is freezing!");
        }else System.out.print("The temperature is above freezing point.");
    }
}