package ac.i.geekapp.jasa;

import ac.i.geekapp.R;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Konstruksi extends AppCompatActivity {
    private PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konstruksi);

        pdfView = findViewById(R.id.pdfView);
        pdfView.fromAsset("Kontruksi Source Code.pdf")
                .enableSwipe(true)
                .load();
    }
}