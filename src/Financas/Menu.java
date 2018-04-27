
package Financas;
import java.util.ArrayList;
import java.util.Arrays;

public class Menu implements Interface {
    
    public Menu () {
        
    }
    
    public void submenu () {
    int resp = 0;
    String r1, r2, r3, r4, r5, r6, r7;
    do{    System.out.println("Selecione uma opção");
        System.out.println("1) Cadastro de Funcionário");
        System.out.println("2) Cadastro de Clientes");
        System.out.println("3) Cadastro de Fornecedores");
        System.out.println("4) Contas a Receber");
        System.out.println("5) Contas a Pagar");
        System.out.println("6) Fluxo de Caixa");
        System.out.println("7) Sair");
        resp = leia.nextInt();
    } while ((resp < 1) || (resp > 7));
    
    switch (resp) {
        case 1: 
            System.out.println("a. Incluir");
            System.out.println("b. Alterar pelo Código");
            System.out.println("c. Consulta pela posição no ArrayList");
            System.out.println("d. Consulta pelo Código");
            System.out.println("e. Consulta pelo Nome");
            System.out.println("f. Excluir");
            r1 = leia.next();
            r1 = r1.toUpperCase();
            switch (r1) {
                case "A":
                    String mais;
                    ArrayList<Funcionario> func = new ArrayList<Funcionario>();
                   do{ Funcionario fun = new Funcionario();
                    fun.entrar();
                    func.add(fun);
                       System.out.println("Deseja adicionar mais um funcionario? (S/N)");
                       mais = leia.next().toUpperCase();  
                    } while (mais.equals("S"));
                    for (int i=0;i<func.size();i++){
                        System.out.println("Funcionário cadastrado: " +func.get(i).getPes_nome()); 
                    }
                  
                    voltar();
                    break;  
                case "B":
                    
            }
                break;
        case 2:
            System.out.println("a. Incluir");
            System.out.println("b. Alterar pelo Código");
            System.out.println("c. Consulta pela posição no ArrayList");
            System.out.println("d. Consulta pelo Código");
            System.out.println("e. Consulta pelo Nome");
            System.out.println("f. Excluir");
            r2 = leia.next();
            r2 = r2.toUpperCase();
                break;
        case 3:
            System.out.println("a. Incluir");
            System.out.println("b. Alterar pelo Código");
            System.out.println("c. Consulta pela posição no ArrayList");
            System.out.println("d. Consulta pelo Nome");
            System.out.println("e. Excluir");
            r3 = leia.next();
            r3 = r3.toUpperCase();
                break;
        case 4:
            System.out.println("a. Incluir");
            System.out.println("b. Alterar pelo Código");
            System.out.println("c. Consulta pela posição no ArrayList");
            System.out.println("d. Consulta pelo Número");
            System.out.println("e. Consulta pelo Valor");
            System.out.println("f. Consulta pela NF");
            System.out.println("g. Excluir");
            r4 = leia.next();
            r4 = r4.toUpperCase();
                break;
        case 5:
            System.out.println("a. Incluir");
            System.out.println("b. Alterar pelo Código");
            System.out.println("c. Consulta pela posição no ArrayList");
            System.out.println("d. Consulta pelo Número");
            System.out.println("e. Consulta pela Data de Vencimento");
            System.out.println("f. Consulta pela Valor");
            System.out.println("g. Excluir");
            r5 = leia.next();
            r5 = r5.toUpperCase();
                break;
        case 6:
            System.out.println("FLUXO DE CAIXA EM OBRAS");
                break;
        case 7:
            System.out.println("Programa finalizado...");
            System.exit(0);
                break;     
    }
    }
    @Override
    public void incluir() {
        
    }

    @Override
    public void alterar() {
        
    }

    @Override
    public void consultarPosicao() {
        
    }

    @Override
    public void excluir() {
        
    }
    
    public void voltar(){
        String volte;
        do {System.out.println("Deseja voltar ao menu inicial? (S/N)");
        volte = leia.next();
        volte = volte.toUpperCase();
        } while ((!"S".equals(volte)) && (!"N".equals(volte)));
        if ("S".equals(volte)) {
            submenu();
        } else {
            System.out.println("Programa finalizado...");
            System.exit(0);
        }
        
    }
    
}
