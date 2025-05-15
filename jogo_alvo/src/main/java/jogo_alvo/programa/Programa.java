package jogo_alvo.programa;

import jogo_alvo.entidades.Alvo;
import jogo_alvo.entidades.AlvoBranco;
import jogo_alvo.entidades.AlvoPreto;

import java.util.*;

public class Programa {

    private List<Alvo> alvoList = new ArrayList<>();
    private Scanner scan = new Scanner(System.in);
    private int tiros = 12;
    Alvo alvo;

    public void iniciarJogo() {
        Random random = new Random();
        Set<String> posicoesUsadas = new HashSet<>();

        while (alvoList.size() < 5) {
            int x = random.nextInt(4) + 1;
            int y = random.nextInt(4) + 1;
            String posicao = x + "," + y;

            if (!posicoesUsadas.contains(posicao)) {
                if (alvoList.size() < 2) {
                    alvo = new AlvoBranco(x,y);
                }
                else {
                    alvo = new AlvoPreto(x, y);
                }
                alvoList.add(alvo);
                posicoesUsadas.add(posicao);
            }
        }
        System.out.println("Jogo Iniciado com 5 Alvos (2 Brancos, 3 Pretos)\n");
    }

    public void atirar() {
        while (tiros > 0 && alvo.getQuantADestruir() > 0) {
            System.out.println("\nTiros Restantes: " + tiros);
            System.out.print("Digite posição X do tiro (1 a 4): ");
            int x = scan.nextInt();
            System.out.print("Digite posição Y do tiro (1 a 4): ");
            int y = scan.nextInt();

            boolean acertou = false;

            for (int i = 0; i < alvoList.size(); i++) {
                Alvo av = alvoList.get(i);
                if (av.acerta(x, y)) {
                    acertou = true;
                    if (av instanceof AlvoPreto) {
                        System.out.println("Acertou um ALVO PRETO!");
                        alvoList.remove(i);
                    }
                    else if (av instanceof AlvoBranco) {
                        System.out.println("Acertou um ALVO BRANCO! Substituído por um ALVO PRETO!");
                        alvoList.remove(i);
                        alvoList.add(new AlvoPreto(x, y));
                    }
                    break;
                }
                if (!acertou) {
                    System.out.println("Você não Acertou Nenhum Alvo...");
                }
                tiros--;
            }
            if (alvo.getQuantADestruir() == 0) {
                System.out.println("VOCÊ VENCEU!!!");
            }
            else {
                System.out.println("GAME OVER!");
            }
        }
    }

    public static void main(String[] args) {
        Programa programa = new Programa();
        programa.iniciarJogo();
        programa.atirar();
    }
}
