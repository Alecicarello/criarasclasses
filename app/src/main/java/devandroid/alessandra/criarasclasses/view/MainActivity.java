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


        outraPessoa = new Pessoa();
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


                btnsalvar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        pessoa.setPrimeiroNome(editPrimeiroNome.getText().toString());
                        pessoa.setSobreNome(editsobrenome.getText().toString());
                        pessoa.setCursoDesejado(editcursodesejado.getText().toString());
                        pessoa.setTelefoneContato(edittelefonecontato.getText().toString());

                        Toast.makeText(MainActivity.this, "Salvo" + pessoa.toString(), Toast.LENGTH_LONG).show();


                        btnfinalizar.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Toast.makeText(MainActivity.this, "Volte sempre", Toast.LENGTH_LONG).show();
                                finish();


                            }
                        });
                    }
                });

            }
        });


        Log.i("POOAndroid", "Objeto pessoa: " + pessoa.toString());
        Log.i("POOAndroid", "Objeto outraPessoa: " + outraPessoa.toString());

    }
}