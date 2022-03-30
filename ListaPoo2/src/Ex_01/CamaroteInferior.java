package Ex_01;
public class CamaroteInferior extends IngressoVip {
    protected String localizacao;

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void imprimeLocalizacao(){
        System.out.println("Você está no camarote inferior");
    }
    
    
}
