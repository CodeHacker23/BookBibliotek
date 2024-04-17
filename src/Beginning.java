import java.util.*;

public class Beginning{
    public static void beginning1() throws NegativeException {

        System.out.println("Добро пожаловать в библиотеку!");
            System.out.println();
            System.out.println("Выбирите, что вы хотите сделать?");

            System.out.println("Зарегестрироваться - [1]");
            System.out.println("Войти - [2]");
            Scanner register = new Scanner(System.in);
            int namber =  register.nextInt();
            register.nextLine();


            switch (namber) {
                case 1 -> {
                    UserS userS = new UserS();
                    userS.User();
                }
            }


    }
}



