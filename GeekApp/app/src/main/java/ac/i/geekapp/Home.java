package ac.i.geekapp;

import ac.i.geekapp.Adapter.ImageAdapter;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class Home extends AppCompatActivity {
    CardView cvproduk, cvjasa, cvpemesanan, cvprofile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        cvproduk = findViewById(R.id.produk);
        cvjasa = findViewById(R.id.jasa);
        cvpemesanan = findViewById(R.id.pemesanan);
        cvprofile = findViewById(R.id.profile);

        cvproduk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this, Produk.class);
                startActivity(i);
            }
        });

        cvjasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this, Jasa.class);
                startActivity(i);
            }
        });

        cvpemesanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this, Pemesanan.class);
                startActivity(i);
            }
        });

        cvprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this, Profile.class);
                startActivity(i);
            }
        });
    }
}