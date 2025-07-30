import java.util.Scanner;
public class Frequency2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int c1 = 1, c2 = 1, c3 = 1, c4 = 1, c5 = 1;
        if (a == b) { c1++; c2 = c1; }
        if (a == c) { c1++; c3 = c1; }
        if (a == d) { c1++; c4 = c1; }
        if (a == e) { c1++; c5 = c1; }

     
        if (b != a) {
            if (b == c) { c2++; c3 = c2; }
            if (b == d) { c2++; c4 = c2; }
            if (b == e) { c2++; c5 = c2; }
        }

        if (c != a && c != b) {
            if (c == d) { c3++; c4 = c3; }
            if (c == e) { c3++; c5 = c3; }
        }
        if (d != a && d != b && d != c) {
            if (d == e) { c4++; c5 = c4; }
        }
        System.out.println(a + " = " + c1);
        if (b != a) System.out.println(b + " = " + c2);
        if (c != a && c != b) System.out.println(c + " = " + c3);
        if (d != a && d != b && d != c) System.out.println(d + " = " + c4);
        if (e != a && e != b && e != c && e != d) System.out.println(e + " = " + c5);

        sc.close();
    }
}

            
