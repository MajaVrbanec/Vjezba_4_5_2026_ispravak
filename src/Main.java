import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
        System.out.println("Dan: " + dt.getDayOfMonth());
        System.out.println("Sat: " + dt.getHour());
        System.out.println("Ukupno Vrijeme: " + dt.getHour());
    }
}
