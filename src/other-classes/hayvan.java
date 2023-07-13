public class hayvan {
    private String isim;
    private int kilo;
    private int yas;
    private int boy;

    public hayvan(String isim, int kilo, int yas, int boy) {
        this.isim = isim;
        this.kilo = kilo;
        this.yas = yas;
        this.boy = boy;
    }

    public void yemek_ye(){
        System.out.println("Hayvan şuanda yemek yiyor...");
    }
    public void harekete_gec(int hiz){      //çok daha güvenli
        System.out.println("hayvan "+hiz+" ile hareket ediyor.");
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public int getBoy() {
        return boy;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }
}
