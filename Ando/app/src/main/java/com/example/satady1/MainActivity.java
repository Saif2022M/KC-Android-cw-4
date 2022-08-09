package com.example.satady1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       EditText First  = findViewById(R.id.First);
       EditText Second = findViewById(R.id.Secand);
       Button button = findViewById(R.id.button);
       TextView textView1 = findViewById(R.id.textView1);


       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {


               int num1 =Integer.parseInt(First.getText().toString());
               int num2 =Integer.parseInt(Second.getText().toString());
               int result = num1+num2 ;

               textView1.setText(String.valueOf(result));
             //
               //textView1.setText(String.valueOf(result));


           }
       });












    }
}