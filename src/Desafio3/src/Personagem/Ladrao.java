package Personagem;

public class Ladrao extends Personagem{
    public Ladrao(String nome, String classe, int vida) {
        super("Baltazar", "Ladrão", 200);
    }

    public Ladrao(String inimigo) {
        super("Baltazar", "Ladrão", 200);
    }

    @Override
    public void atacar(Personagem alvo){
        System.out.println(getNome() + " usa ataque comum (facada)");
        alvo.receberDano(13);
    }
    @Override
    public void ataqueEspecial(Personagem alvo) {
        System.out.println(getNome() + " usa especial (Golpe furtivo)");
        alvo.receberDano(30);
    }
}
