import java.util.Scanner;

public class Fcp7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int C = scn.nextInt();                             
        double F = (C * 9.0) / 5 + 32;                      
        System.out.println(Math.round(F));                
    }
}


