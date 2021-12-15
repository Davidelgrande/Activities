package org.itdev.tutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TutorialActivity extends AppCompatActivity {
private TextView txt;
private TextView txt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tutorialactivity);
        TextView txt3 = findViewById(R.id.textView5);

        txt3.setTextSize(14);
        txt = findViewById(R.id.textView3);
        txt.setText("Un estado de bloqueo es cuando un proceso  no puede realizar ninguna accion dado que esta \n" +
                "a la espera de un evento externo\n" +
                "En Round Robin el estado de bloqueo se da cuando un proceso espera demasiado en una cola y este\n" +
                "decide cederle el puesto de prioridad a otro.");
        txt1= findViewById(R.id.textView4);
        txt1.setText(" 1. Para pasar un proceso a bloqueado se cuenta con una variable random" +
                "\n"+ " 2. Una variable disponible de tipo boolean cambia el estado si el proceso se demora mucho tiempo"+
                 "\n 3. El random libera el recurso sólo si hay un proceso que consuma menos recursos o demore menos tiempo en ejecutarse"+"" +
                "\n4. El round robin no dejará de asignar procesos de manera equitativa por pasar a blqoueado un proceso." );
    }

    public void backActivity(View view)

    {
        Intent i = new Intent(this,RoundRobin.class);
        startActivity(i);
    }
    public void nextActivity1(View view)

    {
        Intent i = new Intent(this,FinalActivity.class);
        startActivity(i);
    }
}