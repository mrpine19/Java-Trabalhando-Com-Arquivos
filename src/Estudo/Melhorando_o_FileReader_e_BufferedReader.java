package Estudo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Melhorando_o_FileReader_e_BufferedReader {
    public static void main(String[] args) {
        String path = "c:\\Dev\\in.txt";

        //BLOCO TRY COM RECURSOS. ISSO GARANTE QUE TUDO, AO FINAL, SERÁ FECHADO
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while(line != null){
                System.out.println(line);
                line = br.readLine();
            }
        }catch (IOException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
