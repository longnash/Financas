package Financas;

public abstract class Pessoa implements Cadastro {

    private int pes_codigo;
    private String pes_nome, pes_endereco, pes_bairro, pes_cidade, pes_uf,
            pes_cep, pes_email, pes_celular, pes_fone;

    public Pessoa(){
    }

    public int getPes_codigo() {
        return pes_codigo;
    }

    public String getPes_nome() {
        return pes_nome;
    }

    public String getPes_endereco() {
        return pes_endereco;
    }

    public String getPes_bairro() {
        return pes_bairro;
    }

    public String getPes_cidade() {
        return pes_cidade;
    }

    public String getPes_uf() {
        return pes_uf;
    }

    public String getPes_cep() {
        return pes_cep;
    }

    public String getPes_email() {
        return pes_email;
    }

    public String getPes_celular() {
        return pes_celular;
    }

    public String getPes_fone() {
        return pes_fone;
    }

    public void setPes_codigo(int pes_codigo) {
        this.pes_codigo = pes_codigo;
    }

    public void setPes_nome(String pes_nome) {
        this.pes_nome = pes_nome;
    }

    public void setPes_endereco(String pes_endereco) {
        this.pes_endereco = pes_endereco;
    }

    public void setPes_bairro(String pes_bairro) {
        this.pes_bairro = pes_bairro;
    }

    public void setPes_cidade(String pes_cidade) {
        this.pes_cidade = pes_cidade;
    }

    public void setPes_uf(String pes_uf) {
        this.pes_uf = pes_uf;
    }

    public void setPes_cep(String pes_cep) {
        this.pes_cep = pes_cep;
    }

    public void setPes_email(String pes_email) {
        this.pes_email = pes_email;
    }

    public void setPes_celular(String pes_celular) {
        this.pes_celular = pes_celular;
    }

    public void setPes_fone(String pes_fone) {
        this.pes_fone = pes_fone;
    }

    @Override
    public void entrar() {
        System.out.println("Digite o codigo da pessoa: ");
        setPes_codigo(leia.nextInt());

        System.out.println("Digite o nome: ");
        setPes_nome(leia.next());
        System.out.println("Digite o endereço: ");
        setPes_endereco(leia.next());
        System.out.println("Digite o bairro: ");
        setPes_bairro(leia.next());
        System.out.println("Digite o cidade: ");
        setPes_cidade(leia.next());
        System.out.println("Digite o uf: ");
        setPes_uf(leia.next());
        System.out.println("Digite o cep: ");
        setPes_cep(leia.next());
        System.out.println("Digite o email: ");
        setPes_email(leia.next());
        System.out.println("Digite o celular: ");
        setPes_celular(leia.next());
        System.out.println("Digite o fone: ");
        setPes_fone(leia.next());

    }

    @Override
    public void imprimir() {
        System.out.println("Codigo: " + getPes_codigo());
        System.out.println("Nome: " + getPes_nome());
        System.out.println("Endereco: " + getPes_endereco());
        System.out.println("Bairro: " + getPes_bairro());
        System.out.println("Cidade: " + getPes_cidade());
        System.out.println("UF: " + getPes_uf());
        System.out.println("CEP: " + getPes_cep());
        System.out.println("Email: " + getPes_email());
        System.out.println("Celular: " + getPes_celular());
        System.out.println("Fone: " + getPes_fone());

    }


}
