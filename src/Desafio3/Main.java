import Personagem.Guerreiro;
import Personagem.Ladrao;
import Personagem.Personagem;

import java.util.Random;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        Personagem jogador;
        Personagem inimigo;

        if (random.nextBoolean()) {
            jogador = new Guerreiro("Jogador");
            inimigo = new Ladrao("Inimigo");
        } else {
            jogador = new Ladrao("Jogador");
            inimigo = new Guerreiro("Inimigo");
        }


        System.out.println("Sua classe foi escolhida: " + jogador.getClasse());
        System.out.println("O nome do personagem da sua classe é " + jogador.getNome());


        while (jogador.estaVivo() && inimigo.estaVivo()) {
            System.out.println("\n----------");
            System.out.println(jogador.getNome() + " (" + jogador.getClasse() + ") Vida: " + jogador.getVida());
            System.out.println(inimigo.getNome() + " (" + inimigo.getClasse() + ") Vida: " + inimigo.getVida());

           
            int escolha;
            while (true) {
                System.out.println("Escolha seu ataque:");
                System.out.println("1 - Ataque comum");
                System.out.println("2 - Ataque especial");
                escolha = sc.nextInt();

                if (escolha == 1) {
                    jogador.atacar(inimigo);
                    break;
                } else if (escolha == 2) {
                    jogador.ataqueEspecial(inimigo);
                    break;
                } else {
                    System.out.println("Digite um número válido (1 ou 2)!");
                }
            }

            if (!inimigo.estaVivo()) {
                System.out.println(inimigo.getNome() + " morreu!");
                System.out.println(jogador.getNome() + " venceu!");
                break;
            }


            if (random.nextBoolean()) {
                inimigo.atacar(jogador);
            } else {
                inimigo.ataqueEspecial(jogador);
            }


            if (!jogador.estaVivo()) {
                System.out.println(jogador.getNome() + " morreu!");
                System.out.println(inimigo.getNome() + " venceu!");
                break;
            }
        }
    }
}
