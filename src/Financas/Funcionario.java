package Financas;

public class Funcionario extends Fisica implements Cadastro {

    private String fun_ctps, fun_dtadmissao, fun_dtdemissao;
    private float fun_salario;

    public Funcionario(){
    }


    public String getFun_ctps() {
        return fun_ctps;
    }

    public String getFun_dtadmissao() {
        return fun_dtadmissao;
    }

    public String getFun_dtdemissao() {
        return fun_dtdemissao;
    }

    public float getFun_salario() {
        return fun_salario;
    }

    public void setFun_ctps(String fun_ctps) {
        this.fun_ctps = fun_ctps;
    }

    public void setFun_dtadmissao(String fun_dtadmissao) {
        this.fun_dtadmissao = fun_dtadmissao;
    }

    public void setFun_dtdemissao(String fun_dtdemissao) {
        this.fun_dtdemissao = fun_dtdemissao;
    }

    public void setFun_salario(float fun_salario) {
        this.fun_salario = fun_salario;
    }

    @Override
    public void entrar() {
        super.entrar();
        System.out.println("Digite os dados de sua Carteira de Trabalho: ");
        setFun_ctps(leia.next());
        System.out.println("Digite a data de admissão: ");
        setFun_dtadmissao(leia.next());
        System.out.println("Digite a data de demissão: ");
        setFun_dtdemissao(leia.next());
        System.out.println("Digite o salário: ");
        setFun_salario(leia.nextFloat());
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Carteira de Trabalho: " + getFun_ctps());
        System.out.println("Data de admissão: " + getFun_dtadmissao());
        System.out.println("Data de demissão: " + getFun_dtdemissao());
        System.out.println("Salário: " + getFun_salario());

    }

}
