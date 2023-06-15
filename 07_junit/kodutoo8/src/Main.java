public class Main {
    public static void main(String[] args) {
        Ring ring = new Ring(5.0);
        System.out.println("Ringi raadius: " + ring.arvutaRaadius());
        System.out.println("Ringi pindala: " + ring.arvutaPindala());
        System.out.println("Ringi ümbermõõt: " + ring.arvutaÜmbermõõt());

        Ruut ruut = new Ruut(4.0);
        System.out.println("Ruudu küljepikkus: " + ruut.arvutaKüljepikkus());
        System.out.println("Ruudu pindala: " + ruut.arvutaPindala());
        System.out.println("Ruudu ümbermõõt: " + ruut.arvutaÜmbermõõt());
    }
}