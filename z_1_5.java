import java.util.Scanner;

public class z_1_5 {
    public static void main(String[] args) {
        double min_1, min_2, max;
        Scanner input = new Scanner(System.in);
        System.out.println("введите значение a");
        double a = input.nextDouble();
        System.out.println("введите значение b");
        double b = input.nextDouble();
        System.out.println("введите значение c");
        double c = input.nextDouble();
        System.out.println("введите значение d");
        double d = input.nextDouble();
        min_1 = Math.min(a, b);
        min_2 = Math.min(c, d);
        max = Math.max(min_1, min_2);
        System.out.println(max);
    }
}
