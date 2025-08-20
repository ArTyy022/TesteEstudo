package Personagem;

public class Ladrao extends Personagem {
    public Ladrao(String nome) {
        super("Gerisvaldo", "Ladrão",80); // vida inicial do ladrão
    }

    @Override
    public void atacar(Personagem alvo) {
        System.out.println(getNome() + " usa ataque comum (adaga)!");
        alvo.receberDano(10);
    }

    @Override
    public void ataqueEspecial(Personagem alvo) {
        System.out.println(getNome() + " usa ataque especial (Golpe Furtivo)!");
        alvo.receberDano(25);
    }
}
