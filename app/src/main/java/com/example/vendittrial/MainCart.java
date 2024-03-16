package com.example.vendittrial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainCart extends AppCompatActivity {

    private Button button;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_cart);

        item1text();
        item2text();
        item3text();
        item4text();
        item5text();


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
    public void item1text()
        {
            TextView tv1 = (TextView)findViewById(R.id.txtquantity11);
            TextView tv2 = (TextView)findViewById(R.id.txtname1);
            TextView tv3 = (TextView)findViewById(R.id.txtprice1);
            ImageView im1 = (ImageView) findViewById(R.id.imageView47);
            ImageView im2 = (ImageView) findViewById(R.id.imageView18);

            if(i1 != 0 )
            {
                tv1.setText(item1);
                int p1 = i1 * 10;
                String Price1 = String.valueOf(p1);
                tv3.setText(Price1);
            }
            else
            {
                tv1.setVisibility(View.INVISIBLE);
                tv2.setVisibility(View.INVISIBLE);
                tv3.setVisibility(View.INVISIBLE);
                im1.setVisibility(View.INVISIBLE);
                im2.setVisibility(View.INVISIBLE);

            }
        }
    public void item2text()
    {
        TextView tv1 = (TextView)findViewById(R.id.txtquantity22);
        TextView tv2 = (TextView)findViewById(R.id.txtname2);
        TextView tv3 = (TextView)findViewById(R.id.txtprice2);
        ImageView im1 = (ImageView) findViewById(R.id.imageView43);
        ImageView im2 = (ImageView) findViewById(R.id.imageView48);

        if(i2 != 0 )
        {
            tv1.setText(item2);
            int p2 = i2 * 10;
            String Price2 = String.valueOf(p2);
            tv3.setText(Price2);
        }
        else
        {
            tv1.setVisibility(View.INVISIBLE);
            tv2.setVisibility(View.INVISIBLE);
            tv3.setVisibility(View.INVISIBLE);
            im1.setVisibility(View.INVISIBLE);
            im2.setVisibility(View.INVISIBLE);

        }
    }

    public void item3text()
    {
        TextView tv1 = (TextView)findViewById(R.id.txtquantity33);
        TextView tv2 = (TextView)findViewById(R.id.txtname3);
        TextView tv3 = (TextView)findViewById(R.id.txtprice3);
        ImageView im1 = (ImageView) findViewById(R.id.imageView44);
        ImageView im2 = (ImageView) findViewById(R.id.imageView49);

        if(i3 != 0 )
        {
            tv1.setText(item3);
            int p3 = i3 * 10;
            String Price3 = String.valueOf(p3);
            tv3.setText(Price3);
        }
        else
        {
            tv1.setVisibility(View.INVISIBLE);
            tv2.setVisibility(View.INVISIBLE);
            tv3.setVisibility(View.INVISIBLE);
            im1.setVisibility(View.INVISIBLE);
            im2.setVisibility(View.INVISIBLE);

        }
    }
    public void item4text()
    {
        TextView tv1 = (TextView)findViewById(R.id.txtquantity44);
        TextView tv2 = (TextView)findViewById(R.id.txtname4);
        TextView tv3 = (TextView)findViewById(R.id.txtprice4);
        ImageView im1 = (ImageView) findViewById(R.id.imageView50);
        ImageView im2 = (ImageView) findViewById(R.id.imageView53);

        if(i4 != 0 )
        {
            tv1.setText(item4);
            int p4 = i4 * 50;
            String Price4 = String.valueOf(p4);
            tv3.setText(Price4);
        }
        else
        {
            tv1.setVisibility(View.INVISIBLE);
            tv2.setVisibility(View.INVISIBLE);
            tv3.setVisibility(View.INVISIBLE);
            im1.setVisibility(View.INVISIBLE);
            im2.setVisibility(View.INVISIBLE);

        }
    }

    public void item5text()
    {
        TextView tv1 = (TextView)findViewById(R.id.txtquantity55);
        TextView tv2 = (TextView)findViewById(R.id.txtname5);
        TextView tv3 = (TextView)findViewById(R.id.txtprice5);
        ImageView im1 = (ImageView) findViewById(R.id.imageView51);
        ImageView im2 = (ImageView) findViewById(R.id.imageView53);

        if(i5 != 0 )
        {
            tv1.setText(item5);
            int p5 = i5 * 20;
            String Price5 = String.valueOf(p5);
            tv3.setText(Price5);
        }
        else
        {
            tv1.setVisibility(View.INVISIBLE);
            tv2.setVisibility(View.INVISIBLE);
            tv3.setVisibility(View.INVISIBLE);
            im1.setVisibility(View.INVISIBLE);
            im2.setVisibility(View.INVISIBLE);

        }
    }


}