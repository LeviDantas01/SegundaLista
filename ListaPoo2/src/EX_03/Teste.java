package EX_03;

import Ex_01.Ingresso;
import Ex_01.IngressoNormal;
import Ex_01.IngressoVip;
import Ex_01.CamaroteInferior;
import Ex_01.CamaroteSuperior;
import java.util.Scanner;



public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ingresso i = new Ingresso();
        IngressoNormal in = new IngressoNormal();
        IngressoVip iv = new IngressoVip();
        CamaroteInferior ci = new CamaroteInferior();
        CamaroteSuperior cs = new CamaroteSuperior();
        int op;
        System.out.println("======== IH VAI ROLAR A FESTA ========");
        System.out.print("Seja bem vindo!! escolha seu ingresso\n 1- Normal\n 2- VIP\n");
        op = sc.nextInt();
        switch (op) {
            case 1 -> in.impriveValorNormal();
            case 2 -> {
                iv.imprimeValorVip();
                System.out.print("já que você escolheu o VIP temos duas opções escolha a desejada: \n"
                        + " 1- Camarote Superior\n 2- Camarote Inferior\n");
                op = sc.nextInt();
            switch (op) {
                case 1 -> cs.impriveValorCamaroteSuperior();
                case 2 -> ci.imprimeLocalizacao();
                default -> System.out.println("Opção invalida");
            }
            }
            default -> System.out.println("Opção invalida");
        }
    }
}
