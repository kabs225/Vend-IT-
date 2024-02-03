package com.example.vendittrial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cart extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        button = (Button) findViewById(R.id.btn_backcart);
        button.setOnClickListener(new View.OnClickListener() {
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