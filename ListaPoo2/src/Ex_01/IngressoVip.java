package Ex_01;
public class IngressoVip extends Ingresso{
    protected double valorIngressoVip = 10;

    public double getValorVip() {
        return valorIngressoVip;
    }

    public void setValorVip(double valorVip) {
        this.valorIngressoVip = valorVip;
    }
    
    
    public void imprimeValorVip(){
        this.valorIngressoVip = this.getValorIngreso() + this.valorIngressoVip;
        System.out.println("O ingresso vip custa R$"+this.valorIngressoVip);
    }
   
    
    
   
    
}
