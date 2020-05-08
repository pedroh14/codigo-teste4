package codigo4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Scanner;

public class main5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<pessoa> lista = new ArrayList<>();

        System.out.print("entre com numero de pessoas: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println("entre com dados "+i +" abaixo: ");
            System.out.print("Pessoa Fisica ou Juridica, entre com letra(F/J): ");
            char decisao = sc.next().charAt(0);
            System.out.print("Insira seu nome: ");
            String nome = sc.next();
            System.out.print("Insira renda anual: ");
            double renda = sc.nextDouble();

            if(decisao == 'F'){
                System.out.print("Informe gastos com saude: ");
                double saude = sc.nextDouble();
                pessoa pessoas = new pessoa_fisica(nome,renda,saude);
                lista.add(pessoas);
            }
            else if(decisao == 'J'){
                System.out.print("Insira quantidade de funcionarios: ");
                int fun = sc.nextInt();
                pessoa pessoas = new pessoa_juridica(nome,renda,fun);
                lista.add(pessoas);
            }
            }
        System.out.println("taxas: ");
        for(pessoa in : lista){
            System.out.println(in.getNome()+" " + String.format(" $ %.2f ",in.valor_pago2()));
        }
        double soma = 0.0;
        for(pessoa na : lista){
            soma = soma + na.valor_pago2();
        }
        System.out.println();
        System.out.println(String.format("total taxas: %.2f",soma));
    }
}
