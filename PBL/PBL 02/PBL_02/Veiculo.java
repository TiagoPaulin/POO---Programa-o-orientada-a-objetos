public class Veiculo {
    private String nome;
    private String marca;
    private String modelo;
    private String cor;
    private boolean automatico;
    private float valor;

    public Veiculo(String nome, String marca, String modelo, String cor, boolean automatico, float valor) {
        this.nome = nome;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.automatico = automatico;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return nome;
    }
}
