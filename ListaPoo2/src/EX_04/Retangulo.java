package EX_04;

import java.util.Scanner;

public class Retangulo implements Quadrilatero{
    float lado;
    float altura;

    public Retangulo(float lado, float altura) {
        this.lado = lado;
        this.altura = altura;
    }
    
    
    
    @Override
    public float calculaArea() {
        return this.lado * this.altura;
    }

    @Override
    public float calculaPerimetro() {
        return (this.lado + this.lado) * 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um número: ");
        float lado = sc.nextFloat();
        System.out.print("Informe outro: ");
        float altura = sc.nextFloat();
        Retangulo r1 = new Retangulo(lado, altura);
        System.out.println("Com os valores " + lado + " e "+ altura + " temos uma área de: " + r1.calculaArea());
        System.out.println("Com os lados: " + lado + " temos um perimetro de: " + r1.calculaPerimetro());
    }
    
}
