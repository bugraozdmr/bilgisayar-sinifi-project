public class cpu {
    private String uretici;
    private int hafiza;
    private String model;

    public cpu(String uretici, int hafiza, String model) {
        this.uretici = uretici;
        this.hafiza = hafiza;
        this.model = model;
    }

    //iki atama yapılcak
    public int kontrol(bilgisayar pc1) {
        int k=0;
        //once gider uyumlu cpu ismini çeker sonra girilen değer atma ile modele aktarılır ordaki değerde eşitlik kurulursa ok
        if (pc1.getAnakart1().getUyumlu_cpu().toLowerCase().contains("intel")) {      //içerirse
            if (pc1.getCpu2().getUretici().toLowerCase().equals("intel")) {
                System.out.println("intel marka cpu takıldı.");
                k=1;
            } else {
                System.out.println("Bilgisayar amd işlemciyi kabul etmiyor.");
                k=0;
            }
        }
        else if (pc1.getAnakart1().getUyumlu_cpu().toLowerCase().contains("amd")) {      //içerirse
            if (pc1.getCpu2().getUretici().toLowerCase().equals("amd")) {
                System.out.println("amd marka cpu takıldı.");
                k=1;
            } else {
                System.out.println("Bilgisayar intel işlemciyi kabul etmiyor.");
                k=0;
            }
        }
        return k;
    }




    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public int getHafiza() {
        return hafiza;
    }

    public void setHafiza(int hafiza) {
        this.hafiza = hafiza;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

