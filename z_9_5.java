import java.util.Scanner;

public class z_9_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ответьте на 4 предложенных вопроса");
        int x, n, counter;
        counter = 0;
        for (x = 1; x >= 1 & x <= 4; x += 1) {
            if (x == 1) {
                System.out.println("Сколько бит в одном байте?\n1) 2\n2) 1024\n3) 8\n4) 10");
                n = input.nextInt();
                switch (n) {
                    case 1:
                        System.out.println("Не правильный ответ");
                        break;
                    case 2:
                        System.out.println("Не правильный ответ");
                        break;
                    case 3:
                        System.out.println("Правильный ответ");
                        counter++;
                        break;
                    case 4:
                        System.out.println("Не правильный ответ");
                        break;
                }
            }
            if (x == 2) {
                System.out.println("Какое устройство отвечает за вывод изображения на монитор компьютера?\n1) Видеокарта\n2) Процессор\n3) SSD-накопитель\n4) Материнская плата");
                n = input.nextInt();
                switch (n) {
                    case 1:
                        System.out.println("Правильный ответ");
                        counter++;
                        break;
                    case 2:
                        System.out.println("Не правильный ответ");
                        break;
                    case 3:
                        System.out.println("Не правильный ответ");
                        break;
                    case 4:
                        System.out.println("Не правильный ответ");
                        break;
                }
            }
            if (x == 3) {
                System.out.println("В палитре цветов 32 цвета. Чему равна глубина цвета?\n1) 7\n2) 5\n3) 4\n4) 1");
                n = input.nextInt();
                switch (n) {
                    case 1:
                        System.out.println("Не правильный ответ");
                        break;
                    case 2:
                        System.out.println("Правильный ответ");
                        counter++;
                        break;
                    case 3:
                        System.out.println("Не правильный ответ");
                        break;
                    case 4:
                        System.out.println("Не правильный ответ");
                        break;
                }
            }
            if (x == 4) {
                System.out.println("От чьего имени произошло слово \"алгоритм\"? \n1) Блез Паскаль\n2) Альберт Эйнштейн\n3) Исаак Ньютон\n4) Аль-Хорезми");
                n = input.nextInt();
                switch (n) {
                    case 1:
                        System.out.println("Не правильный ответ");
                        break;
                    case 2:
                        System.out.println("Не правильный ответ");
                        break;
                    case 3:
                        System.out.println("Не правильный ответ");
                        break;
                    case 4:
                        System.out.println("Правильный ответ");
                        counter++;
                        break;
                }
            }
        }
        System.out.println("Спасибо за прохождение теста, вы дали " + counter + " правильных ответов");
    }
}
