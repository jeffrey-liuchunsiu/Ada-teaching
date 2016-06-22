package com.dss.husqvarna.jeffreyapplication;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button buttonJeffrey = (Button)findViewById(R.id.button);
        buttonJeffrey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button myButton = new Button(MainActivity.this);
                myButton.setText("And I am addicted to games");

                RelativeLayout layout = (RelativeLayout) findViewById(R.id.relative_layout);
                RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
                layout.addView(myButton, lp);
            }
        });

        SpecialButton specialButton = (SpecialButton)findViewById(R.id.special_button);
        specialButton.jeffreyMethod();


    }
}
