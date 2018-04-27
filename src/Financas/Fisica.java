
package Financas;

public abstract class Fisica extends Pessoa implements Cadastro {
    
    private String pes_cpf, pes_rg;

    public Fisica() {
    }
    
    public String getPes_cpf() {
        return pes_cpf;
    }

    public String getPes_rg() {
        return pes_rg;
    }

    public void setPes_cpf(String pes_cpf) {
        this.pes_cpf = pes_cpf;
    }

    public void setPes_rg(String pes_rg) {
        this.pes_rg = pes_rg;
    }
    
    @Override
    public void entrar() {
        super.entrar(); 
        System.out.println("Digite o rg: ");
        setPes_rg(leia.next());        
        System.out.println("Digite o cpf: ");
        setPes_cpf(leia.next());
      
        
        
        
    }

    @Override
    public void imprimir() {
        super.imprimir();
        
        System.out.println("RG: "+ getPes_rg());
        System.out.println("CPF: "+ getPes_cpf());        
        
    }
    
}
