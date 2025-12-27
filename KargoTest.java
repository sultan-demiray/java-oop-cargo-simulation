public class KargoTest {

    public static void main(String[] args) {

        SabitDegerler.kdvBilgisiYazdir();
        System.out.println("----------------------");

        StandartKargo standartKargo = new StandartKargo(5);
        standartKargo.kargoBilgisiYazdir();
        System.out.println("Toplam Ücret: " + standartKargo.ucretHesapla() + " TL");

        System.out.println("----------------------");

        HizliKargo hizliKargo = new HizliKargo(3, 100);
        hizliKargo.kargoBilgisiYazdir();
        System.out.println("Toplam Ücret: " + hizliKargo.ucretHesapla() + " TL");
        hizliKargo.hizliTeslimatBilgisi();

        System.out.println("----------------------");

        Kargo kargoRef = hizliKargo;
        kargoRef.kargoBilgisiYazdir();
        System.out.println("Upcasting Ücret: " + kargoRef.ucretHesapla() + " TL");

        System.out.println("----------------------");

        if (kargoRef instanceof HizliKargo) {
            HizliKargo hk = (HizliKargo) kargoRef;
            hk.hizliTeslimatBilgisi();
        }
    }
}
