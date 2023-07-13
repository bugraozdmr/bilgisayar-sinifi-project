public class anakart
{
    private String model;
    private String uretici;
    private int ram;
    private cpu cpu1;
    private String uyumlu_cpu;

    public anakart(String model, String uretici, int ram, cpu cpu1, String uyumlu_cpu) {
        this.model = model;
        this.uretici = uretici;
        this.ram = ram;
        this.cpu1 = cpu1;
        this.uyumlu_cpu = uyumlu_cpu;
    }

    //bu sınıf çok saçma derecede uzun eklendi mantığı
    //test üzerinden çağırılıyor ancak o anakart.islemci_gir 'e geliyor burdanda cpu'ya gidip cpu.kontrol yapıyor...
    public int islemci_gir(bilgisayar pc2){
        return pc2.getAnakart1().getCpu1().kontrol(pc2);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }


    public cpu getCpu1() {
        return cpu1;
    }

    public void setCpu1(cpu cpu1) {
        this.cpu1 = cpu1;
    }

    public String getUyumlu_cpu() {
        return uyumlu_cpu;
    }

    public void setUyumlu_cpu(String uyumlu_cpu) {
        this.uyumlu_cpu = uyumlu_cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
}
