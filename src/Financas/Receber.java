package Financas;

public class Receber extends Financeiro implements Cadastro {

    private String rec_cliente, rec_nf;

    public Receber(){
    }

    public String getRec_cliente() {
        return rec_cliente;
    }

    public String getRec_nf() {
        return rec_nf;
    }

    public void setRec_cliente(String rec_cliente) {
        this.rec_cliente = rec_cliente;
    }

    public void setRec_nf(String rec_nf) {
        this.rec_nf = rec_nf;
    }

    @Override
    public void entrar() {
        super.entrar();
        System.out.println("Digite o Cliente: ");
        setRec_cliente(leia.next());
        System.out.println("Digite o NF: ");
        setRec_nf(leia.next());

    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Cliente: " + getRec_cliente());
        System.out.println("NF: " + getRec_nf());

    }
}
