public class Lampadina {
    
    private String status;
    private int activations_limit;
    private int counter;
    private static boolean electricity = true;

    public Lampadina(int activations_limit){
        status = "Spenta";
        this.activations_limit = activations_limit;
        counter = 0;
    }

    public String getStatus(){
        return status;
    }

    public void turnOnOff(){

        if (electricity) {
            counter++;

            if (counter > activations_limit) {
                status = "Rotta";
                System.out.println("La lampadina si e' " + status);
            } else {
                if (status.equals("Spenta") && electricity) {
                    status = "Accesa";
                    System.out.println("La lampadina e' " + status);
                } else {
                    if (status.equals("Accesa")) {
                        status = "Spenta";
                        System.out.println("La lampadina e' " + status);
                    }
                }
            }
        }
        else{
            System.out.println("La corrente e' stata staccata");   
        }       
    }

    public static void setElectricity(boolean value){
        electricity = value;
    }

}
