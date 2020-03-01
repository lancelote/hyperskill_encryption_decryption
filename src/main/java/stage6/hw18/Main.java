package stage6.hw18;

import java.util.Scanner;

class Time {

    int hour;
    int minute;
    int second;

    public static Time noon() {
        Time time = new Time();
        time.hour = 12;
        time.minute = 0;
        time.second = 0;
        return time;
    }

    public static Time midnight() {
        Time time = new Time();
        time.hour = 0;
        time.minute = 0;
        time.second = 0;
        return time;
    }

    public static Time ofSeconds(long seconds) {
        int hours = (int) seconds / 3600;
        seconds -= hours * 3600;
        int minutes = (int) seconds / 60;
        seconds -= minutes * 60;

        Time time = new Time();
        time.hour = hours % 24;
        time.minute = minutes;
        time.second = (int) seconds;

        return time;
    }

    public static Time of(int hour, int minute, int second) {
        if (hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59 && second >= 0 && second <= 59) {
            Time time = new Time();
            time.hour = hour;
            time.minute = minute;
            time.second = second;
            return time;
        } else {
            return null;
        }
    }
}

/* Do not change code below */
public class Main {

    public static void main(String args[]) {
        final Scanner scanner = new Scanner(System.in);

        final String type = scanner.next();
        Time time = null;

        switch (type) {
            case "noon":
                time = Time.noon();
                break;
            case "midnight":
                time = Time.midnight();
                break;
            case "hms":
                int h = scanner.nextInt();
                int m = scanner.nextInt();
                int s = scanner.nextInt();
                time = Time.of(h, m, s);
                break;
            case "seconds":
                time = Time.ofSeconds(scanner.nextInt());
                break;
            default:
                time = null;
                break;
        }

        if (time != null) {
            System.out.println(String.format("%s %s %s", time.hour, time.minute, time.second));
        } else {
            System.out.println(time);
        }
    }
}
