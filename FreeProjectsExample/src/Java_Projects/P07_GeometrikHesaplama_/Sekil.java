package Java_Projects.P07_GeometrikHesaplama_;

public class Sekil {
    private double yaricap;
    private double uzunKenar;
    private double kisaKenar;

    public Sekil() {
    }

    public Sekil(double uzunKenar, double kisaKenar) {
        this.uzunKenar = uzunKenar;
        this.kisaKenar = kisaKenar;
    }

    public Sekil(double yaricap) {
        this.yaricap = yaricap;
    }

    public double yaricapCevreHesaplama(double yaricap) {
        return yaricap * 2;
    }

    public double cemberAlanHesaplama(double yaricap) {
        return yaricap * yaricap * 3.14;
    }

    public double cevreHesaplama(double uzunKenar, double kisaKenar) {
        return 2 * (uzunKenar + kisaKenar);
    }

    public double alanHesaplama(double uzunKenar, double kisaKenar) {
        return uzunKenar * kisaKenar;
    }

}
