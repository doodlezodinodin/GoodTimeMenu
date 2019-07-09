package ua.goodtime.goodtimemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.io.IOException;

import ua.goodtime.goodtimemenu.datebase.DatabaseSingleton;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        TextView textView = findViewById(R.id.twOrder);
        try {
            textView.setText(DatabaseSingleton.getDatabaseSingleton().getTest(this));
        } catch (IOException e) {
            e.printStackTrace();
        }

        listenerOnButton();
    }

    public void listenerOnButton() {
        Button btnCloseOrder = findViewById(R.id.btnCloseOrder);

        btnCloseOrder.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        finish();
                    }
                }
        );
    }
}
