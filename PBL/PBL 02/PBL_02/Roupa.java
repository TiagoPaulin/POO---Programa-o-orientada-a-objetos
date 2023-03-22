public class Roupa {
    private String nome;
    private String marca;
    private String cor;
    private char tamanho;
    private float valor;
    private int qtdCompra;

    public Roupa(String nome, String marca, String cor, char tamanho, float valor, int qtdCompra) {
        this.nome = nome;
        this.marca = marca;
        this.cor = cor;
        this.tamanho = tamanho;
        this.valor = valor;
        this.qtdCompra = qtdCompra;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}
