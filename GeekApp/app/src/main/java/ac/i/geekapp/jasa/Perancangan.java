package ac.i.geekapp.jasa;

import ac.i.geekapp.R;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Perancangan extends AppCompatActivity {
    private PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perancangan);

        pdfView = findViewById(R.id.pdfView);
        pdfView.fromAsset("Perancangan & Analisa Software.pdf")
                .enableSwipe(true)
                .load();
    }
}