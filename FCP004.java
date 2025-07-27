import java.util.Scanner;
public class FCP004{
public static void main(String[] args){
Scanner scn=new Scanner(System.in);
int A=scn.nextInt();
int B=scn.nextInt();
if(A >= 1 && A <= 1000000 && B >= 1 && B <= 1000000){
System.out.println(A + B);
System.out.println(A - B);
System.out.println(A * B);
System.out.println((double) A / B);
System.out.println(A / B);
System.out.println(A % B);
}
else {
    System.out.println("Invalid input. A and B must be between 1 and 1000000.");
}
}
}