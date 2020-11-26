package ac.i.geekapp.jasa;

import ac.i.geekapp.R;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.pdf.PdfDocument;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Manajement extends AppCompatActivity {
    private PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manajement);

        pdfView = findViewById(R.id.pdfView);
        pdfView.fromAsset("Manajamen IT.pdf")
                .enableSwipe(true)
                .load();
    }
}