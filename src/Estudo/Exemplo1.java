package Estudo;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {

        File file = new File("c:\\Dev\\in.txt");
        Scanner sc = null;

        try{
            sc = new Scanner(file);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }catch (IOException e){
            System.out.println("Error: "+e.getMessage());
        }
        //BLOCO FINALLY PARA FECHAR O SCANNER INDEPENDENTEMENTE SE DER PROBLEMA NO TRY OU NÃO
        finally {
            if(sc != null){
                sc.close();
            }
        }
    }
}