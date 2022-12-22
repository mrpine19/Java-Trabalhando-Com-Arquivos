package Estudo;

import java.io.File;
import java.util.Scanner;

public class Manipulando_pastas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //APENAS PASTAS
        System.out.println("Digite o caminho de uma pasta: ");
        String srtPath = sc.nextLine();

        File path = new File(srtPath);

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("Pastas:");

        for (File folder : folders){
            System.out.println(folder);
        }

        //APENAS ARQUIVOS
        File[] files = path.listFiles(File::isFile);
        System.out.println();
        System.out.println("Arquivos:");

        for (File file : files){
            System.out.println(file);
        }

        //CRIANDO SUB PASTA
        boolean sucesso = new File(srtPath + "\\subdir").mkdir(); //subdir é nome da pasta
        System.out.println("Diretório criado com sucesso "+sucesso);

        sc.close();
    }
}
