package com.example.carleanesousa.idadecao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView anos;
    EditText anoCachorro;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.button1);
        anos = (TextView) findViewById(R.id.text1);
        anoCachorro = (EditText) findViewById(R.id.edit2);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String textoano = anoCachorro.getText().toString();
                double anoCachorro = Double.parseDouble(textoano);

                double Resultado = (anoCachorro * 7);

                Toast.makeText(getApplicationContext(),
                        "Idade humana do cachorro é Anos:" + Resultado,
                        Toast.LENGTH_LONG).show();

            }
        });

    }
}



