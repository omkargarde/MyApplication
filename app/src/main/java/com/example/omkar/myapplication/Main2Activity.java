package com.example.omkar.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Main2Activity extends Activity {

    private Button buton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);// activity_main1 is corresponding XML file

        buton = (Button)findViewById(R.id.button1);

        buton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {



                 Intent intent;
                intent = new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(intent); // startActivity allow you to move
            }
        });
    }

}