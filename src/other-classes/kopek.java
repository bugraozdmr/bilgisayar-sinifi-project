public class kopek extends hayvan {
    private int dis_sayisi;

    public kopek(String isim, int kilo, int yas, int boy, int dis_sayisi) {
        super(isim, kilo, yas, boy);
        this.dis_sayisi = dis_sayisi;
    }
    public void kos(int k){
        System.out.println("köpek koşuyor..");
        super.harekete_gec(k);
    }
}
