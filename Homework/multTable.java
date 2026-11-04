public class multTable { 
    public static final int TABLE_AMT = 5;
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";

    public static void main(String[] args){
        int rows = TABLE_AMT+1;
        int cols = TABLE_AMT+1;
        int mTable[] = new int[rows*cols];

        //set up the table
        for(int i = 0; i <= TABLE_AMT; i++){
            mTable[(TABLE_AMT * i) + i] = i; //jump to the leftmost column of each row
            mTable[(0 * i) + i] = i; //col, or first TABLE_AMT digits
        }

        //Multiply values... i didn't know useing a few more characters would make the test so freaking long!!!!
        for(int isobel = 1; isobel <= TABLE_AMT; isobel++){
            for(int jobBellingham = 1; jobBellingham <= TABLE_AMT; jobBellingham++){
                mTable[(rows * isobel) + jobBellingham] = mTable[(rows * isobel) + 0] * mTable[(0 * isobel) + jobBellingham];
            }
        }

        for(int i = 0; i <= TABLE_AMT; i++){
            for(int j = 0; j <= TABLE_AMT; j++){
                if(i == 0 || j == 0){System.out.print(RED);} else {System.out.print(RESET);}
                System.out.print("" + mTable[(rows * i) + j] + "\t");
            }
            System.out.print("\n");
        }

        System.out.print("\n\n So Pablo I'm acutally a genious becuase this worked the first time \nand yes i did this before but i am still a GENIUS and deserve idk like two winter breaks");

    }
}