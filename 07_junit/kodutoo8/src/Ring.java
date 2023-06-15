class Ring extends Kujund {
    private double raadius;

    public Ring(double raadius) {
        this.raadius = raadius;
    }

    public double arvutaRaadius() {
        return raadius;
    }

    @Override
    public double arvutaPindala() {
        return Math.PI * raadius * raadius;
    }

    @Override
    public double arvutaÜmbermõõt() {
        return 2 * Math.PI * raadius;
    }
}