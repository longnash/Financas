package Financas;

public class Pagar extends Financeiro implements Cadastro {

    private String pag_fornecedor, pag_boleto;

    public Pagar() {

    }


    public String getPag_fornecedor() {
        return pag_fornecedor;
    }

    public String getPag_boleto() {
        return pag_boleto;
    }

    public void setPag_fornecedor(String pag_fornecedor) {
        this.pag_fornecedor = pag_fornecedor;
    }

    public void setPag_boleto(String pag_boleto) {
        this.pag_boleto = pag_boleto;
    }

    @Override
    public void entrar() {
        super.entrar();
        System.out.println("Digite o Fornecedor: ");
        setPag_fornecedor(leia.next());
        System.out.println("Digite o Boleto: ");
        setPag_boleto(leia.next());

    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Fornecedor: " + getPag_fornecedor());
        System.out.println("Boleto: " + getPag_boleto());

    }

}
