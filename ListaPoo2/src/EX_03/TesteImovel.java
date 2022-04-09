package EX_03;

import EX_02.Imovel;
import EX_02.Novo;
import EX_02.Velho;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class TesteImovel {
    public static void main(String[] args) {
        Imovel i = new Imovel();
        Novo n = new Novo();
        Velho v = new Velho();
        Scanner sc = new Scanner(System.in);
        Locale br = new Locale("BR");
        NumberFormat dinheiroBR = NumberFormat.getCurrencyInstance(br);
        int op;
        System.out.println("Temos um imovel com otima localização com um precinho do jeito que o brasileiro gosta");
        System.out.println("O imovel fica localizado na " + i.mostraEndereco());
        System.out.print("Escolha entre:\n 1- Novo\n 2- Velho\n ");
        op = sc.nextInt();
        switch(op){
            case 1 ->{
                System.out.println(dinheiroBR.format(i.mostraPreco()));
                System.out.println(dinheiroBR.format(n.mostraNovoPreco()));
            }
            case 2 ->{
                System.out.println(dinheiroBR.format(i.mostraPreco()));
                System.out.println(dinheiroBR.format(v.mostraDesconto()));
                        
            }
        }
    }
}
