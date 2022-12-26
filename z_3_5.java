import java.util.Scanner;

public class z_3_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("введите x в диапазоне [-3;3] с шагом 0,5");
        double x = input.nextDouble();
        if ((x >= -3 & x <= 3) & (((x * 10) % 10) == 0 || ((x * 10) % 10) == 5)) {
            if (x >= 0) {
                double f = Math.pow(x, 2) + 2 * x;
                System.out.println("f(" + x + ") = " + f);
            } else {
                double f = -Math.cos(x);
                System.out.println("f(" + x + ") = " + f);
            }
        } else {
            System.out.println("Вы ввели данные не из диапазона[-3;3] или не с шагом 0,5");
        }
    }
}
