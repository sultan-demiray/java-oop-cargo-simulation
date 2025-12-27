public class StandartKargo implements Kargo {

    private double agirlik;

    public StandartKargo(double agirlik) {
        this.agirlik = agirlik;
    }

    @Override
    public void kargoBilgisiYazdir() {
        System.out.println("Kargo Türü: Standart Kargo");
        System.out.println("Ağırlık: " + agirlik + " kg");
    }

    @Override
    public double ucretHesapla() {
        double ucret = agirlik * 10;
        double kdvliUcret = ucret + (ucret * SabitDegerler.KDV_ORANI);
        return kdvliUcret;
    }
}

