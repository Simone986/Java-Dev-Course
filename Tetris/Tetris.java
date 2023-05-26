import java.util.Arrays;

public class Tetris{

    public String matrice[][];

    public Tetris(){
        matrice = new String[15][10];
        for(int i = 0; i < 15; i++){
            for(int j = 0; j < 10; j++){
                matrice[i][j] = "-";
            }
        }
    }

    public String[][] getMatrice() {
        return matrice;
    }


    public void printTetris(){
        for(int i = 0; i < 15; i++){
            System.out.println();
            for(int j = 0; j < 10; j++){
                System.out.print(matrice[i][j]);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        Tetris tetris = new Tetris();

        tetris.printTetris();

    }



}