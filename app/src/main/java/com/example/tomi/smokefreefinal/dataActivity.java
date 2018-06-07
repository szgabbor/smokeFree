package com.example.tomi.smokefreefinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.ArrayAdapter;

public class dataActivity extends AppCompatActivity {
    public  static  final  String cigss = "com.exemple.application.example.cigss";
    public  static  final  String yearr = "com.exemple.application.example.yearr";
    public  static  final  String monthh = "com.exemple.application.example.monthh";
    public  static  final  String pricee = "com.exemple.application.example.pricee";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity_pula();
            }
        });

    }
    public void openActivity_pula(){

        EditText cigsinput = (EditText) findViewById(R.id.cigsinput);
        EditText yearinput = (EditText) findViewById(R.id.yearinput);
        EditText monthinput = (EditText) findViewById(R.id.monthinput);
        EditText priceinput = (EditText) findViewById(R.id.priceinput);
        int cigsperday = Integer.parseInt(cigsinput.getText().toString());
        int year  = Integer.parseInt(yearinput.getText().toString());
        int month = Integer.parseInt(monthinput.getText().toString());
        int price = Integer.parseInt(priceinput.getText().toString());


        Intent intent = new Intent(this, TabbedActivity.class);
        intent.putExtra(cigss, cigsperday);
        intent.putExtra(yearr, year);
        intent.putExtra(monthh, month);
        intent.putExtra(pricee, price);
        startActivity(intent);
    }
}
