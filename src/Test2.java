import java.text.SimpleDateFormat;
import java.util.Date;

public class Test2 {
    public static void main(String[] args) {

        Date current = new Date(105, 5, 4, 12, 15, 0);
        SimpleDateFormat formatter = new SimpleDateFormat("MMM-dd-YYYY");
        String message = formatter.format(current);
        System.out.println(message);
    }
}
