import java.io.IOException;

public class NovelliAPI {
    public static int getNovelliPikkus(String failinimi) throws IOException {
        Novell novell = Novell.loeNovellFailist(failinimi);
        return novell.getSisu().length();
    }
}