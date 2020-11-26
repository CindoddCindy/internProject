package ac.i.geekapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Pemesanan extends AppCompatActivity {
    EditText etnama, etemail, etperusahaan, etbudget, ettimeline, etNomorHp, etaplikasi,etjenisaplikasi,etdeskripsi;
    Button OpenWhatsapp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pemesanan);

        etnama = findViewById(R.id.edtnama);
        etemail = findViewById(R.id.edtemail);
        etperusahaan = findViewById(R.id.edtperusahaan);
        etbudget = findViewById(R.id.edtbudget);
        ettimeline = findViewById(R.id.edttimeline);
        etNomorHp = findViewById(R.id.edtnotlp);
        etaplikasi = findViewById(R.id.edtaplikasi);
        etjenisaplikasi = findViewById(R.id.edtjenisapk);
        etdeskripsi = findViewById(R.id.edtdeskripsi);

        OpenWhatsapp = findViewById(R.id.btnkirim);
        OpenWhatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /**String pesan1 = etnama.getText().toString();
                 String pesan2 = etemail.getText().toString();
                 String pesan3 = etperusahaan.getText().toString();
                 String pesan4 = etbudget.getText().toString();
                 String pesan5 = ettimeline.getText().toString();
                 String pesan6 = etNomorHp.getText().toString();

                 String semuapesan = "Nama: " + pesan1 + "\n" + "Email: " + pesan2 + "\n" + "Perusahaan: " + pesan3 + "\n" + "Budget: " + pesan4 + "\n" + "Timeline: " + pesan5 + "\n" + "NomorHP: " + pesan6 + "\n" + "Budget: ";
                 Intent kirimWA = new Intent();
                 kirimWA.setAction(Intent.ACTION_SEND);
                 kirimWA.putExtra(Intent.EXTRA_TEXT, semuapesan);
                 kirimWA.putExtra("ima", "6285641187175" + "@s.whatsapp.net");
                 kirimWA.setType("text/plain");
                 kirimWA.setPackage("com.whatsapp");
                 startActivity(kirimWA);*/
                PackageManager pm = getPackageManager();
                try {
                    String pesan1 = etnama.getText().toString();
                    String pesan2 = etemail.getText().toString();
                    String pesan3 = etNomorHp.getText().toString();
                    String pesan4 = etperusahaan.getText().toString();
                    String pesan5 = etaplikasi.getText().toString();
                    String pesan6 = etjenisaplikasi.getText().toString();
                    String pesan7 = etdeskripsi.getText().toString();
                    String pesan8 = etbudget.getText().toString();
                    String pesan9 = ettimeline.getText().toString();


                    String semuapesan = "Nama: " + pesan1 + "\n" + "Email: " + pesan2 + "\n" +  "No Telepon: " + pesan3 + "\n" +
                            "Nama Perusahaan: " + pesan4 + "\n" +  "Nama Aplikasi: " + pesan5 + "\n" +  "Jenis Aplikasi: " + pesan6 + "\n" +
                            "Deskripsi: " + pesan7 + "\n" +
                            "Budget: " + pesan8 + "\n" +
                            "Timeline: " + pesan9 + "\n" ;

                    PackageInfo info = pm.getPackageInfo("com.whatsapp", PackageManager.GET_META_DATA);
                    String smsNumber = "6285641187175";
                    openWhatsApp(smsNumber, semuapesan);

                } catch (PackageManager.NameNotFoundException e) {
                    Toast.makeText(Pemesanan.this, "EROR.",
                            Toast.LENGTH_SHORT).show();
                }

            }
        });

        return;
    }

    private void openWhatsApp(String smsNumber, String message) {
        smsNumber = smsNumber; // E164 format without '+' sign
        Intent sendIntent = new Intent(Intent.ACTION_SEND);
        sendIntent.setType("text/plain");
        sendIntent.putExtra(Intent.EXTRA_TEXT, message);
        sendIntent.putExtra("jid", smsNumber + "@s.whatsapp.net"); //phone number without "+" prefix
        sendIntent.setPackage("com.whatsapp");
        startActivity(sendIntent);
    }
};
