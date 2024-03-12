package com.example.vendittrial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class profile_page extends AppCompatActivity {

    String username = LoginPage.getusername1();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);

        TextView tv1 = (TextView)findViewById(R.id.textView25);
        tv1.setText(username);


    }
    public void openMachineSelectionPage()
    {
        Intent intent = new Intent(this, MachineSelectionPage.class);
        startActivity(intent);
    }
}