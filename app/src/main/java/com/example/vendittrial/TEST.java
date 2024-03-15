package com.example.vendittrial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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
        mqttHandler.connect(BROKER_URL,CLIENT_ID);
        publishMessage("iot-bulb","on");

    }
    protected void onDestroy()
    {
        mqttHandler.disconnect();
        super.onDestroy();
    }
    private void publishMessage(String topic, String message)
    {
        Toast.makeText(this, "publishing",Toast.LENGTH_SHORT).show();
        mqttHandler.publish(topic,message);
    }

}