package com.example.appfrasesdodia;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    //Atributo
    String[] frases = {
            "Você está no caminho certo",
            "Tenha foco. Não se desvie",
            "A vida tem que ser leve!",
            "Em tudo Deus vai te ajudar, basta você rezar!",

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void gerarFrase(View view) {



    }

    public void exibirTodas(View view) {

        TextView texto = findViewById(R.id.textResultado);

        String textoResultado = "";
        for (String frase : frases) {
            textoResultado = textoResultado + frase + "\n";


        }
        texto.setText(textoResultado);


    }


}