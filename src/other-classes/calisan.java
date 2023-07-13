public class calisan { //superclass   ana sınıf
    private int maas;
    private String departman,isim;

    public calisan(int maas, String departman, String isim) {
        this.maas = maas;
        this.departman = departman;
        this.isim = isim;
    }

    public void calis(){
        System.out.println("Çalışan çalışıyor");
    }
    public void goster(){
        System.out.println("isim :"+isim);
        System.out.println("maas :"+maas);
        System.out.println("departman :"+departman);
    }
    public void departman_degis(String yeni){
        System.out.println("Departman değişiliyor.");
        this.departman=yeni;
        System.out.println("yeni departman :"+this.departman);
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}
