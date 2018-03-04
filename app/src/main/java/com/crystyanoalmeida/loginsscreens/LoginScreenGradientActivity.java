package com.crystyanoalmeida.loginsscreens;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Toast;

public class LoginScreenGradientActivity extends AppCompatActivity {

    CardView login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen_gradient);
        login = (CardView) findViewById(R.id.cardView);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "You clicked in Login", Toast.LENGTH_LONG).show();
            }
        });
    }
}
