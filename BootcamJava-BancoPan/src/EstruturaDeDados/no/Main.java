package EstruturaDeDados;

public class Main {
    public static void main(String[] args) {

        No no1 = new No("Conteudoo nó 1");

        No no2 = new No("Conteudoo nó 2");
        no1.setProximo(no2);

        No no3 = new No("Conteudoo nó 3");
        no2.setProximo(no3);

        No no4 = new No("Conteudoo nó 4");
        no3.setProximo(no4);

        // no1 -> no2 -> no3 -> no4 -> null

        System.out.println(no1);
        System.out.println(no1.getProximo());
        System.out.println(no2);

        System.out.println("-------");

        System.out.println(no1);
        System.out.println(no1.getProximo());
        System.out.println(no1.getProximo().getProximo());
        System.out.println(no1.getProximo().getProximo().getProximo());
        System.out.println(no1.getProximo().getProximo().getProximo().getProximo());



    }
}
