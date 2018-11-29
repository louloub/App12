package com.example.haroldyourdj.app12;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText ed_prenom = findViewById(R.id.editText);
                String get_name = ed_prenom.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putString("cles", get_name);
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("gPre", bundle);

                startActivity(intent);
            }
        });



    }
}
