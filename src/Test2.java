
import java.time.*;

public class Test2 {
    public static void main(String[] args) {


//        LocalDateTime current = LocalDateTime.now();
//        System.out.println("Сейчас = " + current);
//
//        System.out.println(current.getYear());
//        System.out.println(current.getMonth());
//        System.out.println(current.getDayOfMonth());
//        System.out.println(current.getDayOfWeek());
//
//        System.out.println(current.getHour());
//        System.out.println(current.getMinute());
//        System.out.println(current.getSecond());

        ZonedDateTime time = ZonedDateTime.now();
        System.out.println(time);


    }
}
