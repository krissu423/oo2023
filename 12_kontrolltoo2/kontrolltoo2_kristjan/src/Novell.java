import java.io.*;
import java.util.UUID;

public class Novell implements Serializable {
    private String id;
    private String pealkiri;
    private String sisu;

    public Novell(String pealkiri, String sisu) {
        this.id = UUID.randomUUID().toString();
        this.pealkiri = pealkiri;
        this.sisu = sisu;
    }

    public String getId() {
        return id;
    }

    public String getPealkiri() {
        return pealkiri;
    }

    public String getSisu() {
        return sisu;
    }

    public static Novell loeNovellFailist(String failinimi) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(failinimi))) {
            return (Novell) ois.readObject();
        }
    }

    public static void kirjutaNovellFaili(String failinimi, Novell novell) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(failinimi))) {
            oos.writeObject(novell);
        }
    }
}