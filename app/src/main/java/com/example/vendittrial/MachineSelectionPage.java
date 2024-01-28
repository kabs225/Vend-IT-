package com.example.vendittrial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MachineSelectionPage extends AppCompatActivity {

    private Button button1, button2, button3, button4, button5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_machine_selection_page);




        button1 = (Button) findViewById(R.id.btn_machine1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemSelectionPage();
            }
        });

        button2 = (Button) findViewById(R.id.btn_machine2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemSelectionPage();
            }
        });

        button3 = (Button) findViewById(R.id.btn_machine3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemSelectionPage();
            }
        });

        button4 = (Button) findViewById(R.id.btn_machine4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemSelectionPage();
            }
        });

        button5 = (Button) findViewById(R.id.btn_profile);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemSelectionPage();
            }
        });


    }

    public void itemSelectionPage() {
        Intent intent = new Intent(this, itemSelectionPage.class);
        startActivity(intent);
    }
}