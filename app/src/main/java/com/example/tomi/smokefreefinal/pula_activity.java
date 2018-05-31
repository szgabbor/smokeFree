package com.example.tomi.smokefreefinal;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.TextureView;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class pula_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pula_activity);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();


            }
        });

        Intent intent = getIntent();

        int cigsperday = intent.getIntExtra(dataActivity.cigss, 0);
        int year = intent.getIntExtra(dataActivity.yearr, 0);
        int month = intent.getIntExtra(dataActivity.monthh, 0);
        int price = intent.getIntExtra(dataActivity.pricee, 0);

        int priceperday = (price*cigsperday)/20;


        /*TextView cigsinput = (TextView) findViewById(R.id.cigsinputid);
        TextView time1 = (TextView) findViewById(R.id.yearinputid);
        TextView time2 = (TextView) findViewById(R.id.monthinputid);
        TextView cigsprice = (TextView) findViewById(R.id.priceinputid);

        cigsinput.setText("" + cigsperday);
        time1.setText("" + year);
        time2.setText("" + month);
        cigsprice.setText("" + price);*/

        // a kommentarban levo resz az hogy csak simplan kiiratom a 4 vatozot amit atveszek a data activitybol :D
        String message = "If you stop smoking you will save " + priceperday*2*365;
        TextView first = (TextView) findViewById(R.id.cigsinputid);
        first.setText(message + "Money in 2 year");
    }

}
