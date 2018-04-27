
package Financas;

public abstract class Juridica extends Pessoa implements Cadastro {
    private String pes_cnpj, pes_inscest;

    public Juridica(){
    }

    public String getPes_cnpj() {
        return pes_cnpj;
    }

    public String getPes_inscest() {
        return pes_inscest;
    }

    public void setPes_cnpj(String pes_cnpj) {
        this.pes_cnpj = pes_cnpj;
    }

    public void setPes_inscest(String pes_inscest) {
        this.pes_inscest = pes_inscest;
    }
    
    @Override
    public void entrar() {
        super.entrar();
        System.out.println("Digite o cnpj: ");
        setPes_cnpj(leia.next());        
        System.out.println("Digite o Inscrição Estadual: ");
        setPes_inscest(leia.next());      
        
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("CNPJ: "+ getPes_cnpj());
        System.out.println("Inscrição Estadual: "+ getPes_inscest());        
        
    }

    
    
}
