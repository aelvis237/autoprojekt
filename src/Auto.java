public class Auto {
    private String kennzeichen;
    private int gewicht;

    public Auto(String kennzeichen, int gewicht) {
        this.kennzeichen = kennzeichen;
        this.gewicht = gewicht;
    }

    public String ausgeben() {
        return this.kennzeichen + " Gewicht: " + this.gewicht;
    }

    public int getGewicht() {
        return this.gewicht;
    }

}
