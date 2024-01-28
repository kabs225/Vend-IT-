package com.example.vendittrial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class itemSelectionPage extends AppCompatActivity {

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_selection_page);
        button = (Button) findViewById(R.id.btn_cart);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencartPage();
            }
        });
    }

    public void opencartPage()
    {
        Intent intent = new Intent(this, cart.class);
        startActivity(intent);
    }
}