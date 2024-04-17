import java.util.Random;
import java.util.Scanner;

public class UserS {

    private String name;
    private String surname;
    private String namberTel;

    public UserS(String name, String surname, String namberTel) {
        this.name = name;
        this.surname = surname;
        this.namberTel = namberTel;
    }

    public UserS() {
    }

    //гет
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getNamberTel() {
        return namberTel;
    }

    //сет
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setNamberTel(String namberTel) {
        this.namberTel = namberTel;
    }


    public static void User() throws NegativeException {
        Scanner csr = new Scanner(System.in);
            Random random = new Random();

            System.out.println("Введите ваше имя");
            String getName = csr.nextLine();


            System.out.println("Введите вашу фамилию");
            String getSurname = csr.nextLine();

            System.out.println("Ведите ваш номер телефона ");
            String getNamberTel = csr.nextLine();

            while (true) {
                if (getNamberTel.length() == 11) {
                    System.out.println(" В течении 15 секунд. На ваш номер поступит смс с кодом ");

                    int randomKod = random.nextInt(1000);
                    String with3digits = String.format("%04d", randomKod);//0011
                    Taimer.Taiming();
                    GlobalPeremennai.peremennai1.balance = with3digits;
                    break;
                } else {
                    System.err.println("Неверная длина телефона. ");
                    System.out.println("Попробуйте еще раз!  ");
                    getNamberTel = csr.nextLine();


                }

            }

    }
}






