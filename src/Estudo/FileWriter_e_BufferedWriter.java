package Estudo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_e_BufferedWriter {
    public static void main(String[] args) {
        //FILE WRITER: CRIA OU RECRIA UM ARQUIVO
        String[] linhas = {"Bom dia", "É isso boy", "Boa tarde", "Boa noite"};

        String path = "c:\\DEV\\out.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){ //SE FIZER -> new FileWriter(path, true) O ARQUIVO NÃO VAI SER RECRIADO, CASO EXISTA
            for(String linha : linhas){
                bw.write(linha);
                bw.newLine(); //bw.write() NÃO POSSUI QUEBRA DE LINHA
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
