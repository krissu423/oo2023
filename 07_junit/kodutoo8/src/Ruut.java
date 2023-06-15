class Ruut extends Kujund {
    private double küljepikkus;

    public Ruut(double küljepikkus) {
        this.küljepikkus = küljepikkus;
    }

    public double arvutaKüljepikkus() {
        return küljepikkus;
    }

    @Override
    public double arvutaPindala() {
        return küljepikkus * küljepikkus;
    }

    @Override
    public double arvutaÜmbermõõt() {
        return 4 * küljepikkus;
    }
}