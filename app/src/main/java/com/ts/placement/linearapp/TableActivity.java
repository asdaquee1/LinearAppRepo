package com.ts.placement.linearapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class TableActivity extends AppCompatActivity {

   CheckBox c1,c2,c3,c4;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }
    Button button = (Button) findViewById(R.id.button);

    button.setOnClickListener(new View.OnClickListener() {

        @Override

        public void onClick(View v) {

            goToSecondActivity();

        }

    });

}
    private void goToSecondActivity() {

        Intent intent = new Intent(this, SecondActivity2.class);

        startActivity(intent);

    public void courseSelected(View v) {
        c1 = (CheckBox) findViewById(R.id.c1);
        c2 = (CheckBox) findViewById(R.id.c2);
        c3 = (CheckBox) findViewById(R.id.c3);
        c4 = (CheckBox) findViewById(R.id.c4);

        StringBuilder orderlist = new StringBuilder();
        orderlist.append("You have selected :");


        if (c1.isChecked()) {
            orderlist.append(c1.getText() + " ");
        }
        if (c2.isChecked()) {
            orderlist.append(c2.getText() + " ");
        }
        if (c3.isChecked()) {
            orderlist.append(c3.getText() + " ");
        }
        if (c4.isChecked()) {
            orderlist.append(c4.getText() + " ");
        }


        Toast.makeText(TableActivity.this, orderlist, Toast.LENGTH_LONG).show();

        c1.setChecked(false);
        c2.setChecked(false);
        c3.setChecked(false);
        c4.setChecked(false);

    }

}
