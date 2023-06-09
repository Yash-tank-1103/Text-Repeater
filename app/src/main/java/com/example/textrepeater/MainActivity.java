package com.example.textrepeater;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    FileAdapter fileAdapter;
    EditText input,count;
    Switch newline;
    Button display;
    String input_text,oldString;
    TextView output;


    int n;
    Boolean newline_input;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_main);

        input=findViewById(R.id.input);
        count=findViewById(R.id.count);
        output=findViewById(R.id.output);


        newline= (Switch)findViewById(R.id.newline);
        display=findViewById(R.id.display);


//        recyclerView = findViewById(R.id.data);;
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        List<String> fileList = new ArrayList<>();
        newline.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(
        ) {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                display.setOnClickListener(v -> {
                    output.setText(null);
                    if(!isChecked) {

                        input_text=input.getText().toString();
                        if(!count.getText().toString().isEmpty()) {
                            n = Integer.parseInt(count.getText().toString());
                        }
                        oldString=output.getText().toString();
                        oldString=oldString+input_text;
                        for (int i=1;i < n  ; i++)

                        {
                            oldString=output.getText().toString();
                            oldString=oldString+input_text;
                            output.setText(oldString);
                        }
                    }
                    else if(isChecked)
                    {
                        input_text=input.getText().toString();
                        if(!count.getText().toString().isEmpty()) {
                            n = Integer.parseInt(count.getText().toString());
                        }
                        for (int i=1;i < n  ; i++)

                        {
                            oldString=output.getText().toString();
                            oldString=oldString+input_text+"\n";
                            output.setText(oldString);
                        }


                    }

                });



            }


        });

//        fileAdapter = new FileAdapter(fileList);
//        recyclerView.setAdapter(fileAdapter);








        }













}