package estruturas_condicionais;
import java.util.Scanner;

// Exercício 05 - Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

public class exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaInicial, horaFinal, tempoJogo;

        System.out.println("Horário do início do jogo (0-24): ");
        horaInicial = sc.nextInt();
        System.out.println("Horário do fim do jogo (0-24): ");
        horaFinal = sc.nextInt();

        if (horaInicial < horaFinal) {
            tempoJogo = horaFinal - horaInicial;
        } else {
            tempoJogo = 24 - horaInicial + horaFinal;
        }

        System.out.println("O jogo durou " + tempoJogo + " hora(s)");

        sc.close();
    }
}
