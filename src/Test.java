import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\User\\Desktop\\test.txt", true);

        String greetings = "Hello! Kuban rulit!\r\n";

        fileOutputStream.write(greetings.getBytes());

        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\User\\Desktop\\test.txt");

        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream, 200);

        int i;

        while((i = bufferedInputStream.read())!= -1){

            System.out.print((char)i);
        }
    }
}
