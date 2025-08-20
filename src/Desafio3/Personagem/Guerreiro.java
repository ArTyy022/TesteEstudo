package Personagem;

public class Guerreiro extends Personagem {
    public Guerreiro(String nome) {
        super("jubiscreldo", "Guerreiro",100); // vida inicial do guerreiro
    }

    @Override
    public void atacar(Personagem alvo) {
        System.out.println(getNome() + " usa ataque comum (espada)!");
        alvo.receberDano(15);
    }

    @Override
    public void ataqueEspecial(Personagem alvo) {
        System.out.println(getNome() + " usa ataque especial (Golpe Poderoso)!");
        alvo.receberDano(30);
    }
}
