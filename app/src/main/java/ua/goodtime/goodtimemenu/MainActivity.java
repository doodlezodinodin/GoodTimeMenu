package ua.goodtime.goodtimemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listenerOnButton();
    }

    public void listenerOnButton() {
        Button btnNewShift = findViewById(R.id.btnNewShift);

        btnNewShift.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(".ShiftActivity");
                        startActivity(intent);
                    }
                }
        );
    }
}
