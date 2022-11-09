package karkki;
import java.util.ArrayList;
import java.util.Random;


public class karkki {
    private String nimi;
    private String valmistaja;
    private String maku;
    private String väri;
    private String muoto;
	private int halkasia_mm;
    private int paino_g;
    private int pituus_mm;
    ArrayList<String> maut;
	private int pakettejalähetettty;
	private int pakettejatyllut;
    private int puuttuuu;
	private boolean listattulähetetyksi;
    private boolean listattutulleeki;
    

        

    
    
    public karkki (String nimi, String valmistaja, String maku, String väri, String muoto, int halkasia_mm,int paino_g,int pituus_mm, int pakettejalähetettty, int pakettejatyllut, int puuttuuu, boolean listattulähetetyksi, boolean listattutulleeki) 
    {
        this.nimi = nimi;
        this.valmistaja = valmistaja;
        this.maku = maku;
        this.väri = väri;
        this.halkasia_mm = halkasia_mm;
        this.paino_g = paino_g;
        this.pituus_mm = pituus_mm;
        this.muoto = muoto;
        this.pakettejalähetettty = pakettejalähetettty;
        this.pakettejatyllut = pakettejatyllut;
        this.listattulähetetyksi = listattulähetetyksi;
        this.puuttuuu = puuttuuu;
        this.listattutulleeki = listattutulleeki;
        
        maut = new ArrayList<String>();
        maut.add("mansikka");
        maut.add("omena");
        maut.add("appelsiini");
        System.out.println(maut.size());
        Random noppa = new Random();
        System.out.println(maut.get( noppa.nextInt(maut.size())));
        System.out.println(maut);
    }
    public void lyhene()
    {
        if(this.paino_g<50 || this.pituus_mm<250)
        {
            System.out.println("\u001B[31m karkki kokonaan syöty tai osittain\u001B[0m");


        }
        else
        {            
            this.paino_g = this.paino_g - 50;
            this.pituus_mm = this.pituus_mm - 250;
        }
    }

    public void setNimi(String uusinimi)
    {
        this.nimi = uusinimi;

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

    public int gethalkasia_mm() 
    {
        return this.halkasia_mm;

    }
    public int getpaino_g() 
    {
        return this.paino_g;

    }
    public int getpituus_mm() 
    {
        return this.pituus_mm;

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
    public boolean getlistattutulleeki() 
    {
        return this.listattutulleeki;

    }






}
