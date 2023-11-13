package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button btn;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        btn = findViewById(R.id.btn);
        textView = findViewById(R.id.textView);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputText = editText.getText().toString();
//                double Kilos = Double.parseDouble(inputText);
//                double pounds = makeConversion(Kilos);
//                textView.setText(""+pounds);
                if(!inputText.isEmpty()){
                    try {
                        double kilos = Double.parseDouble(inputText);
                        double pounds = makeConversion(kilos);
                        textView.setText(""+ pounds);
                    }catch (NumberFormatException e){
                        textView.setText("Invalid input");
                    }

                }else{
                    textView.setText("Please enter a value");
                }
            }
        });
    }
    public double makeConversion(double kilos){
        return  kilos*2.2;
    }
}