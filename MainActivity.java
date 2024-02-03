package com.example.event_info;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    EditText name;
    EditText place;
    RadioButton indoor;
    RadioButton outdoor;
    RadioButton online;
    EditText datetime;
    EditText capacity;
    EditText budget;
    EditText email;
    EditText phone;
    EditText description;
    Button cancel;
    Button share;
    Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        place = findViewById(R.id.place);
        indoor = findViewById(R.id.indoor);
        outdoor = findViewById(R.id.outdoor);
        online = findViewById(R.id.online);
        datetime = findViewById(R.id.datetime);
        capacity = findViewById(R.id.capacity);
        budget = findViewById(R.id.budget);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.phone);
        description = findViewById(R.id.description);
        cancel = findViewById(R.id.cancel);
        cancel.setOnClickListener(v -> finish());
        share = findViewById(R.id.share);
        share.setOnClickListener(v -> funcShare());
        save = findViewById(R.id.save);
        save.setOnClickListener(v -> funcSave());
    }
    public void funcSave(){
        System.out.println(name.getText().toString().trim());
        System.out.println(place.getText().toString().trim());
        if (indoor.isChecked()){
            System.out.println("Indoor clicked");
        }
        if (outdoor.isChecked()) {
            System.out.println("Outdoor clicked");
        }
        if (online.isChecked()){
            System.out.println("Online clicked");
        }
        System.out.println(datetime.getText().toString().trim());
        System.out.println(capacity.getText().toString().trim());
        System.out.println(budget.getText().toString().trim());
        System.out.println(email.getText().toString().trim());
        System.out.println(phone.getText().toString().trim());
        System.out.println(description.getText().toString().trim());

    }
    public void funcShare(){
        System.out.println("Share clicked");
    }
}
