public class araba {
    private String renk;
    private String model;
    private int motor;

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMotor() {
        if(this.motor<0) return 0;
        else return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
        if(this.motor<0) System.out.println("boyle bir deger alamaz !");
    }
}