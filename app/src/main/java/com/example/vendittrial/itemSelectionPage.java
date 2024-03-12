package com.example.vendittrial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class itemSelectionPage extends AppCompatActivity {

    private Button button;
    private Button btnAddItem1,btnAddItem2,btnAddItem3,btnAddItem4,btnAddItem5,btnAddItem6;
    private Button btnSubItem1,btnSubItem2,btnSubItem3,btnSubItem4,btnSubItem5,btnSubItem6;
    private int item1 = 0;  // Variable to track the quantity of item1
    private int item2 = 0;
    private int item3 = 0;
    private int item4 = 0;
    private int item5 = 0;
    private int item6 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_selection_page);
        button = (Button) findViewById(R.id.btn_cart);
        btnAddItem1 = findViewById(R.id.btn_additem1);
        btnSubItem1 = findViewById(R.id.btn_subitem1);
        btnAddItem2 = findViewById(R.id.btn_additem2);
        btnSubItem2 = findViewById(R.id.btn_subitem2);
        btnAddItem3 = findViewById(R.id.btn_additem3);
        btnSubItem3 = findViewById(R.id.btn_subitem3);
        btnAddItem4 = findViewById(R.id.btn_additem4);
        btnSubItem4 = findViewById(R.id.btn_subitem4);
        btnAddItem5 = findViewById(R.id.btn_additem5);
        btnSubItem5 = findViewById(R.id.btn_subitem5);
        btnAddItem6 = findViewById(R.id.btn_additem6);
        btnSubItem6 = findViewById(R.id.btn_subitem6);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencartPage();
            }
        });

        btnAddItem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addItem1();
            }
        });

        btnSubItem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                subItem1();
            }
        });
        btnAddItem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addItem2();
            }
        });

        btnSubItem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                subItem2();
            }
        });

        btnAddItem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addItem3();
            }
        });

        btnSubItem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                subItem3();
            }
        });

        btnAddItem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addItem4();
            }
        });

        btnSubItem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                subItem4();
            }
        });

        btnAddItem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addItem5();
            }
        });

        btnSubItem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                subItem5();
            }
        });

        btnAddItem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addItem6();
            }
        });

        btnSubItem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                subItem6();
            }
        });
    }

    public void opencartPage()
    {
        Intent intent = new Intent(this, cart.class);
        startActivity(intent);
    }

    private void addItem1() {
        item1++;
        updateItem1Quantity();
    }

    private void subItem1() {
        if (item1 > 0) {
            item1--;
            updateItem1Quantity();
        } else {
            Toast.makeText(this, "Quantity cannot be less than 0", Toast.LENGTH_SHORT).show();
        }
    }

    private void updateItem1Quantity() {
        // You can perform any additional actions based on the updated item1 quantity if needed.
        // For   now, let's just display a Toast mee.
        Toast.makeText(this, "Item1 quantity: " + item1, Toast.LENGTH_SHORT).show();
    }

    private void addItem2() {
        item2++;
        updateItem2Quantity();
    }

    private void subItem2() {
        if (item2 > 0) {
            item2--;
            updateItem2Quantity();
        } else {
            Toast.makeText(this, "Quantity cannot be less than 0", Toast.LENGTH_SHORT).show();
        }
    }

    private void updateItem2Quantity() {
        // You can perform any additional actions based on the updated item1 quantity if needed.
        // For   now, let's just display a Toast mee.
        Toast.makeText(this, "Item2 quantity: " + item2, Toast.LENGTH_SHORT).show();
    }

    private void addItem3() {
        item3++;
        updateItem3Quantity();
    }

    private void subItem3() {
        if (item3 > 0) {
            item3--;
            updateItem3Quantity();
        } else {
            Toast.makeText(this, "Quantity cannot be less than 0", Toast.LENGTH_SHORT).show();
        }
    }

    private void updateItem3Quantity() {
        // You can perform any additional actions based on the updated item1 quantity if needed.
        // For   now, let's just display a Toast mee.
        Toast.makeText(this, "Item3 quantity: " + item3, Toast.LENGTH_SHORT).show();
    }

    private void addItem4() {
        item4++;
        updateItem4Quantity();
    }

    private void subItem4() {
        if (item4 > 0) {
            item4--;
            updateItem4Quantity();
        } else {
            Toast.makeText(this, "Quantity cannot be less than 0", Toast.LENGTH_SHORT).show();
        }
    }

    private void updateItem4Quantity() {
        // You can perform any additional actions based on the updated item1 quantity if needed.
        // For   now, let's just display a Toast mee.
        Toast.makeText(this, "Item4 quantity: " + item4, Toast.LENGTH_SHORT).show();
    }

    private void addItem5() {
        item5++;
        updateItem5Quantity();
    }

    private void subItem5() {
        if (item5 > 0) {
            item5--;
            updateItem5Quantity();
        } else {
            Toast.makeText(this, "Quantity cannot be less than 0", Toast.LENGTH_SHORT).show();
        }
    }

    private void updateItem5Quantity() {
        // You can perform any additional actions based on the updated item1 quantity if needed.
        // For   now, let's just display a Toast mee.
        Toast.makeText(this, "Item5 quantity: " + item5, Toast.LENGTH_SHORT).show();
    }

    private void addItem6() {
        item6++;
        updateItem6Quantity();
    }

    private void subItem6() {
        if (item6 > 0) {
            item6--;
            updateItem6Quantity();
        } else {
            Toast.makeText(this, "Quantity cannot be less than 0", Toast.LENGTH_SHORT).show();
        }
    }

    private void updateItem6Quantity() {
        // You can perform any additional actions based on the updated item1 quantity if needed.
        // For   now, let's just display a Toast mee.
        Toast.makeText(this, "Item6 quantity: " + item6, Toast.LENGTH_SHORT).show();
    }

}