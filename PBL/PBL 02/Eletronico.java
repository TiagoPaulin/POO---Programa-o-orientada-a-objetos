public class Eletronico {
    private String nome;
    private String marca;
    private String modelo;
    private String cor;
    private float valor;
    private int qtdCompra;

    public Eletronico(String nome, String marca, String modelo, String cor, float valor, int qtdCompra) {
        this.nome = nome;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.valor = valor;
        this.qtdCompra = qtdCompra;
    }

    @Override
    public String toString() {
        return nome;
    }
}
