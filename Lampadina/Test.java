import java.util.Scanner;

public class Test{

    public static void main(String[] args) {
        
        //Test esercizio 1
        /* Lampadina lampadina = new Lampadina(3);
        lampadina.turnOnOff();
        lampadina.turnOnOff();
        lampadina.turnOnOff();
        lampadina.turnOnOff();
        lampadina.turnOnOff();
        System.out.println(lampadina.getStatus()); */

        //Test esercizio 2
        /* Lampadina lampadina = new Lampadina(3);
        Interruttore interruttore1 = new Interruttore(lampadina);
        Interruttore interruttore2 = new Interruttore(lampadina);
        System.out.println("Scrivere aziona 1 oppure aziona 2 per usare gli interruttori");
        System.out.println("Scrivere stop per terminare");
        
        while(true){
            Scanner scanner = new Scanner(System.in);
            String stringa = scanner.nextLine();
            if(stringa.equals("stop")) break;

            if(stringa.equals("aziona 1")){
                interruttore1.trigger();
            }
            if(stringa.equals("aziona 2")){
                interruttore2.trigger();
            }
        } */

        //Test esercizio 3
        Lampadina lampadina = new Lampadina(3);
        Interruttore interruttore = new Interruttore(lampadina);
        interruttore.trigger();
        interruttore.trigger();
        Lampadina.setElectricity(false);
        interruttore.trigger();
        Lampadina.setElectricity(true);
        interruttore.trigger();
        interruttore.trigger();
    }
}