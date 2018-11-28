package com.example.omkar.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class Main3Activity extends Activity {

    private Button button1,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main3);// activity_main1 is corresponding XML file

        button1=findViewById(R.id.buttont);
        button2=findViewById(R.id.buttonnt);

        button1.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                Bundle b = new Bundle();
                b.putString("myname", "1");

                Intent intent;
                intent = new Intent(Main3Activity.this,MainActivity.class);
                intent.putExtras(b);
                startActivity(intent); // startActivity allow you to move

            }
        });
        button2.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {



                Bundle b = new Bundle();
                b.putString("myname", "2");

                Intent intent;
                intent = new Intent(Main3Activity.this,MainActivity.class);
                intent.putExtras(b);
                startActivity(intent);
            }
        });
    }

}