package Ex_01;
public class CamaroteSuperior extends IngressoVip{
    protected double valorCamaroteSuperior = 10;

    public double getValorCamaroteSuperior() {
        return valorCamaroteSuperior;
    }

    public void setValorCamaroteSuperior(double valorCamaroteSuperior) {
        this.valorCamaroteSuperior = valorCamaroteSuperior;
    }
    
    
    public void impriveValorCamaroteSuperior(){
        this.valorCamaroteSuperior += this.valorIngressoVip * this.valorIngressoVip;
        System.out.println("O valor do camarote superior é R$"+this.valorCamaroteSuperior);
    }
}
