package com.example.arslan.bs_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // views
    private TextView titleTextView;
    private Button addButton ,clearButton;
    private EditText inputEditText;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titleTextView= findViewById(R.id.title);
        addButton= findViewById(R.id.add);
        clearButton= findViewById(R.id.clear);
        inputEditText =findViewById(R.id.input);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(inputEditText != null){
                    if(titleTextView !=null){
                        titleTextView.setText(inputEditText.getText().toString());
                    }
                }
            }
        });

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(titleTextView !=null){
                    titleTextView.setText("");
                }
            }
        });

    }//end of onCreate


}
