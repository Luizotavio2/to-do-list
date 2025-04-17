package com.example.np2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

     EditText editTextTask;
     Button buttonAdd;
     TextView textViewTask;
     CheckBox checkBoxTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextTask = findViewById(R.id.editTextTask);
        buttonAdd = findViewById(R.id.buttonAdd);
        textViewTask = findViewById(R.id.textView2);
        checkBoxTask = findViewById(R.id.checkBox);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tarefa = editTextTask.getText().toString();
                textViewTask.setText(tarefa);
                editTextTask.setText("");
            }
        });
    }
}