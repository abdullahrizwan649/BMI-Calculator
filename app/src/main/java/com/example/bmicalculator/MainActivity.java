package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        EditText weight_in, feet_in, inches_in;
        Button btn_calculate;
        TextView text_result;
        LinearLayout layout_hehe;
        LinearLayout layout_hehe2;

        weight_in = findViewById(R.id.weight_input);
        feet_in = findViewById(R.id.feet_input);
        inches_in = findViewById(R.id.inches_input);
        btn_calculate = findViewById(R.id.calculate_btn);
        text_result = findViewById(R.id.result_txt);
        layout_hehe = findViewById(R.id.layout_lol);
        layout_hehe2 =findViewById(R.id.layout_lol_2);

        //PRESSING BUTTON
        btn_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {



        //READING VALUES//
        int weight = Integer.parseInt(weight_in.getText().toString());
        int feet = Integer.parseInt(feet_in.getText().toString());
        int inches = Integer.parseInt(inches_in.getText().toString());

        //CONVERTING HEIGHT TO METERS//
        int total_inches = (feet * 12) + inches;
        double total_cm = total_inches*2.53;
        double total_meters = total_cm / 100;

         //Calculating BMI
        double bmi = weight / (total_meters*total_meters);

        //Classifying BMI


        if(bmi>=25 )
        {
            text_result.setText("VERY FAT");
            layout_hehe.setBackgroundColor(getResources().getColor(R.color.red));

            layout_hehe2.setBackgroundColor(getResources().getColor(R.color.red));
        }
        else if(bmi>30)
        {
            text_result.setText("YOU WILL DIE SOON");
            layout_hehe.setBackgroundColor(getResources().getColor(R.color.red));
            layout_hehe2.setBackgroundColor(getResources().getColor(R.color.red));
        }
        else if(bmi<25 && bmi>=18)
        {
            text_result.setText("FIT!");
            layout_hehe.setBackgroundColor(getResources().getColor(R.color.green));
            layout_hehe2.setBackgroundColor(getResources().getColor(R.color.green));
        }
        else if(bmi<18 )
        {
            text_result.setText("EAT VRO!");
            layout_hehe.setBackgroundColor(getResources().getColor(R.color.yellow));
            layout_hehe2.setBackgroundColor(getResources().getColor(R.color.yellow));
        }
//        else
//        {
//            text_result.setText("TRY AGAIN OR YOU ARE NOT NORMAL!");
//        }
                if(bmi<=10 || bmi>=35)
                {
                    text_result.setText("TRY AGAIN OR YOU ARE NOT NORMAL");
                    layout_hehe.setBackgroundColor(getResources().getColor(R.color.teal_200));
                    layout_hehe2.setBackgroundColor(getResources().getColor(R.color.teal_200));
                }

            }

        });
//hello

    }
}