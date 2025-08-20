package Inimigos;

public class ShaoKahn {
    private String nome;
    private int idade;
    private int vida;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    public void exibir(){
        System.out.println(nome + " tem " + idade + " anos, e sua vida é de: " +vida);
    }
}
