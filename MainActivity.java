package com.example.rzlco_kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText bila1, bila2, operatora;
    private Button hitung;
    private TextView rhasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bila1 = findViewById(R.id.bil1);
        bila2 = findViewById(R.id.bil2);
        operatora = findViewById(R.id.operator);
        hitung = findViewById(R.id.hitung);
        rhasil = findViewById(R.id.hasil);
    }

    public void itung(View v){
        switch (operatora.getText().toString()){
            case "+" :
                double bilangan1 = Double.parseDouble(bila1.getText().toString());
                double bilangan2 = Double.parseDouble(bila2.getText().toString());
                double hasil = bilangan1 + bilangan2;
                rhasil.setText(String.valueOf(hasil));
                break;
            case "-" :
                double bilangann1 = Double.parseDouble(bila1.getText().toString());
                double bilangann2 = Double.parseDouble(bila2.getText().toString());
                double hasill = bilangann1 - bilangann2;
                rhasil.setText(String.valueOf(hasill));
                break;
            case "/" :
                double bilangannn1 = Double.parseDouble(bila1.getText().toString());
                double bilangannn2 = Double.parseDouble(bila2.getText().toString());
                double hasilll = bilangannn1 / bilangannn2;
                rhasil.setText(String.valueOf(hasilll));
                break;
            case "*" :
                double bilangannnn1 = Double.parseDouble(bila1.getText().toString());
                double bilangannnn2 = Double.parseDouble(bila2.getText().toString());
                double hasillll = bilangannnn1 * bilangannnn2;
                rhasil.setText(String.valueOf(hasillll));
                break;
            default:
                rhasil.setText("OPERASI ARITMATIK TIDAK SESUAI");
                break;
        }
    }
}