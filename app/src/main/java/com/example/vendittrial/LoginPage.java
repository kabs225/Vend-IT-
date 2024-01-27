package com.example.vendittrial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginPage extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        TextView username = (TextView) findViewById(R.id.txtUsername);
        TextView password = (TextView) findViewById(R.id.txtPassword);

        Button  loginbtn = (Button) findViewById(R.id.btnLoginDone);
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("Kabs225")&&password.getText().toString().equals("admin"))
                {
                    //correct
                    Toast.makeText(LoginPage.this, "LOGIN SUCCESS",Toast.LENGTH_SHORT).show();
                    openMachineSelectionPage();
                }
                else
                    Toast.makeText(LoginPage.this, "LOGIN FAIL",Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void openMachineSelectionPage()
    {
        Intent intent = new Intent(this, MachineSelectionPage.class);
        startActivity(intent);
    }
}