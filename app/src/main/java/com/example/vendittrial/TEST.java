package com.example.vendittrial;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TEST extends AppCompatActivity {

    private static final String BROKER_URL = "tcp://aryansdomain.com:1883";
    private static final String CLIENT_ID = "ANDORID_APP";
    private MqttHandler mqttHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        mqttHandler = new MqttHandler();
        mqttHandler.connect(BROKER_URL, CLIENT_ID);

        // Get reference to buttons
        Button button1 = findViewById(R.id.button1);

        String item1 = itemSelectionPage.getItem1();
        String item2 = itemSelectionPage.getItem2();
        String item3 = itemSelectionPage.getItem3();
        String item4 = itemSelectionPage.getItem4();
        String item5 = itemSelectionPage.getItem5();

        int i1 = Integer.parseInt(item1);
        int i2 = Integer.parseInt(item2);
        int i3 = Integer.parseInt(item3);
        int i4 = Integer.parseInt(item4);
        int i5 = Integer.parseInt(item5);

        String formattedString = String.format("%d%d%d%d%d", i1, i2, i3, i4, i5);

        // Set click listeners for buttons
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                publishMessage("iot-bulb", formattedString);
            }
        });
    }

    protected void onDestroy() {
        mqttHandler.disconnect();
        super.onDestroy();
    }

    private void publishMessage(String topic, String message) {
        Toast.makeText(this, "publishing: " + message, Toast.LENGTH_SHORT).show();
        mqttHandler.publish(topic, message);
    }
}
