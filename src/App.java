import Pacote1.Palmeirense;
import Pacote1.Argentino;
import Pacote1.Corinthiano;
import Pacote1.PessoaNormal;
import Pacote1.Eua;
import Pacote1.Batman;

public class App {
    public static void main(String[] args) throws Exception {

        Corinthiano leo = new Corinthiano();

        Palmeirense caio = new Palmeirense();

        Argentino messi = new Argentino();

        Eua obama = new Eua();

        PessoaNormal irineu = new PessoaNormal();

        Batman bat = new Batman();

        System.out.println("Corinthiano x Palmeirense");

        leo.Saudacao();
        caio.Saudacao();

        leo.Apresentacao();
        caio.Apresentacao();

        leo.Sentimento();
        caio.Sentimento();
        
        System.out.println("Argentino x Americano(EUA)");

        obama.Saudacao();
        messi.Saudacao();

        obama.Apresentacao();
        messi.Apresentacao();

        obama.Sentimento();
        messi.Sentimento();

        System.out.println("Batman x Pessoa Normal");

        bat.Saudacao();
        irineu.Saudacao();

        bat.Apresentacao();
        irineu.Apresentacao();

        bat.Sentimento();
        irineu.Sentimento();
    }
}
