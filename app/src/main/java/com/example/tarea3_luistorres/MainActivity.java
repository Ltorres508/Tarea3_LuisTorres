package com.example.tarea3_luistorres;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView, userage;
    Button button;
    Switch aSwitch;
    SeekBar seekBar;
    EditText editText;
    String texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = findViewById(R.id.seekBar1);
        userage = findViewById(R.id.textView2);

      seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
          @Override
          public void onProgressChanged(SeekBar seekBar, int edad, boolean b) {

              userage.setText("User age: " + String.valueOf(edad));
          }

          @Override
          public void onStartTrackingTouch(SeekBar seekBar) {

          }

          @Override
          public void onStopTrackingTouch(SeekBar seekBar) {

          }
      });
       editText = findViewById(R.id.editText1);
       textView = findViewById(R.id.textView);
       button = findViewById(R.id.button1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String texto = editText.getText().toString();

                textView.setText(texto);
            }
        });
        aSwitch = findViewById(R.id.switch1);
        button = findViewById(R.id.button1);

        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked == false){
                    button.setEnabled(false);
            }else{
                button.setEnabled(true);
                }
            }

        });

    }
}
