public class Vestido extends Roupa {
    private String tipoDecote;

    public Vestido(String tamanho, String cor, String nome, String marca, float preco, String tipoDecote) {
        super(tamanho, cor, nome, marca, preco);
        this.tipoDecote = tipoDecote;
    }

    @Override
    public float calcularPrecoFinal(float acrescimo) {
        float preco = getPreco();
        float total = (preco + acrescimo) * 0.8f;
        return total;
    }
}
