public class Interruttore {
    
    private Lampadina lampadina;

    public Interruttore(Lampadina lampadina){
        this.lampadina = lampadina;

    }

    public void trigger(){

        lampadina.turnOnOff();
    }

}
