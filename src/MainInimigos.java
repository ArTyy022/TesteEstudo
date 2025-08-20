import Inimigos.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainInimigos {
    public static void main(String[] args) {


        ShangTsung inimigoShangTsung = new ShangTsung();

        inimigoShangTsung.setNome("ShangTsung");
        inimigoShangTsung.setIdade(100000);
        inimigoShangTsung.setVida(390);
        inimigoShangTsung.exibir();


        QuanChi inimigoQuanChi = new QuanChi();
        inimigoQuanChi.setNome("Quan Chi");
        inimigoQuanChi.setIdade(1800);
        inimigoQuanChi.setVida(300);
        inimigoQuanChi.exibir();

        ShaoKahn inimigoShaoKahn = new ShaoKahn();
        inimigoShaoKahn.setNome("Shao kahn");
        inimigoShaoKahn.setIdade(100000);
        inimigoShaoKahn.setVida(500);
        inimigoShaoKahn.exibir();

        Shinnok inimigoShinnok = new Shinnok();
        inimigoShinnok.setNome("Shinnok");
        inimigoShinnok.setIdade(140000000);
        inimigoShinnok.setVida(1000);
        inimigoShinnok.exibir();

        Onaga inimigoOnaga = new Onaga();
        inimigoOnaga.setNome("Onaga");
        inimigoOnaga.setIdade(2000);
        inimigoOnaga.setVida(700);
        inimigoOnaga.exibir();





















    }
}
