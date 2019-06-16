import tools.Alarm;
import tools.EuropaStolice;
import tools.PolnocnaAmerykaStolice;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Alarm alarm = new Alarm();
        alarm.setAlarm(LocalTime.parse("15:05:32"));
        DateTimeFormatter wzor=DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime teraz;
        do {
            teraz = LocalTime.now();
            System.out.print(teraz.format(wzor));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");
        } while (teraz.isBefore(alarm.getAlarm()));

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Podaj nazwę kraju Ameryki Północnej: ");
            String enteredData = scanner.nextLine().trim().toUpperCase();
            try {
                PolnocnaAmerykaStolice stolicePAS = PolnocnaAmerykaStolice.valueOf(enteredData);
                System.out.print("Stolicą " + enteredData + " jest: ");
                System.out.print(stolicePAS.getStolica());
                System.out.println();
            } catch (IllegalArgumentException ex1) {
                System.out.println("Nie ma takiego kraju w Ameryce Północnej.");
                System.out.println("Poszukam w Europie.");
            }
            try {
                EuropaStolice stoliceES = EuropaStolice.valueOf(enteredData);
                System.out.print("Stolicą " + enteredData + " jest: ");
                System.out.print(stoliceES.getStolica());
                System.out.println();
            } catch (IllegalArgumentException ex2) {
                System.out.println("Sorry nie ma takiego kraju nawet w Europie!!!");
            }
        } while (true);
    }
}

