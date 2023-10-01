import java.util.Scanner;

public class QualSeuTurno {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        char turno = leitor.next().toUpperCase().charAt(0);

        if(turno == 'M'){
            System.out.println("Bom Dia!");
        }else if(turno == 'V'){
            System.out.println("Boa Tarde!");
        }else if(turno == 'N'){
            System.out.println("Boa Noite!");
        }else{
            System.out.println("Valor Inválido!");
        }

    }
}
