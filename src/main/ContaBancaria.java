package main;

public class ContaBancaria implements Pagamento{
    private String instituicaoBancaria;
    private String agencia;
    private String numeroConta;
    private float saldoBancario;
    private String senhaCartao;

    public ContaBancaria(String instituicaoBancaria, String agencia, String numeroConta, float saldoBancario,
            String senhaCartao) {
        this.instituicaoBancaria = instituicaoBancaria;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldoBancario = saldoBancario;
        this.senhaCartao = senhaCartao;
    }
    
    public String getSenhaCartao() {
        return senhaCartao;
    }
    public String getInstituicaoBancaria() {
        return instituicaoBancaria;
    }
    public void setInstituicaoBancaria(String instituicaoBancaria) {
        this.instituicaoBancaria = instituicaoBancaria;
    }
    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public String getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }
    public float getSaldoBancario() {
        return saldoBancario;
    }
    public void setSaldoBancario(float saldoBancario) {
        this.saldoBancario = saldoBancario;
    }

    @Override
    public float consultaLimite() {
        return saldoBancario;
    }
    @Override
    public String pagaProduto(float valorProduto, String senhaCartao) {
        if (saldoBancario >= valorProduto) {
            saldoBancario = saldoBancario - valorProduto;
            return "Produto pago com sucesso";
        }
        return "Saldo insuficiente para pagar produto";
    }
}
