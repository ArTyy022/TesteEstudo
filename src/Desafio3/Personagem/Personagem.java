package Personagem;

public class Personagem {
    private String nome;
    private int vida;
    private String classe;

    public Personagem(String nome, String classe, int vida) {
        this.nome = nome;
        this.vida = vida;
        this.classe = classe;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }
    public String getClasse(){
        return classe;
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public void receberDano(int dano) {
        vida -= dano;
        if (vida < 0) vida = 0;
        System.out.println(nome + " recebeu " + dano + " de dano. Vida restante: " + vida);
    }


    public void atacar(Personagem alvo) {
        System.out.println(nome + " ataca!");
        alvo.receberDano(5);
    }

    public void ataqueEspecial(Personagem alvo) {
        System.out.println(nome + " usa ataque especial!");
        alvo.receberDano(10);
    }
}

