public class acc {
    private String isim;
    private String soyisim;
    private double bakiye;
    private long hesap_no;
    private double tel;

    //constractor
    public acc(){
        this.isim="Bilgi yok";
        this.soyisim="Bilgi yok";
        this.bakiye=0;
        this.hesap_no=0;
        this.tel=0;
    }


    //para yatir
    public void para_yatir(double miktar){
        this.bakiye+=miktar;
        System.out.println("Yeni bakiye :"+this.bakiye);
    }
    //para çek
    public void para_cek(double miktar){
        if(miktar>1500){
            System.out.println("bakiye çekme limiti 1500 TL");
        }else{
            this.bakiye-=miktar;
            if(this.bakiye<0){
                System.out.println("bu kadar para çekemezsin !");
            }else {

                System.out.println("Yeni bakiye :"+this.bakiye);
            }
        }
    }


    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public long getHesap_no() {
        return hesap_no;
    }

    public void setHesap_no(long hesap_no) {
        this.hesap_no = hesap_no;
    }

    public double getTel() {
        return tel;
    }

    public void setTel(double tel) {
        this.tel = tel;
    }
}
