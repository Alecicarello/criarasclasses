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

    }
}