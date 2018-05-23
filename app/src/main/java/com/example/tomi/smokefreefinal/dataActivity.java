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
    public  static  final  String EXTRA_NUMBER = "com.exemple.application.example.EXTRA_NUMER";

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
        int cigsperday = Integer.parseInt(cigsinput.getText().toString());

        Intent intent = new Intent(this, pula_activity.class);
        intent.putExtra(EXTRA_NUMBER, cigsperday);
        startActivity(intent);
    }
}
