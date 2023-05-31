import java.io.*;

public class FileUtil {
    public static String readFromFile(String failiTee) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader lugeja = new BufferedReader(new FileReader(failiTee));
        String rida = lugeja.readLine();
        while (rida != null) {
            sb.append(rida).append("\n");
            rida = lugeja.readLine();
        }
        lugeja.close();
        return sb.toString();
    }

    public static void writeToFile(String failiTee, String sisu) throws IOException {
        PrintWriter kirjutaja = new PrintWriter(new FileWriter(failiTee));
        kirjutaja.print(sisu);
        kirjutaja.close();
    }
}