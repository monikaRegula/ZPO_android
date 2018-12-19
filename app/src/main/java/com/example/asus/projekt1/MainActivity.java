package com.example.asus.projekt1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {

        TextView ans=(TextView) findViewById(R.id.ETAns);

        Spinner sexSpinner=(Spinner) findViewById(R.id.sexSpinner);
        String sex=String.valueOf(sexSpinner.getSelectedItem());

        Spinner unitsSpinner=(Spinner) findViewById(R.id.units);
        String units=String.valueOf(unitsSpinner.getSelectedItem());

        Spinner waySpinner=(Spinner) findViewById(R.id.waySpinner);
        int way=waySpinner.getSelectedItemPosition();

        EditText weight=(EditText) findViewById(R.id.ETWeight);
        EditText height=(EditText) findViewById(R.id.ETHeight);
        EditText age=(EditText) findViewById(R.id.ETAge);

        try{
            double weight2=Double.valueOf(weight.getText().toString());
            double height2=Double.valueOf(height.getText().toString());
            double age2=Double.valueOf(age.getText().toString());
            PPM ppm=new PPM();
            double result=0;

            if(way==0){
                System.out.println("harris");
                result=ppm.PPM_BH(sex,weight2, height2,age2,units);
            }else{
                System.out.println("mifflin");
                result=ppm.PPM_M(sex,weight2, height2,age2,units);
            }

            ans.setText(" PPM = "+String.valueOf(result));
        } catch(NumberFormatException e){

            ans.setText("Coś nie jest liczbą");

        }
}}
