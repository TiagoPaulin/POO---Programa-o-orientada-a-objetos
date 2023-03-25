public class Campeao {
    private String nome;
    private int vida;

    public Campeao(String nome) {
        for (int i = nome.length(); i < 20; i++) {
            nome += " ";
        }
        this.nome = nome;
        this.vida = 100;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
        if (this.vida < 0) {
            this.vida = 0;
        }
    }

    public void descricaoCampeao() {
        System.out.println(getNome() + getVida());
    }
}
