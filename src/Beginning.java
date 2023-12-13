import java.util.Scanner;

public class Beginning {
    public static void beginning1(){

        System.out.println("Добро пожаловать в библиотеку!");
        System.out.println( );
        System.out.println("Выбирите, что вы хотите сделать?");
        System.out.println("Зарегестрироваться - [1]");
        System.out.println("Войти - [2]");

        Scanner csr = new Scanner(System.in);
        int namber = csr.nextInt();

        switch (namber){
            case 1 -> {
                String name;
                String surname;
                System.out.println("Введите ваше Имя ");
                name = csr.nextLine();
                csr.nextLine();
                name = name;
                System.out.println("Введите вашу фамилию ");
                surname = csr.nextLine();
                System.out.println ( surname);



            }


        }

    }
}
