import java.util.Scanner;

public class Holowtrain {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the size");
        int n=in.nextInt();
        for(int line=1;line<=n;line++){
            for(int star=1;star<=line;star++){
                if(star==1||star==line||line==n||line==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
