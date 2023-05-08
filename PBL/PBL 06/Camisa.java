public class Camisa extends Roupa{
    private String tipoGola;

    public Camisa(String tamanho, String cor, String nome, String marca, float preco, String tipoGola) {
        super(tamanho, cor, nome, marca, preco);
        this.tipoGola = tipoGola;
    }

    @Override
    public float calcularPrecoFinal(float acrescimo) {
        float preco = getPreco();
        float total = (preco + acrescimo) * 0.9f;
        return total;
    }
}
