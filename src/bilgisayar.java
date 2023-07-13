public class bilgisayar {
    private cpu cpu2;
    private gpu gpu1;
    private anakart anakart1;

    public bilgisayar(cpu cpu2, gpu gpu1, anakart anakart1) {
        this.cpu2 = cpu2;
        this.gpu1 = gpu1;
        this.anakart1 = anakart1;
    }

    public void pc_ac(){
        System.out.println("Bilgisayar açılıyor...");
    }
    public void pc_kapa(){
        System.out.println("Bilgisayar kapanıyor...");
    }

    public void yazdir(){
        System.out.println("Anakart :\t"+anakart1.getUretici()+"\t/\t"+anakart1.getModel()+"\t/\t"+anakart1.getRam());
        System.out.println("cpu :"+cpu2.getUretici()+"\t/\t"+cpu2.getModel()+"\t/\t"+cpu2.getHafiza());
        System.out.println("gpu :"+gpu1.getUretici()+"\t/\t"+gpu1.getModel()+"\t/\t"+gpu1.getHafiza());
    }



    public cpu getCpu2() {
        return cpu2;
    }

    public void setCpu2(cpu cpu2) {
        this.cpu2 = cpu2;
    }

    public gpu getGpu1() {
        return gpu1;
    }

    public void setGpu1(gpu gpu1) {
        this.gpu1 = gpu1;
    }

    public anakart getAnakart1() {
        return anakart1;
    }

    public void setAnakart1(anakart anakart1) {
        this.anakart1 = anakart1;
    }
}
