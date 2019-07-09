package ua.goodtime.goodtimemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;

import ua.goodtime.goodtimemenu.datebase.DatabaseSingleton;

public class ShiftActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shift);

        listenerOnButton();
    }

    public void listenerOnButton() {
        Button btnNewOrder = findViewById(R.id.btnNewOrder);

        btnNewOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(".OrderActivity");
                startActivity(intent);
            }
        });
    }
}
