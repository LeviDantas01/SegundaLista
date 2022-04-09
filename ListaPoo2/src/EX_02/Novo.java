package EX_02;
public class Novo extends Imovel{
    
    protected double adicionalPreco = 950;

    public double getAdicionalPreco() {
        return adicionalPreco;
    }

    public void setAdicionalPreco(double adicionalPreco) {
        this.adicionalPreco = adicionalPreco;
    }
    
    public double mostraNovoPreco(){
        this.adicionalPreco = this.getPreco() + this.adicionalPreco;
        return this.adicionalPreco;
    }
}
