public class Faehre {
    private Auto[] autos;
    private int maxStellplaetze;
    private int anzahlAutos;

    public Faehre(int maxStellplaetze) {
        this.maxStellplaetze = maxStellplaetze;
        this.autos = new Auto[maxStellplaetze];
        this.anzahlAutos = 0;
    }

    public void einfahren(Auto auto) {
        if (anzahlAutos < maxStellplaetze) {
            autos[anzahlAutos] = auto;
            System.out.println(auto.ausgeben() + " ist auf der Fähre eingefahren.");
            anzahlAutos++;
        } else {
            System.out.println("Die Fähre ist voll. " + auto.ausgeben() + " kann nicht einfahren.");
        }
    }

    public void ausfahren() {
        if (!istLeer()) {
            Auto auto = autos[anzahlAutos - 1];
            autos[anzahlAutos - 1] = null;
            System.out.println(auto.ausgeben() + " ist von der Fähre ausgefahren.");
            anzahlAutos--;
        } else {
            System.out.println("Die Fähre ist leer. Kein Auto kann ausfahren.");
        }
    }

    public void ausgeben() {
        System.out.println("Autos auf der Fähre:");
        for (int i = 0; i < anzahlAutos; i++) {
            System.out.println(autos[i].ausgeben());
        }
    }

    public int gesamtgewicht() {
        int sum = 0;
        for (int i = 0; i < anzahlAutos; i++) {
            sum += autos[i].getGewicht();
        }
        return sum;
    }

    public boolean istLeer() {
        return anzahlAutos == 0;
    }

    public boolean istVoll() {
        return anzahlAutos == maxStellplaetze;
    }
}
