
package Financas;


public class Cliente extends Juridica implements Cadastro {
    private float cli_limitecredito;
    private String cli_cobr_endereco, cli_cobr_bairro, cli_cobr_cidade, cli_cobr_uf, cli_cobr_cep;

    public Cliente() {
        
    }

    public float getCli_limitecredito() {
        return cli_limitecredito;
    }

    public String getCli_cobr_endereco() {
        return cli_cobr_endereco;
    }

    public String getCli_cobr_bairro() {
        return cli_cobr_bairro;
    }

    public String getCli_cobr_cidade() {
        return cli_cobr_cidade;
    }

    public String getCli_cobr_uf() {
        return cli_cobr_uf;
    }

    public String getCli_cobr_cep() {
        return cli_cobr_cep;
    }

    public void setCli_limitecredito(float cli_limitecredito) {
        this.cli_limitecredito = cli_limitecredito;
    }

    public void setCli_cobr_endereco(String cli_cobr_endereco) {
        this.cli_cobr_endereco = cli_cobr_endereco;
    }

    public void setCli_cobr_bairro(String cli_cobr_bairro) {
        this.cli_cobr_bairro = cli_cobr_bairro;
    }

    public void setCli_cobr_cidade(String cli_cobr_cidade) {
        this.cli_cobr_cidade = cli_cobr_cidade;
    }

    public void setCli_cobr_uf(String cli_cobr_uf) {
        this.cli_cobr_uf = cli_cobr_uf;
    }

    public void setCli_cobr_cep(String cli_cobr_cep) {
        this.cli_cobr_cep = cli_cobr_cep;
    }
    @Override
    public void entrar() {
        super.entrar();
        System.out.println("Digite o limite de crédito: ");
        setCli_limitecredito(leia.nextFloat());
        System.out.println("Digite o endereço para cobrança: ");
        setCli_cobr_endereco(leia.next());
        System.out.println("Digite o bairro para cobrança: ");
        setCli_cobr_bairro(leia.next());
        System.out.println("Digite a cidade para cobrança: ");
        setCli_cobr_cidade(leia.next());
        System.out.println("Digite a UF para cobrança: ");
        setCli_cobr_uf(leia.next());
        System.out.println("Digite o CEP para cobrança: ");
        setCli_cobr_cep(leia.next());
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Limite de crédito: " + getCli_limitecredito());
        System.out.println("Endereço para cobrança: " + getCli_cobr_endereco());
        System.out.println("Bairro para cobrança: " + getCli_cobr_bairro());
        System.out.println("Cidade para cobrança: " + getCli_cobr_cidade());
        System.out.println("UF para cobrança: " + getCli_cobr_uf());
        System.out.println("CEP para cobrança: " + getCli_cobr_cep());

    }
    
}
