import java.util.Scanner;

public class FilaDoBanco {
        public static void main(String[] args) {

            String[] nomesFila = new String[3];
            Scanner nome = new Scanner(System.in);

            for (int i = 0; i < nomesFila.length; i++) {
                nomesFila[i] = nome.nextLine();
            }

            int pos = 1;
            for(int i = 0; i < nomesFila.length; i++) {
                System.out.println(nomesFila[i] + " - esta na posicao: " + pos);
                pos++;
            }
        }
    }
