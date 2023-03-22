public class Main {
//    Hoje é o Dia Internacional do Consumidor e vocês estão comprando alguns produtos para
//    aproveitar as promoções. Escolham ao menos 5 produtos de categorias diversas para
//    inserir no seu carrinho. Façam um rascunho de quais são as características e ações de
//    cada um dos produtos. Depois disso, utilizando Java, vocês devem criar um programa que
//    implemente todos os objetos escolhidos.

    // produtos escolhidos: fruta, bebida, veiculo, eletronico, roupa

    public static void main(String[] args) {

        Carrinho carrinho1 = new Carrinho();

        //Popula a classe de Roupa
        Roupa roupa1 = new Roupa("camisa manga curta", "lacoste", "branca", 'G', 249.90f, 2);
        Roupa roupa2 = new Roupa("camisa manga longa", "nike", "preta", 'G', 189.90f, 1);
        Roupa roupa3 = new Roupa("camisa regata", "adidas", "branca", 'G', 249.90f, 2);

        //Popula a classe de Fruta
        Fruta fruta1 = new Fruta(false, "Banana", 0.1f, 6);
        Fruta fruta2 = new Fruta(true, "laranja", 0.3f, 4);
        Fruta fruta3 = new Fruta(true, "Melancia", 0.85f, 1);

        //Popula a classe de Bebida
        Bebida bebida1 = new Bebida("Cerveja", "Skol", 269f, 3.99f, 3);
        Bebida bebida2 = new Bebida("Refrigerante", "Pepsi", 300f, 4.99f, 2);
        Bebida bebida3 = new Bebida("Suco de Uva", "Dell Vale", 1000f, 7.99f, 1);

        //Popula a classe de Veiculo
        Veiculo veiculo1 = new Veiculo("Monza", "Chevrolet","Monza" , "Bordo", false, 17000f);

        //Popula a classe de Eletronico
        Eletronico eletronico1 = new Eletronico("Moto G7", "Motorola", "Moto G", "Preto", 786.99f, 1);
        Eletronico eletronico2 = new Eletronico("MacBook Pro", "Apple", "MacBook", "Branco", 27899.90f, 1);

        //Adiciona roupa no carrinho
        carrinho1.adicionar(roupa1);
        carrinho1.adicionar(roupa2);
        carrinho1.adicionar(roupa3);

        //Adiciona fruta no carrinho
        carrinho1.adicionar(fruta1);
        carrinho1.adicionar(fruta2);
        carrinho1.adicionar(fruta3);

        //Adiciona bebida no carrinho
        carrinho1.adicionar(bebida1);
        carrinho1.adicionar(bebida2);
        carrinho1.adicionar(bebida3);

        //Adiciona veiculo no carrinho
        carrinho1.adicionar(veiculo1);

        //Adiciona eletronico no carrinho
        carrinho1.adicionar(eletronico1);
        carrinho1.adicionar(eletronico2);

        System.out.println(carrinho1.toString());
    }



}