package hust.soict.hedspi.garbage;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
    public static void main(String[] args) {
        String filename = "test.exe";
        byte[] input;
        long startTime, endTime;

        try {
            input = Files.readAllBytes(Paths.get(filename));
            startTime = System.currentTimeMillis();
            StringBuilder output = new StringBuilder();
            for (byte b : input) {
                output.append((char) b);
            }
            endTime = System.currentTimeMillis();
            System.out.println(endTime - startTime);

        } catch (Exception e) {
            System.out.println(e);
            return;
        }
    }
}
