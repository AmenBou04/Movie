package com.example.movie;  // <-- adapte si besoin à ton package réel

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Déclaration des composants
    CheckBox cbTopGun, cbOppenheimer, cbForrest, cbCinema;
    Button btnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ⚠️ Mets ici le bon nom de ton layout XML
        // Si ton fichier s’appelle composant_gui.xml => R.layout.composant_gui

        // Liaison XML ↔ Java
        cbTopGun = findViewById(R.id.plain_cb);
        cbOppenheimer = findViewById(R.id.serif_cb);
        cbForrest = findViewById(R.id.bold_cb);
        cbCinema = findViewById(R.id.italic_cb);
        btnOk = findViewById(R.id.okButton);

        // Action bouton
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder result = new StringBuilder("Films choisis :");

                if (cbTopGun.isChecked()) {
                    result.append("\n- Top Gun");
                }
                if (cbOppenheimer.isChecked()) {
                    result.append("\n- Oppenheimer");
                }
                if (cbForrest.isChecked()) {
                    result.append("\n- Forrest Gump");
                }
                if (cbCinema.isChecked()) {
                    result.append("\n- Cinema Paradiso");
                }

                // Affichage dans un Toast
                if (result.toString().equals("Films choisis :")) {
                    Toast.makeText(MainActivity.this, "Aucun film choisi", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, result.toString(), Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
