package ac.i.geekapp.produk;

import ac.i.geekapp.R;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Alfred extends AppCompatActivity {
    private PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alfred);

        pdfView = findViewById(R.id.pdfView);
        pdfView.fromAsset("produk/Alfred.pdf")
                .enableSwipe(true)
                .load();
    }
}