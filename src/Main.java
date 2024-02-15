import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro("civic");
        Carro c2 = new Carro("gol");
        Carro c3 = new Carro("palio");
        Carro c4 = new Carro("uno");


        ArrayList<Carro> listaCarro = new ArrayList<>();
        listaCarro.add(c1);
        listaCarro.add(c2);
        listaCarro.add(c3);
        listaCarro.add(c4);
        System.out.println("Letra A do exercicio 6");
        listaCarro.forEach(System.out::println);

        System.out.println("\nLetra C do exercicio 6");
        int cont = 0;
        while (cont < listaCarro.size()) {
            Carro carro = listaCarro.get(cont);
            if (carro.getNome().equals("gol")) {
                carro.setNome("ls200");
            }
            cont += 1 ;
        }
        listaCarro.forEach(System.out::println);

        System.out.println("\nLetra D do exercicio 6");
        Carro gol = new Carro("gol");
        listaCarro.add(gol);
        listaCarro.forEach(System.out::println);
    }
}