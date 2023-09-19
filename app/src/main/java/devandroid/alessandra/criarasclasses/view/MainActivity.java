package devandroid.alessandra.criarasclasses.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import devandroid.alessandra.criarasclasses.R;
import devandroid.alessandra.criarasclasses.model.Pessoa;


public class MainActivity extends AppCompatActivity {

        Pessoa pessoa;
        Pessoa outraPessoa;

        String dadosPessoa;
        String dadosOutraPessoa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


         pessoa = new Pessoa();
        //Atribuir conteúdo, dados, vqalores para o Objeto.
        // Conforme o seu Modelo, TEMPLATE
        pessoa.setPrimeiroNome("Alessandra");
        pessoa.setSobreNome("Cicarello");
        pessoa.setCursoDesejado("Android");
        pessoa.setTelefoneContato("31-991826799");

        outraPessoa=new Pessoa();
        outraPessoa.setPrimeiroNome("Laura");
        outraPessoa.setSobreNome("Cicarello");
        outraPessoa.setCursoDesejado("Java");
        outraPessoa.setTelefoneContato("31-99999988");

        dadosPessoa = "Primeiro nome: ";
        dadosPessoa += pessoa.getPrimeiroNome();
        dadosPessoa += " Sobrenome: ";
        dadosPessoa += pessoa.getSobreNome();
        dadosPessoa += " Curso Desejado: ";
        dadosPessoa += pessoa.getCursoDesejado();
        dadosPessoa += " Telefone de Contato: ";
        dadosPessoa += pessoa.getTelefoneContato();


        dadosOutraPessoa = "Primeiro nome: ";
        dadosOutraPessoa += outraPessoa.getPrimeiroNome();
        dadosOutraPessoa += " Sobrenome: ";
        dadosOutraPessoa += outraPessoa.getSobreNome();
        dadosOutraPessoa += " Curso Desejado: ";
        dadosOutraPessoa += outraPessoa.getCursoDesejado();
        dadosOutraPessoa += " Telefone de Contato: ";
        dadosOutraPessoa += outraPessoa.getTelefoneContato();

        int parada = 0;


    }
}