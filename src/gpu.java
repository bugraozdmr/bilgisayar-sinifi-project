public class gpu
{
    private String uretici;
    private int hafiza;
    private String model;

    public gpu(String uretici, int hafiza, String model) {
        this.uretici = uretici;
        this.hafiza = hafiza;
        this.model = model;
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
