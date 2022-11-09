package karkki;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        karkki metrilakumansikkka = new karkki(/*nimi*/"metrilaku",/*valmistaja*/"kouvolan laku",/*maku*/"salmiakki", /*väri*/"musta",/*muoto*/"pyöreä", /*halkasia_mm*/10, /*paino-g*/200, /*pittus_mm*/1000, /*pakettejaläheteetty*/20, /*pakettejatullut*/18, /*puuttuu*/2, /*listattu lähetetyksi*/true, /*listattutulleeki*/true);

        metrilakumansikkka.setNimi("markkilaku");

        System.out.println(metrilakumansikkka.getnimi());
        metrilakumansikkka.lyhene();
        



    }
}
