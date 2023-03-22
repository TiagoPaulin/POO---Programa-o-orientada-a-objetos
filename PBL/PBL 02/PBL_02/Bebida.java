public class Bebida {
    private String nome;
    private String marca;
    private float qtdMl;
    private float valor;
    private int qtd;

    public Bebida(String nome, String marca, float qtdMl, float valor, int qtd) {
        this.nome = nome;
        this.marca = marca;
        this.qtdMl = qtdMl;
        this.valor = valor;
        this.qtd = qtd;
    }

    @Override
    public String toString() {
        return nome;
    }
}
