package devandroid.alessandra.criarasclasses.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import devandroid.alessandra.criarasclasses.R;
import devandroid.alessandra.criarasclasses.model.Pessoa;


public class MainActivity extends AppCompatActivity {

        Pessoa pessoa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        pessoa = new Pessoa();
        //Atribuir conteúdo, dados, vqalores para o Objeto.
        // Conforme o seu Modelo, TEMPLETE
        pessoa.setPrimeiroNome("Alessandra");
        pessoa.setSobreNome("Cicarello");
        pessoa.setCursoDesejado("Android");
        pessoa.setTelefoneContato("31-991826799");


    }
}