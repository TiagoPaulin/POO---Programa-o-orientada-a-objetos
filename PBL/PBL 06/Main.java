import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Roupa> roupas = new ArrayList<>();
        Camisa camisa = new Camisa("G", "Vermelho", "camisabonita", "pollo", 95f, "gola em v");
        Calca calca = new Calca("G", "azul", "calcacurta", "ellus", 95f, "boca de sino");
        Vestido vestido = new Vestido("G", "preto", "vestidolindo", "calvinklein", 95f, "decote em v");
        roupas.add(camisa);
        roupas.add(calca);
        roupas.add(vestido);

        for (Roupa roupa : roupas) {

            System.out.println("Nome: " + roupa.getNome() + "   Preco: " + roupa.calcularPrecoFinal(5f) + "\n");
        }
    }
}
