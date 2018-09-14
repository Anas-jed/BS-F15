package com.example.arslan.bs_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RelativeLayoutExampleActivity extends AppCompatActivity implements View.OnClickListener {

    //views fields
    private Button loginButton , registerButton , cancelButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_linear_layout_example);

        loginButton = findViewById(R.id.login);
        registerButton = findViewById(R.id.register);
        cancelButton = findViewById(R.id.cancel);

        loginButton.setOnClickListener(this);
        registerButton.setOnClickListener(this);
        cancelButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.login:
                Toast.makeText(this , "No Logic for login",Toast.LENGTH_SHORT).show();
                break;
            case R.id.cancel:
                finish();
                break;
            case R.id.register:
                Toast.makeText(this , "No Logic for register",Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
}
