import java.util.Random;
import java.util.Scanner;
import java.lang.Runtime;

public class Main {
//    Vocês estão desenvolvendo um gerenciador de partidas de League of Legends em Java,
//    seguindo os princípios de orientação a objetos, incluindo classes, encapsulamento,
//    interação entre objetos e coleção de objetos. O programa deve permitir que os usuários
//    criem times com cinco campeões (personagens) cada e disputem partidas entre si. Cada
//    partida consiste em dois times, sendo que cada time possui cinco campeões. Certifiquem-
//    se de que o programa permita a criação de novos campeões, times e partidas, além de
//    gerenciar a interação entre eles.


    public static void main(String[] args) {

        Mapa mapa = new Mapa("Wildrift");

        Campeao campeao1 = new Campeao("Yasuo");
        Campeao campeao2 = new Campeao("Nasus");
        Campeao campeao3 = new Campeao("Lux");
        Campeao campeao4 = new Campeao("Samira");
        Campeao campeao5 = new Campeao("Rammus");
        Campeao campeao6 = new Campeao("Ekko");
        Campeao campeao7 = new Campeao("Vi");
        Campeao campeao8 = new Campeao("Jhinx");
        Campeao campeao9 = new Campeao("Tristana");
        Campeao campeao10 = new Campeao("Mordekaiser");

        Time time1 = new Time("Afundados");
        Time time2 = new Time("Desafundados");

        time1.adicionarCampeao(campeao1);
        time1.adicionarCampeao(campeao2);
        time1.adicionarCampeao(campeao3);
        time1.adicionarCampeao(campeao4);
        time1.adicionarCampeao(campeao5);

        time2.adicionarCampeao(campeao6);
        time2.adicionarCampeao(campeao7);
        time2.adicionarCampeao(campeao8);
        time2.adicionarCampeao(campeao9);
        time2.adicionarCampeao(campeao10);

        statusPartida(time1, time2, mapa);

        decorrerPartida(time1, time2, mapa);

    }

//    public static void limparTerminal(){
//        Runtime runtime = Runtime.getRuntime();
//        runtime.exec("cls");
//    }
    public static void statusPartida(Time time1, Time time2, Mapa mapa) {
        Scanner sacanner = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("                === INÍCIO DE PARTIDA === ");
        System.out.println("Mapa: " + mapa.getNome());
        System.out.println("TIMES:      " + time1.getNome() + "      VS         " + time2.getNome());
        System.out.println(" ");
        for (int i = 0; i < 5; i ++) {
            System.out.println("  " + time1.time.get(i).getNome() + "life: " + time1.time.get(i).getVida() + "  " + time2.time.get(i).getNome() + "life: " + time2.time.get(i).getVida());
        }

        System.out.print("  Vida do Time: " + time1.vidaTime());
        System.out.println("              Vida do time: " + time2.vidaTime());

        System.out.println("Pressione a tecla 'ENTER' do seu teclado para ir para o próximo turno");
        sacanner.nextLine();

    }

    public static void decorrerPartida(Time time1, Time time2, Mapa mapa) {
        Random gerador = new Random();

        while ((time1.vidaTime() > 0) || (time2.vidaTime() > 0)) {
            Scanner sacanner = new Scanner(System.in);

            Campeao campeaoA = time1.time.get(gerador.nextInt(5));
            Campeao campeaoB = time2.time.get(gerador.nextInt(5));

            int danoA = gerador.nextInt(50);
            int danoB = gerador.nextInt(50);

            if (campeaoA.getVida() == 0){
                campeaoA = time1.time.get(gerador.nextInt(5));
            } if (campeaoB.getVida() == 0) {
                campeaoB = time2.time.get(gerador.nextInt(5));
            }
            campeaoA.setVida(campeaoA.getVida() - danoA);
            campeaoB.setVida(campeaoB.getVida() - danoB);

            System.out.println(" ");
            System.out.println("                === PARTIDA EM JOGO === ");
            System.out.println("Mapa: " + mapa.getNome());
            System.out.println("TIMES:      " + time1.getNome() + "      VS         " + time2.getNome());
            System.out.println(" ");
            for (int i = 0; i < 5; i ++) {
                System.out.println("  " + time1.time.get(i).getNome() + "life: " + time1.time.get(i).getVida() + "  " + time2.time.get(i).getNome() + "life: " + time2.time.get(i).getVida());
            }

            System.out.print("  Vida do Time: " + time1.vidaTime());
            System.out.println("              Vida do time: " + time2.vidaTime());

            System.out.println("Pressione a tecla 'ENTER' do seu teclado para ir para o próximo turno");
            sacanner.nextLine();
            if (time1.vidaTime() == 0) {
                System.out.println("O time 1 venceu a partida!");
                break;
            } if (time2.vidaTime() == 0) {
                System.out.println("O time 2 venceu a partida!");
                break;
            }
        }


    }
}
