package EX_02;
public class Novo extends Imovel{
    
    protected double adicionalPreco = 950;

    public double getAdicionalPreco() {
        return adicionalPreco;
    }

    public void setAdicionalPreco(double adicionalPreco) {
        this.adicionalPreco = adicionalPreco;
    }
    
    public void mostraNovoPreco(){
        this.adicionalPreco += this.getPreco() + this.adicionalPreco;
        System.out.println("O preco do imovel com um adicional custa R$" + this.adicionalPreco);
    }
}
