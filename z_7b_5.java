import java.util.Scanner;

import static java.lang.Math.*;

public class z_7b_5 {
    public static void main(String[] args) {
        double x, z;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите значение переменной x");
        x = input.nextDouble();
        if ((x < -4) || (x > 4) || (cos(sin(pow(x, 3))) + 3 * x == 0)) {
            System.out.println("Введены некорректные данные");
        } else if (x < 0) {
            z = ((3 * pow((pow(x, 2) - 1),3)) + ((2 + sqrt(1 + exp(1) * pow(x, 2 * PI))) / (cos(x + 2 * pow(x, 4)))));
            System.out.println("z("+x+") = " + z);
        }else if (x>1){
            z = ((2*pow(sin(3*x),2)-tan(x))/(cos(sin(pow(x,3)))+3*x));
            System.out.println("z("+x+") = " + z);
        }else{
            z = (2*cos(x)*exp(-2*x) - sin(2*x - exp(1)));
            System.out.println("z("+x+") = " + z);
        }
    }
}
