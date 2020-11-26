package ac.i.geekapp;

import ac.i.geekapp.produk.Alfred;
import ac.i.geekapp.produk.Dom;
import ac.i.geekapp.produk.Egov;
import ac.i.geekapp.produk.Ges;
import ac.i.geekapp.produk.Medstore;
import ac.i.geekapp.produk.Nomad;
import ac.i.geekapp.produk.Udio;
import ac.i.geekapp.produk.geekpos;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Produk extends AppCompatActivity {
    CardView cvdom,cvges,cvgeekpos, cvudio, cvnomad, cvmedstore, cvalfred, cvegov;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produk);

        cvdom = findViewById(R.id.DOM);
        cvges = findViewById(R.id.GES);
        cvgeekpos = findViewById(R.id.Geekpos);
        cvudio = findViewById(R.id.UDIO);
        cvnomad = findViewById(R.id.Nomand);
        cvmedstore = findViewById(R.id.MedStore);
        cvalfred = findViewById(R.id.alferd);
        cvegov = findViewById(R.id.eGOV);

        cvalfred.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Produk.this, Alfred.class);
                startActivity(i);
            }
        });

        cvdom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Produk.this, Dom.class);
                startActivity(i);
            }
        });

        cvges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Produk.this, Ges.class);
                startActivity(i);
            }
        });

        cvgeekpos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Produk.this, geekpos.class);
                startActivity(i);
            }
        });

        cvudio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Produk.this, Udio.class);
                startActivity(i);
            }
        });

        cvnomad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Produk.this, Nomad.class);
                startActivity(i);
            }
        });

        cvmedstore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Produk.this, Medstore.class);
                startActivity(i);
            }
        });

        cvegov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Produk.this, Egov.class);
                startActivity(i);
            }
        });
    }
}