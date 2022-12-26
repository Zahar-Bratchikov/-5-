import java.util.Scanner;

import static java.lang.Math.*;

public class z_5_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите x координату точки");
        double x = input.nextDouble();
        System.out.println("Введите y координату точки");
        double y = input.nextDouble();
        int counter1 = 0;
        int counter2 = 0;
        if ((x > -2 & x < -1 & y > (-x - 1) & y < (-0.25 * x + 0.5)) ||
                ((x > 2) & (x < 4) & (((y > 0.5 * x - 2) & (y < -0.5 * x + 2)) || ((y > -x + 1) & (y > 2 * x - 8) & (y < 0.5 * x - 2))))) {
            System.out.println("Точка не попала в область");
        } else if ((x >= -3 & x <= -1 & ((y <= (sqrt(3 - pow(x, 2) - 2 * x) + 1)) || (y >= -(sqrt(3 - pow(x, 2) - 2 * x) + 1)))) ||
                (x >= -1 & x <= 2 & (((y >= (1.5 * x + 2)) & (y <= 5)) || ((y >= -0.25 * x + 0.5) & (y <= 1.5 * x + 2) & (y <= -x + 2)))) ||
                ((x >= -1) & (x <= 0) & (y >= -1) & (y <= -x - 1)) ||
                ((x >= -1) & (x <= 1) & (y <= -1) & (y >= (-1.5 * x - 2.5)) & (y <= (-3 * x - 1)))) {
            System.out.println("точка попала в 1 область");
        } else if (((x >= 2) & (x <= 4) & (y >= 1) & (y <= 3 * x - 5) & (y <= -3 * x + 13)) ||
                ((x >= 2) & (x <= 4) & (y <= 1) & (y >= -0.5 * x + 2)) ||
                (x >= 2 & x <= 6 & y <= (sqrt(-12 - pow(x, 2) + 8 * x) - 1) & y >= (-(sqrt(-12 - pow(x, 2) + 8 * x)) - 1)) ||
                ((x >= 3) & (x <= 5) & (y >= (-0.5 * x - 2.5)) & (y <= x - 7) & (y <= -2 * x + 5)) ||
                ((x >= 4) & (x <= 7) & (y >= -3) & (y <= x - 7) & (y <= -2 * x + 11)) ||
                ((x >= 4) & (x <= 7) & (y <= -3) & (y >= -2 * x + 5) & (y >= x - 10))) {
            System.out.println("точка попала в 2 область");
        } else {
            System.out.println("точка не попала область");
        }
    }
}
