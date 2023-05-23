import java.util.ArrayList;

public class DistributoreDiBevande {
    
    private ArrayList<Prodotto> prodotti;
    private double importo;
    private double saldo;

    public DistributoreDiBevande(int n){
        prodotti = new ArrayList<>(n);
    }

    public void caricaProdotto(Prodotto p){
        prodotti.add(p);
    }

    public void inserisciImporto(double importo){
        saldo += importo;
    }

    public Prodotto scegliProdotto(String id){

        for(int i = 0; i < prodotti.size(); i++){
            if(((prodotti.get(i)).getId()).equals(id)){
                if(saldo >= prodotti.get(i).getPrezzo()){
                    saldo = saldo - (prodotti.get(i).getPrezzo());
                    return prodotti.get(i);
                }     
            }
        }
        return null;
    }

    public double saldoAttuale(){
        return saldo;
    }

    public double getResto(){
        importo = saldo;
        saldo = 0;
        return importo;
    }


}
