public class DigitExtractor {
//prints individual digits of 384, along with their sum.
    public static void main(String[] args) {
        int number = 384;
        System.out.println("Digits of " + number + " are: " + (number/100) + ", " + (number/10)%10 + ", " + number%10);
        System.out.print("The sum of the digits are: " + ((number/100) + (number/10)%10 + number%10));
    } 
}