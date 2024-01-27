package com.example.vendittrial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SignUpPage extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_page);
        button = (Button) findViewById(R.id.btnSignUpDone);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMachineSelectionPage();
            }
        });
    }
    public void openMachineSelectionPage()
    {
        Intent intent = new Intent(this, MachineSelectionPage.class);
        startActivity(intent);
    }
}