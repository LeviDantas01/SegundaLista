package EX_02;
public class Imovel {
    protected String endereco = "Quemadinha";
    protected double preco = 15000;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
    
    public String mostraEndereco(){
        return this.endereco;
    }
    public void mostraPreco(){
        System.out.println("O valor do imovel é R$" + this.preco);
        
    }
    
}
