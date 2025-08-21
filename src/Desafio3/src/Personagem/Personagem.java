package Personagem;

public class Personagem {
    private String nome;
    private String classe;
    private int vida;


    public Personagem(String nome, String classe, int vida){
        this.nome = nome;
        this.classe = classe;
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

    public String getClasse() {
        return classe;
    }

    public int getVida() {
        return vida;
    }

    public boolean estaVivo(){
        return vida > 0;
    }
    public void receberDano(int dano){
        vida -= dano;
        if (vida <0) vida = 0;
        System.out.println(nome + " recebeu " + dano + " de dano.\nVida restante: " + vida);
    }

    public void atacar (Personagem alvo) {
        System.out.println(nome + " ataca!");
        alvo.receberDano(10);
    }

    public void ataqueEspecial(Personagem alvo){
        System.out.println(nome + " especial");
        alvo.receberDano(15);
    }
}
