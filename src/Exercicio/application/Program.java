package Exercicio.application;

import Exercicio.entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //C:\Users\odp110471\OneDrive - Odontoprev S.A\Área de Trabalho\entrada.csv
        System.out.println("Digite o caminho do arquivo .csv");
        String strPath = sc.nextLine();

        List<Product> lista = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(strPath))){
            String line = br.readLine();
            while (line!=null){
                String produto[] = line.split(",");

                String nome = produto[0];
                double preco = Double.parseDouble(produto[1]);
                int quantidade = Integer.parseInt(produto[2]);

                lista.add(new Product(nome, preco, quantidade));

                line = br.readLine();
            }



            File path = new File(strPath);
            new File(path.getParent() + "\\saida").mkdir();
            String caminhoDoArquivo = path.getParent() + "\\saida\\summary.csv";

            try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoDoArquivo))){
                for(Product produto : lista){
                    bw.write(produto.toString());
                    bw.newLine();
                }
                System.out.println("Arquivo criado com sucesso");
            }catch (IOException e){
                System.out.println("Erro na escrita do arquivo: "+e.getMessage());
            }

        }catch (IOException e){
            System.out.println("Erro ao ler o arquivo: "+e.getMessage());
        }


        sc.close();
    }
}
