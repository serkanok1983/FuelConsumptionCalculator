package com.serkanok.fuelconsumptioncalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class AnaEkran extends AppCompatActivity {

    int menzil;
    double depoYakitTutar;
    TextView kmYakitOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ana_ekran);

        menzil = 0;
        depoYakitTutar = 0;
        EditText menzilGirdi = findViewById(R.id.menzil_input);
        EditText depoYakitTutarGirdi = findViewById(R.id.yakit_tutar_input);
        kmYakitOutput = findViewById(R.id.km_yakit_output);
        menzilGirdi.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.toString().length() > 0) {
                    menzil = Integer.parseInt(s.toString());
                    sonucGoster();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        depoYakitTutarGirdi.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.toString().length() > 0) {
                    depoYakitTutar = Double.parseDouble(s.toString());
                    sonucGoster();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void sonucGoster() {
        kmYakitOutput.setText(String.format("%.2f", (depoYakitTutar/menzil)));
    }
}
