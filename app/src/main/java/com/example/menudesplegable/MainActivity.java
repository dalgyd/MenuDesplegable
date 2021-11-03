package com.example.menudesplegable;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = findViewById(R.id.tv1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menudeopciones,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int opt = item.getItemId();
        float valor;

        switch (opt){
            case R.id.agrandarFuente:
                valor = tv1.getTextSize();
                valor = valor + 30;
                tv1.setTextSize(TypedValue.COMPLEX_UNIT_PX, valor);
                return true;
            case R.id.reducirFuente:
                valor = tv1.getTextSize();
                valor = valor - 30;
                tv1.setTextSize(TypedValue.COMPLEX_UNIT_PX, valor);
                return true;
            case R.id.salir:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}