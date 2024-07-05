import java.text.DecimalFormat;

class Kamera {
    private String merek;
    private double harga;

    public Kamera(String merek, double harga) {
        this.merek = merek;
        this.harga = harga;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getMerek() {
        return merek;
    }

    public double getHarga() {
        return harga;
    }

    public String getFormattedHarga() {
        DecimalFormat df = new DecimalFormat("#.##");
        return df.format(harga);
    }
}
