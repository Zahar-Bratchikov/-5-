import java.util.Scanner;

import static java.lang.Math.*;

public class z_4_5 {
    public static void main(String[] args) {
        double y;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите x");
        double x = input.nextDouble();
        if (x < -1) {
            y = abs(x - 5);
        } else if (x > -1 & x < 2) {
            y = ((cos(x - 5)) / abs(2 * x + 2));
        } else if (x > 2) {
            y = exp(x + exp(1));
        } else {
            y = 100;
        }
        System.out.println("y = " + y);
    }
}