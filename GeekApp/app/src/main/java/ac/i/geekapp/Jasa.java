package ac.i.geekapp;

import ac.i.geekapp.jasa.Konstruksi;
import ac.i.geekapp.jasa.Manajement;
import ac.i.geekapp.jasa.Perancangan;
import ac.i.geekapp.jasa.Software;
import ac.i.geekapp.jasa.Technical;
import ac.i.geekapp.jasa.Training;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Jasa extends AppCompatActivity {
    CardView cvkonstruksi, cvmanajemen, cvsoftware, cvperancangan, cvtechnical,cvtraining;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jasa);

        cvkonstruksi = findViewById(R.id.konstruksi);
        cvmanajemen = findViewById(R.id.manajemen);
        cvsoftware = findViewById(R.id.software);
        cvperancangan = findViewById(R.id.perancangan);
        cvtechnical = findViewById(R.id.technical);
        cvtraining =findViewById(R.id.training);

        cvkonstruksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Jasa.this, Konstruksi.class);
            startActivity(i);
            }
        });

        cvmanajemen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Jasa.this, Manajement.class);
            startActivity(i);
            }
        });

        cvsoftware.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Jasa.this, Software.class);
                startActivity(i);
            }
        });

        cvperancangan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Jasa.this, Perancangan.class);
                startActivity(i);
            }
        });

        cvtechnical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Jasa.this, Technical.class);
                startActivity(i);
            }
        });

        cvtraining.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Jasa.this, Training.class);
                startActivity(i);
            }
        });
    }
}