package com.ec.promedio;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText edtPrimerParcial, edtSegundoParcial;
    private TextView textResultado;
    private Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtPrimerParcial = findViewById(R.id.edtPrimerParcial);
        edtSegundoParcial = findViewById(R.id.edtSegundoParcial);
        textResultado = findViewById(R.id.textResultado);
        btnCalcular = findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(view -> calcularPromedio());
    }

    private void calcularPromedio() {
        String strPrimerParcial = edtPrimerParcial.getText().toString();
        String strSegundoParcial = edtSegundoParcial.getText().toString();

        if (!strPrimerParcial.isEmpty() && !strSegundoParcial.isEmpty()) {
            double promedio = (Double.parseDouble(strPrimerParcial) + Double.parseDouble(strSegundoParcial)) / 2;
            textResultado.setText("Mi Promedio: " + promedio);
        } else {
            textResultado.setText("Ingresa ambas notas para calcular el promedio.");
        }
    }
}
