package br.edu.iff.pooa20172.trabalho01_2017_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public Button botao;
    public EditText nome,valor,horas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botao = (Button) findViewById(R.id.principal_botao);
        nome = (EditText) findViewById(R.id.principal_nome);
        valor = (EditText) findViewById(R.id.principal_valor);
        horas = (EditText) findViewById(R.id.principal_horas);
    }

    public void chamar_activity(View view){
        Intent intent = new Intent(MainActivity.this, Activity_2.class);
        intent.putExtra("nome", nome.getText().toString());
        intent.putExtra("valor", valor.getText().toString());
        intent.putExtra("horas", horas.getText().toString());
        startActivity(intent);
    }
}
