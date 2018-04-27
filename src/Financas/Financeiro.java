
package Financas;


public abstract class Financeiro implements Cadastro {
    private String fin_emissao, fin_vencimento,
            fin_pagamento, fin_historico;
    private int fin_codigo, fin_numero;
    private float fin_valor, fin_juros, fin_desconto;

    public Financeiro() {
        
    }
   

    public String getFin_emissao() {
        return fin_emissao;
    }

    public String getFin_vencimento() {
        return fin_vencimento;
    }

    public String getFin_pagamento() {
        return fin_pagamento;
    }

    public String getFin_historico() {
        return fin_historico;
    }

    public float getFin_valor() {
        return fin_valor;
    }

    public float getFin_juros() {
        return fin_juros;
    }

    public float getFin_desconto() {
        return fin_desconto;
    }

    

    public void setFin_emissao(String fin_emissao) {
        this.fin_emissao = fin_emissao;
    }

    public void setFin_vencimento(String fin_vencimento) {
        this.fin_vencimento = fin_vencimento;
    }

    public void setFin_pagamento(String fin_pagamento) {
        this.fin_pagamento = fin_pagamento;
    }

    public void setFin_historico(String fin_historico) {
        this.fin_historico = fin_historico;
    }

    public void setFin_valor(float fin_valor) {
        this.fin_valor = fin_valor;
    }

    public void setFin_juros(float fin_juros) {
        this.fin_juros = fin_juros;
    }

    public void setFin_desconto(float fin_desconto) {
        this.fin_desconto = fin_desconto;
    }

    public int getFin_codigo() {
        return fin_codigo;
    }

    public int getFin_numero() {
        return fin_numero;
    }

    public void setFin_codigo(int fin_codigo) {
        this.fin_codigo = fin_codigo;
    }

    public void setFin_numero(int fin_numero) {
        this.fin_numero = fin_numero;
    }

    
    



    @Override
    public void entrar() {
        System.out.println("Digite o código: ");
        setFin_codigo(leia.nextInt());
        
       System.out.println("Digite o numero: ");
        setFin_numero(leia.nextInt());
        
        System.out.println("Digite a data de emissão: ");
        setFin_emissao(leia.next());
        
        System.out.println("Digite a data de vencimento: ");
        setFin_vencimento(leia.next());
        
        System.out.println("Digite a data de pagamento: ");
        setFin_pagamento(leia.next());
        
        System.out.println("Digite o valor liquido: ");
        setFin_valor(leia.nextFloat());
        
        System.out.println("Digite o valor do juros: ");
        setFin_juros(leia.nextFloat());

        System.out.println("Digite o valor do desconto: ");
        setFin_desconto(leia.nextFloat());
        
        System.out.println("Digite o histórico: ");
        setFin_historico (leia.next());
    }

    @Override
    public void imprimir() {
        System.out.println("Código: " +getFin_codigo());
        System.out.println("Numero: " +getFin_numero());
        System.out.println("Data de emissão: " +getFin_emissao());
        System.out.println("Data de vencimento: " +getFin_vencimento());
        System.out.println("Data de pagamento: " +getFin_pagamento());
        System.out.println("Valor liquido: " +getFin_valor());
        System.out.println("Valor do juros: " +getFin_juros());
        System.out.println("Valor do desconto: " +getFin_desconto());
        System.out.println("Historico: " +getFin_historico());
       
        
    }
    
      
    
}
