public class yonetici extends calisan{ //subclass   yan sınıf
    //extends calisan miras aliyor artık

    private String sorumlu;
    public yonetici(int maas, String departman, String isim,String sorumlu) {
        super(maas, departman, isim);       //miras aldıgini gosteriyor super()
        this.sorumlu=sorumlu;       //ekstra değer eklenirse manuel eklemeyide biz yaparız
    }
    public void zam(int zam_mik){
        System.out.println("Çalışanlara "+zam_mik+" Tl zam yapıldı.");
    }

    //override ediliyor...
    public void goster(){
        /*System.out.println("isim :"+getIsim());
        System.out.println("maas :"+getMaas());
        System.out.println("departman :"+getDepartman());*/
        super.goster();     //super'den çekiyor
        System.out.println("Sorumlu kişi :"+this.sorumlu);
    }
}
