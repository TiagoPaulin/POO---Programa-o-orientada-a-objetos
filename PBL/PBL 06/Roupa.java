public abstract class Roupa implements Produto {
    private String tamanho;
    private String cor;
    private String nome;
    private String marca;
    protected float preco;

    public Roupa(String tamanho, String cor, String nome, String marca, float preco) {
        this.tamanho = tamanho;
        this.cor = cor;
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public float getPreco() {
        return preco;
    }

    @Override
    public void setPreco(float preco) {
        this.preco = preco;
    }
    public abstract float calcularPrecoFinal(float acrescimo);
}
