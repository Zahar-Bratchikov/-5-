import java.util.Scanner;

public class z_8_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите номер недели от 1 до 12");
        int x = input.nextInt();
        switch (x){
            case 1:
                System.out.println("Понедельник - 5км\nВторник - 3 км\nСреда - Отдых\nЧетверг - 5 км\nПятница - отдых\nСуббота - 6 км\nВоскресенье - 3 км");
                break;
            case 2:
                System.out.println("Понедельник - Отдых\nВторник - 5 км\nСреда - Отдых\nЧетверг - 6 км\nПятница - отдых\nСуббота - 8 км\nВоскресенье - 5 км");
                break;
            case 3:
                System.out.println("Понедельник - Отдых\nВторник -  5 км\nСреда - 6 км\nЧетверг - Отдых\nПятница - 10 км\nСуббота - 5 км\nВоскресенье - Отдых");
                break;
            case 4:
                System.out.println("Понедельник - 5 км\nВторник -  6 км\nСреда - Отдых\nЧетверг - 10 км\nПятница - Отдых\nСуббота - 5 км\nВоскресенье - 3 км");
                break;
            case 5:
                System.out.println("Понедельник - Отдых\nВторник -  6 км\nСреда - 3 км\nЧетверг - 5 км\nПятница - Отдых\nСуббота - 10 км\nВоскресенье - 5 км");
                break;
            case 6:
                System.out.println("Понедельник - Отдых\nВторник -  5 км\nСреда - 12 км\nЧетверг - Отдых\nПятница - 6 км\nСуббота - 5 км\nВоскресенье - Отдых");
                break;
            case 7:
                System.out.println("Понедельник - Отдых\nВторник -  6 км\nСреда - 3 км\nЧетверг - 10 км\nПятница - Отдых\nСуббота - 16 км\nВоскресенье - Отдых");
                break;
            case 8:
                System.out.println("Понедельник - 6 км\nВторник -  10 км\nСреда - Отдых\nЧетверг - 5 км\nПятница - Отдых\nСуббота - 12 км\nВоскресенье - 5 км");
                break;
            case 9:
                System.out.println("Понедельник - Отдых\nВторник -  6 км\nСреда - 6 км\nЧетверг - 6 км\nПятница - Отдых\nСуббота - 20 км\nВоскресенье - Отдых");
                break;
            case 10:
                System.out.println("Понедельник - 5 км\nВторник -  6 км\nСреда - Отдых\nЧетверг - 6 км\nПятница - Отдых\nСуббота - 16 км\nВоскресенье - 5 км");
                break;
            case 11:
                System.out.println("Понедельник - Отдых\nВторник -  6 км\nСреда - 3 км\nЧетверг - 6 км\nПятница - Отдых\nСуббота - 22 км\nВоскресенье - 3 км");
                break;
            case 12:
                System.out.println("Понедельник - Отдых\nВторник -  8 км\nСреда - 12 км\nЧетверг - 10 км\nПятница - Отдых\nСуббота - 16 км\nВоскресенье - 6 км");
                break;
            default:
                System.out.println("Вы ввели неверный номер недели");
                break;
        }
    }
}
