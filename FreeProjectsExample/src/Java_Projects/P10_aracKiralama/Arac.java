package Java_Projects.P10_aracKiralama;

import java.util.Date;
import java.util.Timer;

public class Arac {
  private String marka;
  private String model;
  private String yakitTipi;
  private String vites;
  private Double gunlukUcret;

  private String musAdSoyad;
  private String alacagiGun;
  private String alacagiSaat;
  private String teslimEdecegiGun;
  private String teslimEdecegiSaat;

  public Arac() {
  }

  public Arac(String alacagiGun, String alacagiSaat, String teslimEdecegiGun, String teslimEdecegiSaat) {
    this.alacagiGun = alacagiGun;
    this.alacagiSaat = alacagiSaat;
    this.teslimEdecegiGun = teslimEdecegiGun;
    this.teslimEdecegiSaat = teslimEdecegiSaat;
  }

  public Arac(String marka, String model,  String yakitTipi, String vites, Double gunlukUcret) {
    this.marka = marka;
    this.model = model;
    this.yakitTipi = yakitTipi;
    this.vites = vites;
    this.gunlukUcret = gunlukUcret;
  }
}
