package Ex_01;
public class Ingresso {
    protected double valorIngreso = 15;

    public double getValorIngreso() {
        return valorIngreso;
    }

    public void setValorIngreso(double valorIngreso) {
        this.valorIngreso = valorIngreso;
    }
    
    public void imprimeValor(){
        System.out.println("O ingresso normal custa R$"+ this.valorIngreso);
    }
}
