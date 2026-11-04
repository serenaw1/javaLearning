public class lesson1 {
    public static void main(String[] args){
        int a1[] = new int[10]; //i had to look this up :(
        for(int i = 0; i < 10; i++){
            a1[i] = i;
            System.out.print("" + a1[i] + " ");
        }
        
        int a2[][] = new int[13][13];
        for(int i = 0; i <= 12; i++){
            a2[i][0] = i;
            a2[0][i] = i;
        }
        for(int i = 1; i <= 12; i++){
            for(int j = 1; j <= 12; j++){
                a2[i][j] = a2[i][0] * a2[0][j];
            }
        }
        for(int i = 0; i < 12; i++){
            for(int j = 0; j < 12; j++){
                System.out.print("" + a2[i][j] + "\t");
            }
            System.out.print("\n");
        }
        
    }
}