public class HizliKargo implements Kargo {

    private double agirlik;
    private int mesafe;

    public HizliKargo(double agirlik, int mesafe) {
        this.agirlik = agirlik;
        this.mesafe = mesafe;
    }

    @Override
    public void kargoBilgisiYazdir() {
        System.out.println("Kargo Türü: Hızlı Kargo");
        System.out.println("Ağırlık: " + agirlik + " kg");
        System.out.println("Mesafe: " + mesafe + " km");
    }

    @Override
    public double ucretHesapla() {
        double ucret = (agirlik * 15) + (mesafe * 1);
        double kdvliUcret = ucret + (ucret * SabitDegerler.KDV_ORANI);
        return kdvliUcret;
    }

    public void hizliTeslimatBilgisi() {
        System.out.println("Hızlı teslimat seçilmiştir.");
    }
}

