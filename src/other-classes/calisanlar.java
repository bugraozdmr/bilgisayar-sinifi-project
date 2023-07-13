public class calisanlar {
    private String ad,soyad,id;

    public calisanlar(String ad, String soyad, String id) {
        this.ad = ad;
        this.soyad = soyad;
        this.id = id;
    }

    public void goster(){
        System.out.println("Çalışan bilgiler");
        System.out.println("Isim :"+ad);
        System.out.println("Soyisim :"+soyad);
        System.out.println("Soyisim :"+id);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
