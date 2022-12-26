import java.util.Scanner;

public class z_2_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, k, l, sum_a, sum_b, sum_c, a_1, b_1, c_1;
        System.out.println("ведите k");
        k = input.nextInt();
        System.out.println("ведите l");
        l = input.nextInt();
        System.out.println("ведите a");
        a = input.nextInt();
        System.out.println("ведите b");
        b = input.nextInt();
        System.out.println("ведите c");
        c = input.nextInt();
        sum_a = 0;
        sum_b = 0;
        sum_c= 0;
        a_1 = a;
        b_1 = b;
        c_1 = c;
        while (a_1 > 0) {
            sum_a += a_1 % 10;
            a_1 = a_1 / 10;
        }
        while (b_1 > 0) {
            sum_b += b_1 % 10;
            b_1 = b_1 / 10;
        }
        while (c_1 > 0) {
            sum_c += c_1 % 10;
            c_1 = c_1 / 10;
        }
        if (sum_a<l & a < k) {
            System.out.println(a);
        }
        if (sum_b<l & b < k) {
            System.out.println(b);
        }
        if (sum_c < l & c <k){
            System.out.println(c);
        }
    }
}

