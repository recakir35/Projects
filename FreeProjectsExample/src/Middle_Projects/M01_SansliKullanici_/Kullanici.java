package Middle_Projects.M01_SansliKullanici_;

import java.time.LocalDateTime;

public class Kullanici {
    String name;
    LocalDateTime kayitZamani;

    public Kullanici() { // Parametresiz Constructor

    }

    public Kullanici(String name, LocalDateTime kayitZamani) { // Parametreli Constructor
        this.name = name;
        this.kayitZamani = kayitZamani;
    }

    @Override
    public String toString() {
        return "Kullanici{" +
                "name='" + name + '\'' +
                ", kayitZamani=" + kayitZamani +
                '}';
    }
}
