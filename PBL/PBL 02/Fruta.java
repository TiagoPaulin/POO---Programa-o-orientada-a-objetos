public class Fruta {
    private boolean unitario;
    private String nome;
    private float peso;
    private int qtde;

    public Fruta(boolean unitario, String nome, float peso, int qtde) {
        this.unitario = unitario;
        this.nome = nome;
        this.peso = peso;
        this.qtde = qtde;
    }

    @Override
    public String toString() {
        return nome;
    }
}
