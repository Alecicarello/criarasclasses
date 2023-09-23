package devandroid.alessandra.criarasclasses.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import devandroid.alessandra.criarasclasses.R;
import devandroid.alessandra.criarasclasses.model.Pessoa;


public class MainActivity extends AppCompatActivity {

        Pessoa pessoa;
        Pessoa outraPessoa;

        String dadosPessoa;
        String dadosOutraPessoa;

        EditText editPrimeiroNome;
        EditText editsobrenome;
        EditText editcursodesejado;
        EditText edittelefonecontato;
        Button btnlimpar;
        Button btnsalvar;
        Button btnfinalizar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


         pessoa = new Pessoa();
        //Atribuir conteúdo, dados, vqalores para o Objeto.
        // Conforme o seu Modelo, TEMPLATE
       // pessoa.setPrimeiroNome("Alessandra");
       // pessoa.setSobreNome("Cicarello");
      //  pessoa.setCursoDesejado("Android");
      //  pessoa.setTelefoneContato("31-991826799");

        outraPessoa=new Pessoa();
        outraPessoa.setPrimeiroNome("Laura");
        outraPessoa.setSobreNome("Cicarello");
        outraPessoa.setCursoDesejado("Java");
        outraPessoa.setTelefoneContato("31-99999988");

        editPrimeiroNome = findViewById(R.id.editprimeironome);
        editsobrenome = findViewById(R.id.editsobrenome);
        editcursodesejado = findViewById(R.id.editcursodesejado);
        edittelefonecontato = findViewById(R.id.edittelefonecontato);

        btnlimpar = findViewById(R.id.btnlimpar);
        btnsalvar = findViewById(R.id.btnsalvar);
        btnfinalizar = findViewById(R.id.btnfinalizar);

        editPrimeiroNome.setText(pessoa.getPrimeiroNome());
        editsobrenome.setText(pessoa.getSobreNome());
        editcursodesejado.setText(pessoa.getCursoDesejado());
        edittelefonecontato.setText(pessoa.getTelefoneContato());


        btnlimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editPrimeiroNome.setText("");
                editsobrenome.setText("");
                editcursodesejado.setText("");
                edittelefonecontato.setText("");

              btnfinalizar.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View view) {
                      Toast.makeText(MainActivity.this,"Volte sempre", Toast. LENGTH_LONG).show();
                      finish();


                      btnsalvar.setOnClickListener(new View.OnClickListener() {
                          @Override
                          public void onClick(View view) {

                              pessoa.setPrimeiroNome(editPrimeiroNome.getText().toString());
                              pessoa.setSobreNome(editsobrenome.getText().toString());
                              pessoa.setCursoDesejado(editcursodesejado.getText().toString());
                              pessoa.setTelefoneContato(edittelefonecontato.getText().toString());

                              Toast.makeText(MainActivity.this,"Salvo"+pessoa.toString(), Toast. LENGTH_LONG).show();
                              finish();



                          }
                      });
                  }
              });

            }
        });


/*



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
*/

        Log.i("POOAndroid","Objeto pessoa: "+pessoa.toString());
        Log.i("POOAndroid","Objeto outraPessoa: "+outraPessoa.toString());

    }
}