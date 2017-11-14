package br.edu.iff.pooa20172.trabalho01_2017_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity_2 extends AppCompatActivity {

    public String nome, valor, horas;
    double salario_total, imposto_renda, valor_float, valor_horas, inss, sindicato, salario_liquido;
    public TextView imprime_bruto,imprime_inss,imprime_sindicato,imprime_liquido,imprime_imposto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent intent = getIntent();
        nome = (String) intent.getSerializableExtra("nome");
        valor = (String) intent.getSerializableExtra("valor");
        horas = (String) intent.getSerializableExtra("horas");

        valor_float = Float.parseFloat(valor);
        valor_horas = Integer.parseInt(horas);

        imposto_renda = (valor_float * valor_horas) * 0.11;
        inss = (valor_float * valor_horas) * 0.08;
        sindicato = (valor_float * valor_horas) * 0.05;
        salario_liquido = (valor_float * valor_horas) - imposto_renda - inss - sindicato;

        imprime_bruto = (TextView) findViewById(R.id.tela2_bruto);
        imprime_inss = (TextView) findViewById(R.id.tela2_inss);
        imprime_sindicato = (TextView) findViewById(R.id.tela2_sindicato);
        imprime_liquido = (TextView) findViewById(R.id.tela2_liquido);
        imprime_imposto = (TextView) findViewById(R.id.tela2_imposto);

        imprime_bruto.setText(""+valor_float*valor_horas);
        imprime_inss.setText(""+inss);
        imprime_sindicato.setText(""+sindicato);
        imprime_liquido.setText(""+salario_liquido);
        imprime_imposto.setText(""+imposto_renda);

    }
}