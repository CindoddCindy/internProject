package ac.i.geekapp.produk;

import ac.i.geekapp.R;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Nomad extends AppCompatActivity {
    private PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nomad);

        pdfView = findViewById(R.id.pdfView);
        pdfView.fromAsset("produk/NOMAD.pdf")
                .enableSwipe(true)
                .load();
    }
}