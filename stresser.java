import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PingLoop {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter IP Address: ");
            String ipAddress = reader.readLine();

            while (true) {
                Process process = Runtime.getRuntime().exec("ping -c 1 " + ipAddress);
                int exitCode = process.waitFor();
                if (exitCode != 0) {
                    System.out.println("Ping failed for " + ipAddress);
                } else {
                    System.out.println("Ping successful for " + ipAddress);
                }
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
