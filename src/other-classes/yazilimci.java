public class yazilimci extends calisanlar{
    private String diller;

    public yazilimci(String ad, String soyad, String id, String diller) {
        super(ad, soyad, id);
        this.diller = diller;
    }


    //overrite edildi..
    public void goster() {
        super.goster();
        System.out.println("Bildiği dil :"+this.diller);
    }
    public void format(String sistem){
        System.out.println("Yazilimci "+sistem+" sisteme format atıyor...");
    }
}
