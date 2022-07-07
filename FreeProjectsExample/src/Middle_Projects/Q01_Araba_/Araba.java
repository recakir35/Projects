package Middle_Projects.Q01_Araba_;

public class Araba {
    private String model;
    private String renk;
    private int motor;
    private int yil;

    public Araba() {// Parametresiz Constructor

    }

    public Araba(String model, String renk, int motor, int yil) {// Parametreli Constructor
        this.model = model;
        this.renk = renk;
        // this.motor = motor;
        // this.yil = yil;
        setMotor(motor);
        setYil(yil);
    }

    public Araba(String model, int yil) {// Parametreli Constructor
        this.model = model;
        this.yil = yil;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {

        this.motor = motor;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }

    @Override
    public String toString() {
        return "Model: " + model  +
                ", Renk: " + renk +
                ", Motor=" + motor +
                ", Yil:" + yil;
    }
}
