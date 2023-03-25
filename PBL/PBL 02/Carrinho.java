import java.util.ArrayList;

public class Carrinho {
    public ArrayList<Object> carrinho = new ArrayList<>();

    public void adicionar(Object produto){
        carrinho.add(produto);
    }

    @Override
    public String toString() {
        return "Carrinho{" +
                carrinho +
                '}';
    }
}
