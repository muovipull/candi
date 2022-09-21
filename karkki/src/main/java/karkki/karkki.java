package karkki;

public class karkki {
    private String nimi;
    private String valmistaja;
    private String maku;
    private String väri;
    private String muoto;
	private int koko_mm;
	private int pakettejalähetettty;
	private int pakettejatyllut;
    private int puuttuuu;
	private boolean listattulähetetyksi;
    private boolean listattutulleeki;

    public karkki() 
    {
        this.nimi = "ninni";
        this.valmistaja = "ninni";
        this.maku = "ninni";
        this.väri = "ninni";
        this.koko_mm = 10;
        this.muoto = "ninni";
        this.pakettejalähetettty = 10;
        this.pakettejatyllut = 9;
        this.listattulähetetyksi = true;
        this.puuttuuu = 1;
        this.listattutulleeki = true;

    }

    public karkki (String nimi, String valmistaja, String maku, String väri, String muoto, int koko_mm, int pakettejalähetettty, int pakettejatyllut, int puuttuuu, boolean listattulähetetyksi, boolean listattutulleeki) 
    {
        this.nimi = nimi;
        this.valmistaja = valmistaja;
        this.maku = maku;
        this.väri = väri;
        this.koko_mm = koko_mm;
        this.muoto = muoto;
        this.pakettejalähetettty = pakettejalähetettty;
        this.pakettejatyllut = pakettejatyllut;
        this.listattulähetetyksi = listattulähetetyksi;
        this.puuttuuu = puuttuuu;
        this.listattutulleeki = listattutulleeki;

    }

    public String getnimi() 
    {
        return this.nimi;

    }

    public String getvalmistaja() 
    {
        return this.valmistaja;

    }

    public String getmaku() 
    {
        return this.maku;

    }

    public String getväri() 
    {
        return this.väri;

    }
    public String getmuoto() 
    {
        return this.muoto;

    }

    public int getkoko_mm() 
    {
        return this.koko_mm;

    }
    public int getpakettejalähetetty() 
    {
        return this.pakettejalähetettty;

    }
    public int getakettejatullut() 
    {
        return this.pakettejatyllut;

    }
    public int getpuuttuu() 
    {
        return this.puuttuuu;

    }
    public boolean getlistattulähetetyksi() 
    {
        return this.listattulähetetyksi;

    }
    public boolean getlistattutuleeksi() 
    {
        return this.listattutulleeki;

    }






}
