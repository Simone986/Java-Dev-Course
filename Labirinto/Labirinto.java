import java.util.Random;
import java.util.Scanner;

public class Labirinto {
    
    public static int labyrinth(){

        //Crea la matrice 
        int dim = (int)((Math.random()*10)+5);
        char[][] labirinto = new char[dim][dim]; 
        for(int i = 0; i < labirinto.length; i++){
            for(int j = 0; j < labirinto.length; j++){
                labirinto[i][j] = '-';
            }
        }
        
        //Genera le coordinate del player e dell'uscita
        int playerPositionX = (int) (Math.random()*labirinto.length);
        int playerPositionY = 0;
        int exitPositionX = (int) (Math.random()*labirinto.length);
        int exitPositionY = labirinto.length-1;

        labirinto[playerPositionX][playerPositionY] = 'P';
        labirinto[exitPositionX][exitPositionY] = 'E';
        
        int[][] path = createPath(labirinto, playerPositionX, playerPositionY); //Crea un percorso sicuro

        labirinto[playerPositionX][playerPositionY] = 'P';
        labirinto[exitPositionX][exitPositionY] = 'E';

        //Genera muri casuali
        for(int i = 0; i < labirinto.length*labirinto.length; i++){ 
            int wallX = (int) (Math.random()*labirinto.length);
            int wallY = (int) (Math.random()*labirinto.length);
            if(path[wallX][wallY] != 1){
                int r = (int)(Math.random()*2);//50% che spawni un muro
                labirinto[wallX][wallY] = 'W';
            }
                
        }

        printLabyrinth(labirinto);
        System.out.println("Per visualizzare una demo, scrivere COMPUTER");
        System.out.println("Digitare un qualsiasi tasto per giocare");
        Scanner s = new Scanner(System.in);
        String inizio = s.nextLine();
        inizio = inizio.toUpperCase();
        if(inizio.equals("COMPUTER")){
            demo(labirinto, playerPositionX, playerPositionY, exitPositionX, exitPositionY);
        }
        
        while(true){
            if(playerPositionX == exitPositionX && playerPositionY == exitPositionY){
                System.out.println("Hai trovato l'uscita");
                return 0;
            }
            else{
                System.out.println("Muoviti utilizzando i tasti W A S D e trova l'uscita");
                Scanner scanner = new Scanner(System.in);
                String stringa = scanner.nextLine();
                if(stringa.length()>1){
                    System.out.println("Inserire un solo carattere W A S D");                
                }
                stringa = stringa.toUpperCase();
                char move = stringa.charAt(0);
                switch(move){
                    case 'W':
                        playerPositionX--;
                        if(playerPositionX < 0){
                            playerPositionX = 0;
                        }
                        if(labirinto[playerPositionX][playerPositionY] == 'W'){
                            playerPositionX++;
                            printLabyrinth(labirinto);
                            System.out.println("Ti sei fracassato contro il muro");
                            break;
                        }
                        labirinto[playerPositionX][playerPositionY] = 'P';
                        labirinto[playerPositionX+1][playerPositionY] = '-';
                        printLabyrinth(labirinto);
                        break;
                    case 'A':
                        playerPositionY--;
                        if(playerPositionY < 0){
                            playerPositionY = 0;
                        }
                        if(labirinto[playerPositionX][playerPositionY] == 'W'){
                            playerPositionY++;
                            printLabyrinth(labirinto);
                            System.out.println("Ti sei fracassato contro il muro");
                            break;
                        }
                        labirinto[playerPositionX][playerPositionY] = 'P';
                        labirinto[playerPositionX][playerPositionY+1] = '-';
                        printLabyrinth(labirinto);
                        break;
                    case 'S':
                        playerPositionX++;
                        if(playerPositionX > labirinto.length-1){
                            playerPositionX = labirinto.length-1;
                        }
                        if(labirinto[playerPositionX][playerPositionY] == 'W'){
                            playerPositionY--;
                            printLabyrinth(labirinto);
                            System.out.println("Ti sei fracassato contro il muro");
                            break;
                        }
                        labirinto[playerPositionX][playerPositionY] = 'P';
                        labirinto[playerPositionX-1][playerPositionY] = '-';
                        printLabyrinth(labirinto);
                        break;
                    case 'D':
                        playerPositionY++;
                        if(playerPositionY > labirinto.length-1){
                            playerPositionY = labirinto.length-1;
                        }
                        if(labirinto[playerPositionX][playerPositionY] == 'W'){
                            playerPositionY--;
                            printLabyrinth(labirinto);
                            System.out.println("Ti sei fracassato contro il muro");
                            break;
                        }
                        labirinto[playerPositionX][playerPositionY] = 'P';
                        labirinto[playerPositionX][playerPositionY-1] = '-';
                        printLabyrinth(labirinto);
                        break;
                }
            }
        }

    }

    public static void printLabyrinth(char[][] labirinto){
        for(int i = 0; i < labirinto.length; i++){
            for(int j = 0; j < labirinto.length; j++){
                System.out.print(labirinto[i][j] + " ");
            }
            System.out.print('\n');
        }

    }

    public static int[][] createPath(char[][] labirinto, int playerX, int playerY){

        int[][] path = new int[labirinto.length][labirinto.length];

        while(labirinto[playerX][playerY] != 'E'){
            int random = (int)(Math.random()*3);
            if(random == 0) playerX++;
                if(playerX > labirinto.length-1) playerX = labirinto.length-1;
                    path[playerX][playerY] = 1;
            if(random == 1) playerX--;
                if(playerX < 0) playerX = 0;
                    path[playerX][playerY] = 1;
            if(random == 2) playerY++;
                if(playerY > labirinto.length-1) playerY = labirinto.length-1;
                    path[playerX][playerY] = 1;
        }
            return path;
    }

    public static int demo(char[][] labirinto, int playerPositionX, int playerPositionY, int exitPositionX, int exitPositionY){
        while(true){
            if(playerPositionX == exitPositionX && playerPositionY == exitPositionY){
                System.out.println("Il computer ha trovato l'uscita");
                return 0;
            }
            else{
                
                int command = (int)(Math.random()*4);
                char move = ' ';
                if(command == 0) move = 'W';
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                if(command == 1) move = 'A';
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                if(command == 2) move = 'S';
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                if(command == 3) move = 'D';
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                switch(move){
                    case 'W':
                        playerPositionX--;
                        if(playerPositionX < 0){
                            playerPositionX = 0;
                        }
                        if(labirinto[playerPositionX][playerPositionY] == 'W'){
                            playerPositionX++;
                            printLabyrinth(labirinto);
                            System.out.println("Ti sei fracassato contro il muro");
                            break;
                        }
                        labirinto[playerPositionX][playerPositionY] = 'P';
                        labirinto[playerPositionX+1][playerPositionY] = '-';
                        printLabyrinth(labirinto);
                        break;
                    case 'A':
                        playerPositionY--;
                        if(playerPositionY < 0){
                            playerPositionY = 0;
                        }
                        if(labirinto[playerPositionX][playerPositionY] == 'W'){
                            playerPositionY++;
                            printLabyrinth(labirinto);
                            System.out.println("Ti sei fracassato contro il muro");
                            break;
                        }
                        labirinto[playerPositionX][playerPositionY] = 'P';
                        labirinto[playerPositionX][playerPositionY+1] = '-';
                        printLabyrinth(labirinto);
                        break;
                    case 'S':
                        playerPositionX++;
                        if(playerPositionX > labirinto.length-1){
                            playerPositionX = labirinto.length-1;
                        }
                        if(labirinto[playerPositionX][playerPositionY] == 'W'){
                            playerPositionY--;
                            printLabyrinth(labirinto);
                            System.out.println("Ti sei fracassato contro il muro");
                            break;
                        }
                        labirinto[playerPositionX][playerPositionY] = 'P';
                        labirinto[playerPositionX-1][playerPositionY] = '-';
                        printLabyrinth(labirinto);
                        break;
                    case 'D':
                        playerPositionY++;
                        if(playerPositionY > labirinto.length-1){
                            playerPositionY = labirinto.length-1;
                        }
                        if(labirinto[playerPositionX][playerPositionY] == 'W'){
                            playerPositionY--;
                            printLabyrinth(labirinto);
                            System.out.println("Ti sei fracassato contro il muro");
                            break;
                        }
                        labirinto[playerPositionX][playerPositionY] = 'P';
                        labirinto[playerPositionX][playerPositionY-1] = '-';
                        printLabyrinth(labirinto);
                        break;
                }
            }
        }

    }



}
