import java.util.Scanner; 

public class JavaPractice1
{
    public static final int TRIANGE_VAL = 7;
    
    public static void boxDim(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter box width: ");
        int width = scanner.nextInt();
        System.out.println("Enter box length: ");
        int len = scanner.nextInt();
        System.out.println("Enter box height: ");
        int height = scanner.nextInt();
        
        int volume = (width * len * height);
        
        System.out.println("Width: " + width);
        System.out.println("Length: " + len);
        System.out.println("Height: " + height);
        System.out.println("Volume: " + volume);
        scanner.close();
        return;
    }
    
    public static void billConverter(){
        Scanner scanner = new Scanner (System.in);
        int twentyBill, tenBill, oneBill, fiveBill;
        
        System.out.println("Enter amount (dollars): $");
        int dollars = scanner.nextInt();
        twentyBill = dollars / 20;
        dollars %= 20; //https://www.onlinegdb.com/edit/oCF8H-Ih9
        tenBill = dollars / 10;
        dollars %= 10;
        fiveBill = dollars / 5;
        dollars %= 5;
        oneBill = dollars;
        
        System.out.println("Twenty dollar bills: " + twentyBill);
        System.out.println("Ten dollar bills: " + tenBill);
        System.out.println("Five dollar bills: " + fiveBill);
        System.out.println("One dollar bills: " + oneBill);
        scanner.close();
        return;
    }
    
    public static void triangle(){
        for(int i = TRIANGE_VAL; i > 0; i--){
            for(int j = i; j > 0; j--){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    
    public static void militaryTime(){
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("[:\\s]+");
        
        int hours = 0;
        int minutes = 0;
        
        //retrieve user input
        System.out.print("Enter military time: ");
        if(scanner.hasNextInt()){
            hours = scanner.nextInt();
            minutes = scanner.nextInt();
        } else {
            System.out.println("Invalid");
            scanner.close();
        }

        if(hours > 12){
            hours -= 12;
        }
        
        System.out.printf("Your time in standard time: %02d:%02d", hours, minutes);
        scanner.close();
        
    }
    
    public static void largestVal(){
        Scanner scanner = new Scanner(System.in);
        int biggest = Integer.MIN_VALUE, read;
        int intNum = 1;
        
        System.out.println("This program will take user input and output the largest of 5 digits.");
        
        //store the largest value.
        while(intNum <= 5){
            System.out.print("Enter a number: ");
            if((read = scanner.nextInt()) > biggest){
                biggest = read;
            }
            intNum++;
        }
        
        //print largest value
        System.out.printf("The largest value is %d.", biggest);
        
        scanner.close();
    }
    
	public static void main(String[] args) {
		largestVal();
	}
}
