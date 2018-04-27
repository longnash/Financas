package Financas;

public class Fornecedor extends Juridica implements Cadastro {

    private String for_contato, for_site, for_limitecompra, for_dtcadastro;

    public Fornecedor(){
    }

    public String getFor_contato() {
        return for_contato;
    }

    public String getFor_site() {
        return for_site;
    }

    public String getFor_limitecompra() {
        return for_limitecompra;
    }

    public String getFor_dtcadastro() {
        return for_dtcadastro;
    }

    public void setFor_contato(String for_contato) {
        this.for_contato = for_contato;
    }

    public void setFor_site(String for_site) {
        this.for_site = for_site;
    }

    public void setFor_limitecompra(String for_limitecompra) {
        this.for_limitecompra = for_limitecompra;
    }

    public void setFor_dtcadastro(String for_dtcadastro) {
        this.for_dtcadastro = for_dtcadastro;
    }

    @Override
    public void entrar() {
        super.entrar();
        System.out.println("Digite um contato: ");
        setFor_contato(leia.next());
        System.out.println("Digite seu site: ");
        setFor_site(leia.next());
        System.out.println("Digite o limite de compras: ");
        setFor_limitecompra(leia.next());
        System.out.println("Digite a data do cadastro: ");
        setFor_dtcadastro(leia.next());
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Contato: " + getFor_contato());
        System.out.println("Site: " + getFor_site());
        System.out.println("Limite de compra: " + getFor_limitecompra());
        System.out.println("Data de cadastro: " + getFor_dtcadastro());

    }

}


