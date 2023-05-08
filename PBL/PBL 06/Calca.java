public class Calca extends Roupa {
    private String tipoCalca;

    public Calca(String tamanho, String cor, String nome, String marca, float preco, String tipoCalca) {
        super(tamanho, cor, nome, marca, preco);
        this.tipoCalca = tipoCalca;
    }

    @Override
    public float calcularPrecoFinal(float acrescimo) {
        float preco = getPreco();
        float total = (preco + acrescimo) * 0.85f;
        return total;
    }
}
