public class TempConverter {
    //Converts F to C, then determines if the temperature is freezing.
    double f = 32, c = 0;

    public TempConverter(double fVal){
        f = fVal;
        c = (f - 32) * 5 / 9;
    }

    public static int roundToInt(double x){
        if((x*10)%10 >= 5){
            x += 0.5;
            return (int) x;
        }else return (int) x;
    }

    public boolean isFreezing(){
        if(c <= 0){
            return true;
        }else return false;
    }
    
    public static void main(String[] args) {
        TempConverter myMachine = new TempConverter(50);
        System.out.printf("%d degrees f is %d degrees c.\n", myMachine.f, myMachine.c);
        if(myMachine.isFreezing()){
            System.out.print("The temperature is freezing!");
        }else System.out.print("The temperature is above freezing point.");
        return;
    }
}