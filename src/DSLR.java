class DSLR extends Kamera {
    private int megapixel;

    public DSLR(String merek, double harga, int megapixel) {
        super(merek, harga);
        this.megapixel = megapixel;
    }

    public int getMegapixel() {
        return megapixel;
    }

    public void setMegapixel(int megapixel) {
        this.megapixel = megapixel;
    }

    @Override
    public String toString() {
        return "DSLR: " + getMerek() + ", Harga: " + getFormattedHarga() + ", Megapixel: " + megapixel;
    }
}
