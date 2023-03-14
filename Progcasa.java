public class Progcasa {
    public static void main(String[] args) {
        System.out.println("Lista de Moveis");

        // link dos arquivos objetos
        Eletricos eletric = new Eletricos();
        Utensilios Utens = new Utensilios();

        // itens Eletric
        eletric.liquidificador = "Arno liquidificador";
        eletric.batedeira = "Philco bat";
        eletric.cafeteira = "Cafezinho";
        eletric.nunventiladores = 3;

        //itens Utens
        Utens.pote = "Azul";
        Utens.pratos = "conjunto";
        Utens.panelas = "Preta de ferro";
        Utens.Nundelampadas = 18;

        System.out.println("Tem na cozinha : Liquidificador " + eletric.liquidificador);
        System.out.println("Tem na Cozinha : Batedeira ? " + eletric.batedeira);
        System.out.println("cafeteira ? " + eletric.cafeteira);
        System.out.println("Quantas lampadas ? " + Utens.Nundelampadas);
        System.out.println("e Ventiladores ? " + eletric.nunventiladores);
        System.out.println("tem pratos ? " + Utens.pratos);
        System.out.println("Qual a cor dos potes ? " + Utens.pote);
        System.out.println("e Panelas ? " + Utens.panelas);
    }
}