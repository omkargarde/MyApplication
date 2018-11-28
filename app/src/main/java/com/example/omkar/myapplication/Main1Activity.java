package com.example.omkar.myapplication;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

//import com.example.omkar.myapplication.Main2Activity;
//import com.example.omkar.myapplication.R;

public class Main1Activity extends Activity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main1);// activity_main1 is corresponding XML file

        button = findViewById(R.id.button);

        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                /*
                 * Intent is just like glue which helps to navigate one activity
                 * to another.
                 */Intent intent;
                intent = new Intent(Main1Activity.this,Main2Activity.class);
                startActivity(intent); // startActivity allow you to move
            }
        });
    }

}