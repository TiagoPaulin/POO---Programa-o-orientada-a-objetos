import java.util.ArrayList;

public class Time {
    ArrayList<Campeao> time = new ArrayList<>();
    private String nome;

    public Time(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public void adicionarCampeao(Campeao campeao) {
        if (time.size() < 5) {
            time.add(campeao);
            System.out.println("Campeão adicionado com sucesso");
        } else {
            System.out.println("Não é possível adicionar mais campeões, o time " + nome + " está lotado");
        }
    }
    // cria uma função que soma toda a vida do time
    public int vidaTime() {
        int vida = 0;
        for (Campeao camp : time) {
            vida += camp.getVida();
        }
        return vida;
    }
}
