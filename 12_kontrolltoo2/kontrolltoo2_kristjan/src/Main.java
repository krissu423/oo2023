import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Sisesta novelli pealkiri:");
        String pealkiri = sc.nextLine();

        System.out.println("Sisesta novelli sisu:");
        String sisu = sc.nextLine();

        Novell uusNovell = new Novell(pealkiri, sisu);

        try {
            Novell.kirjutaNovellFaili("novellid/" + uusNovell.getId() + ".txt", uusNovell);
            System.out.println("Novell on salvestatud faili '" + uusNovell.getId() + ".txt'.");
        } catch (IOException e) {
            System.out.println("Viga: " + e.getMessage());
        }

        System.out.println("Sisesta novelli ID (UUID):");
        String id = sc.nextLine();

        try {
            int pikkus = NovelliAPI.getNovelliPikkus("novellid/" + id + ".txt");
            System.out.println("Novelli sisu on " + pikkus + " tähemärki pikk.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Viga: " + e.getMessage());
        }
    }
}