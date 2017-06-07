package ht.sivgep.pharmacielakay.register;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import ht.sivgep.pharmacielakay.R;

public class RegisterPharmacieActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_pharmacie);

                                final Intent i = getIntent();
                                String type = i.getStringExtra("type");
        Toast.makeText(getApplicationContext(), type, Toast.LENGTH_SHORT).show();
    }
}
