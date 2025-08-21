package Personagem;

public class Guerreiro extends Personagem{

    public Guerreiro(String nome, String classe, int vida) {
        super("Marin", "Guerreiro", 200);
    }

    public Guerreiro(String jogador) {
        super("Marin", "Guerreiro", 200);
    }


    @Override
    public void atacar(Personagem alvo){
        System.out.println(getNome() + " usa ataque comum (facada)");
        alvo.receberDano(10);
    }
    @Override
    public void ataqueEspecial(Personagem alvo) {
        System.out.println(getNome() + " usa especial (Golpe furtivo)");
        alvo.receberDano(32);
    }
}
