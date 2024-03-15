package com.example.vendittrial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainCart extends AppCompatActivity {

    private Button button;

    String item1 = itemSelectionPage.getItem1();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_cart);

        TextView tv1 = (TextView)findViewById(R.id.txtquantity11);
        tv1.setText(item1);

        button = (Button) findViewById(R.id.btn_buy);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemSelectionPage();
            }
        });
    }
    public void itemSelectionPage() {
        Intent intent = new Intent(this, TEST.class);
        startActivity(intent);
    }
}