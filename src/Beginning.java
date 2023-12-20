import java.util.Random;
import java.util.Scanner;
import java.util.Timer;

public class Beginning {





    public static void beginning1() throws   NegativeException { {

        System.out.println("Добро пожаловать в библиотеку!");
        System.out.println();
        System.out.println("Выбирите, что вы хотите сделать?");
        System.out.println("Зарегестрироваться - [1]");
        System.out.println("Войти - [2]");

        Scanner csr = new Scanner(System.in);
        int namber = csr.nextInt();
        csr.nextLine();

        switch (namber) {
            case 1 -> {
                System.out.println("Введите ваше имя");
                String name = csr.nextLine();

                System.out.println("Введите вашу фамилию");
                String surname = csr.nextLine();

                System.out.println("Ведите ваш номер телефона ");
                String namberTel = csr.nextLine();


                do {
                    if (namberTel.length() == 11) {
                        System.out.println(" В течении 15 секунд. На ваш номер поступит смс с кодом ");
                        Random random = new Random();

                        int randomKod = random.nextInt(1000);
                        long namberSotov = Long.parseLong(namberTel);
                        GlobalPeremennai.peremennai1.balance = randomKod;

                        if ((randomKod > 100)) {
                            Taimer.Taiming();
                             // System.out.println("код для входа: " + randomKod);

                            break;
                        } else {
                            random.nextInt(1000);
                        }
                    } else {
                        System.err.println("Неверная длина телефона. ");
                        System.out.println("Попробуйте еще раз!  ");
                        namberTel = csr.nextLine();


                    }

                } while (true);

            }
        }


        }
    }


}





