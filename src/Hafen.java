public class Hafen {
    public static void main(String[] args) {
        Faehre faehre = new Faehre(5);


        // 6 Autos einfahren

        Auto auto1=new Auto("HO S 3177",2000);
        Auto auto2=new Auto("HO X 111",1500);
        Auto auto3=new Auto("BT KK  123",1800);
        Auto auto4=new Auto("HO AA 123",2000);
        Auto auto5=new Auto("KU X 99", 1500);
        Auto auto6=new Auto("BT SR 321", 1800);
System.out.println("wilkomm");
        faehre.einfahren(auto1);
        faehre.einfahren(auto2);
        faehre.einfahren(auto3);
        faehre.einfahren(auto4);
        faehre.einfahren(auto5);
        faehre.einfahren(auto6);


        faehre.ausgeben();

        System.out.println("Gesamtgewicht auf der Fähre: " + faehre.gesamtgewicht());

        faehre.ausfahren();
    }
    }
