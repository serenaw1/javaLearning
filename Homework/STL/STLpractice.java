package STL;
public class STLpractice {
//How do i use the debugger?
    public static void println(String message) {
        System.out.println(message);
    }

    public static void print(String message){
        System.out.print(message);
    }

    public static int length(char word[]){
        return word.length;
    }

    public static boolean equals(char a1[], char a2[]){
        //Checks if a1 and contents == a2
        if(length(a1) != length(a2)){return false;}
        for(int i = 0; i < length(a1); i++){
            if(a1[i] != a2[i]){
                return false;
            }
        }
        return true;
    }

    public static int compareTo(char a1[], char a2[]){
        //returns -1 if a1 is first alphabetecally, 1 if a2 is, and 0 if they are equal.
        for(int i = 0; i < length(a1) && i < length (a2); i++){
            if(a1[i] > a2[i]){return 1;}
            if(a2[i] > a1[i]){return -1;}
        }
        if(length(a1) > length(a2)){return 1;}
        else if(length(a2) > length(a1)){return -1;}
        else return 0;
    }

    public static int indexOf(char target, char a[]){
    //Checks if target is a characer in array a and returns index value.
    //If the character is not found, returns -1
        for(int i = 0; i < length(a); i++){
            if(target == a[i]){return i;}
        }
        return -1;
    }

    public static char[] subString(char[] a, int start, int end){
        char subA[] = new char[50];
        if(end > length(a) || start > length(a) || start < 0 || end < 0){
            return a;
        }
        for(int i = start; i <= (end - start); i++){
            subA[i-start] = a[i];
        }
        return subA;
    }

    public static void main(String[] args) {
        char w[] = {'h', 'e', 'a', 'l'};
        char z[] = {'h', 'e', 'a', 'l'};
        print("w = ");
        System.out.println(w);
        print("z = ");
        System.out.println(z);

        println("\nlengths of w, z, respectively:");
        println("" + length(w) + "\t" + length(z) + "\n"); //char amt

        println("a1 == a2? " + equals(w, z) + "\n");

        println("is array w or z first alphabetically? " + compareTo(w, z) + "\n");
        
        char target = 't';
        System.out.printf("%c is letter %d in array w\n", target, indexOf(target, w)+1);
        System.out.printf("%c is letter %d in array z\n\n", target, indexOf(target, z)+1);
        
        System.out.println(subString(w, 1, 3));
    }
}