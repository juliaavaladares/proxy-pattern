package main;

public class CartaoDeDebitoProxy implements Pagamento{

    private ContaBancaria contaBancaria;

    public CartaoDeDebitoProxy(ContaBancaria contaBancaria) {
        this.contaBancaria = contaBancaria;
    }

    @Override
    public float consultaLimite() {
        return contaBancaria.consultaLimite();
    }

    @Override
    public String pagaProduto(float valorProduto, String senhaCartao) {
        if (senhaCartao != contaBancaria.getSenhaCartao()) {
            throw new IllegalArgumentException("Senha Incorreta");
        }

        return contaBancaria.pagaProduto(valorProduto, senhaCartao);
    }
    
}
