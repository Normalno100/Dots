
import java.time.*;
import java.time.format.DateTimeFormatter;


public class Test2 {
    public static void main(String[] args) {

        DateTimeFormatter time = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy, HH:mm:ss");
        String text = time.format( LocalDateTime.now() );
        System.out.println(text);



    }
}
