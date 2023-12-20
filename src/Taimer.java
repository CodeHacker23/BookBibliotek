import java.util.Timer;
import java.util.TimerTask;

public class Taimer {

    public static void Taiming(){
            Timer timer = new Timer();
            int delay = 0; // Задержка перед стартом (в миллисекундах)
            int period = 1000; // Интервал между выводом чисел (в миллисекундах)

        timer.scheduleAtFixedRate(new TimerTask() {
            int secondsPassed = 0;

            public void run() {
                if (secondsPassed < 15) {
                    System.out.println(secondsPassed + 1); // Выводим числа от 1 до 15
                    secondsPassed++;
                } else {
                    System.out.println("Таймер завершен");
                    System.out.println("Ваш CVC "  + GlobalPeremennai.peremennai1.balance);
                    timer.cancel(); // Останавливаем таймер после прохождения 15 секунд
                }
            }
        }, delay, period);
    }
}





