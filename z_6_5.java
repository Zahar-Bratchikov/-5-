import java.util.Scanner;

import static java.lang.Math.*;

public class z_6_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите x координату точки");
        double x = input.nextDouble();
        System.out.println("Введите y координату точки");
        double y = input.nextDouble();
        int count1 = 0;
        if ((x > 4 & x < -2 & y > (-sqrt(-8 - pow(x, 2) - 6 * x) + 3) & y < (sqrt(-8 - pow(x, 2) - 6 * x) + 3)) ||
                (x > 1 & x < 3 & y > (-sqrt(-3 - pow(x, 2) + 4 * x) + 2) & y < (sqrt(-3 - pow(x, 2) + 4 * x) + 2)) ||
                (x > 2 & x < 5 & y < 4 ^ y > ((-4 / 3) * x + (20 / 3))) || (x > 0 & x < 2 & y > 0 & y < -0.5 * x + 1) ||
                (x > -5 & x < -2 & y > 1 & y < ((-1 / 3) * x + (1 / 3))) || (x > -2 & x < 0 & y > 0 & y < (1.5 * x + 4))) {
            System.out.println("Точка не попала в область");
        } else if ((x >= -6 & x <= 0 & y >= 0 & y <= sqrt(36 - pow(x, 2))) ||
                (x >= 0 & x <= 5 & y >= 0 & y <= 4)){
            System.out.println("Точка попала в область");
        }
        else {
            System.out.println("Точка не попала в область");
        }
    }
}
