package com.example.hp.animationsinandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtHelloWorld;
    private TextView txtHiWorld;
    int counter = 0;
    float rotation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtHelloWorld = findViewById(R.id.txtHelloWorld);
        txtHiWorld = findViewById(R.id.txtHiWorld);
        txtHiWorld.animate().alpha(0).rotationX(90).setDuration(0);


        txtHelloWorld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (counter == 0) {

                    txtHelloWorld.animate().alpha(0f).rotationX(180).setStartDelay(0).setDuration(900);
                    txtHiWorld.animate().alpha(1f).rotationX(0).setStartDelay(900).setDuration(900);
                    counter = 1;

                } else {

                    txtHiWorld.animate().alpha(0f).rotationX(180).setStartDelay(0);
                    txtHelloWorld.animate().alpha(1f).rotationX(0).setStartDelay(900);
                    counter = 0;
                    rotation = txtHiWorld.getRotationX();
                    Log.i("Dupa", "Rotacja wynosi: " + rotation);
                    // txtHiWorld.animate().

                }


            }
        });

    }
}
