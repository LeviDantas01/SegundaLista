package EX_02;
public class Velho extends Imovel{
    protected double desconto = 150;

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    
    public void mostraDesconto(){
        double calculaDesconto = this.getPreco() - this.desconto;
        System.out.println("O valor do imovel com desconto é R$"+ calculaDesconto);
    }
    
    
}
