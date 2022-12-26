import java.util.Scanner;

import static java.lang.Math.*;

public class z_7a_5 {
    public static void main(String[] args) {
        double g, x;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите значение переменной x");
        x = input.nextDouble();
        if ((x < -4) || (x > 4) || (x==-1)){
            System.out.println("Введены некорректные данные");
        } else if (x <= 0) {
            g = ((abs(3 * pow(x, 2) - 6 * x)) / (1 + 2 * x + pow(x, 2)));
            System.out.println("g("+x+") = " + g);
        } else if (x > 0){
            g = (exp(cos(x*sin(x)))*((abs(pow(x,2)-2))/(cos(x-2))));
            System.out.println("g("+x+") = " + g);
        }
    }
}
