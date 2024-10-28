package com.tecnosmart.salespro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button buttonGestionVentas;
    private Button buttonHistorialVentas;
    private Button buttonGestionInventario;
    private Button buttonGestionClientes;
    private Button buttonInformeDiarias;
    private Button buttonInformeMensuales;
    private Button buttonInformeInventario;
    private Button buttonVentasCliente;
    private Button buttonInformeClientes;
    private Button buttonGestionCartera;
    private Button buttonLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonGestionVentas = findViewById(R.id.buttonGestionVentas);
        buttonHistorialVentas = findViewById(R.id.buttonHistorialVentas);
        buttonGestionInventario = findViewById(R.id.buttonGestionInventario);
        buttonGestionClientes = findViewById(R.id.buttonGestionClientes);
        buttonInformeDiarias = findViewById(R.id.buttonInformeDiarias);
        buttonInformeMensuales = findViewById(R.id.buttonInformeMensuales);
        buttonInformeInventario = findViewById(R.id.buttonInformeInventario);
        buttonVentasCliente = findViewById(R.id.buttonVentasCliente);
        buttonInformeClientes = findViewById(R.id.buttonInformeClientes);
        buttonGestionCartera = findViewById(R.id.buttonGestionCartera);
        buttonLogout = findViewById(R.id.buttonLogout);


        buttonGestionVentas.setOnClickListener(view -> navigateTo(GestionVentasActivity.class));
        buttonHistorialVentas.setOnClickListener(view -> navigateTo(HistorialVentasActivity.class));
        buttonGestionInventario.setOnClickListener(view -> navigateTo(GestionInventarioActivity.class));
        buttonGestionClientes.setOnClickListener(view -> navigateTo(GestionClientesActivity.class));
        buttonInformeDiarias.setOnClickListener(view -> navigateTo(InformeDiariasActivity.class));
        buttonInformeMensuales.setOnClickListener(view -> navigateTo(InformeMensualesActivity.class));
        buttonInformeInventario.setOnClickListener(view -> navigateTo(InformeInventarioActivity.class));
        buttonVentasCliente.setOnClickListener(view -> navigateTo(VentasPorClienteActivity.class));
        buttonInformeClientes.setOnClickListener(view -> navigateTo(InformeClientesActivity.class));
        buttonGestionCartera.setOnClickListener(view -> navigateTo(GestionCarteraActivity.class));
        buttonLogout.setOnClickListener(view -> logout());
    }

    private void navigateTo(Class<?> activityClass) {
        Intent intent = new Intent(MainActivity.this, activityClass);
        startActivity(intent);
    }

    private void logout() {
        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(intent);
        finish(); // Cerrar el MainActivity para que el usuario no pueda volver con el botón de retroceso.
    }
}

