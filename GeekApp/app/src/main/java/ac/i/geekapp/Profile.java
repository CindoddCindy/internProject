package ac.i.geekapp;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class Profile extends AppCompatActivity implements View.OnClickListener {
    TextView tvemail, tvpassword, tvphone, tvusername;
    FirebaseAuth firebaseAuth;
    FirebaseUser firebaseUser;
    private String getUserID;
    private DatabaseReference mData_nama, mData_nohp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        tvemail = findViewById(R.id.email);
        tvpassword = findViewById(R.id.password);
        tvphone = findViewById(R.id.notlp);
        tvusername = findViewById(R.id.username);
        firebaseAuth = firebaseAuth.getInstance();
        firebaseUser = firebaseAuth.getCurrentUser();
        tvemail.setText(firebaseUser.getEmail());
        getUserID = FirebaseAuth.getInstance().getCurrentUser().getUid();

        getDataUser();
    }

    private void getDataUser() {
        mData_nama = FirebaseDatabase.getInstance().getReference().child("DataUser").child(getUserID).child("nama");
        mData_nohp = FirebaseDatabase.getInstance().getReference().child("DataUser").child(getUserID).child("nohp");

        mData_nama.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                tvusername.setText(snapshot.getValue(String.class));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        mData_nohp.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                tvphone.setText(snapshot.getValue(String.class));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

        }
    }
}