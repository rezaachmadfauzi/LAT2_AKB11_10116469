package com.raf.lat2_akb11_10116469;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AlmostThereActivity extends AppCompatActivity {
    Button bVerif;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost_there);
        bVerif = (Button)findViewById(R.id.btn_Verify);
        bVerif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(getApplicationContext(), VerifyYourAccountActivity.class);
                startActivity(pindah);
            }
        });
    }
}
