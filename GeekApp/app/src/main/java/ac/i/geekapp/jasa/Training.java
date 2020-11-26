package ac.i.geekapp.jasa;

import ac.i.geekapp.R;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Training extends AppCompatActivity {
    private PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training);

        pdfView = findViewById(R.id.pdfView);
        pdfView.fromAsset("Training & Workshop.pdf")
                .enableSwipe(true)
                .load();
    }
}