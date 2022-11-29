package main;

public interface Pagamento{
    String pagaProduto(float valorProduto, String senhaCartao);
    float consultaLimite();
}