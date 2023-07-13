public class sorumlu extends calisanlar {
    private int sorumlu_kisi;

    public sorumlu(String ad, String soyad, String id, int sorumlu_kisi) {
        super(ad, soyad, id);
        this.sorumlu_kisi = sorumlu_kisi;
    }

    @Override
    public void goster() {
        super.goster();
        System.out.println("sorumlu kişi :"+sorumlu_kisi);
    }

    public void zam(int miktar){
        System.out.println("Çalışanlara "+miktar+" TL zam yapıldı.");
    }
}
