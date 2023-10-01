import java.util.Scanner;

public class MediaDeIdade {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int idade1 = leitor.nextInt();
        int idade2 = leitor.nextInt();
        int idade3 = leitor.nextInt();


       int media = (idade1 + idade2 + idade3) / 3;

        if (media >= 0 || media <= 25){
            System.out.println("Jovem!" + media);
        }else if(media > 25 || media <= 60){
            System.out.println("Adulto!"+ media);
        }else{
            System.out.println("Idosa!"+ media);
        }
    }
}
