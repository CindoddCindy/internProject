package ac.i.geekapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import ac.i.geekapp.Model.data_user;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import static android.text.TextUtils.isEmpty;

public class Register extends AppCompatActivity {

    private EditText editText_nama, editText_email, editText_phone, editText_password;
    private Button button_regis;
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        editText_nama=findViewById(R.id.editName);
        editText_email=findViewById(R.id.editEmail);
        editText_phone=findViewById(R.id.editphone);
        editText_password=findViewById(R.id.editPass);
        button_regis=findViewById(R.id.buttonAcount);
        mAuth = FirebaseAuth.getInstance();


        button_regis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = editText_email.getText().toString();
                String password = editText_password.getText().toString();

                if (email.equals("")){
                    Toast.makeText(Register.this, "Masukan email",
                            Toast.LENGTH_SHORT).show();
                } else if (password.equals("")){
                    Toast.makeText(Register.this, "Masukkan password.",
                            Toast.LENGTH_SHORT).show();
                } else{  mAuth.createUserWithEmailAndPassword(email, password)
                        .addOnCompleteListener(Register.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    // Sign in success, update UI with the signed-in user's information
                                    FirebaseUser user = mAuth.getCurrentUser();
                                    langsungLogin();
                                } else {
                                    // If sign in fails, display a message to the user.
                                }

                                // ...
                            }
                        });
                }}
        });
    }

    private void langsungLogin() {
        String getEmail = editText_email.getText().toString();
        String getPas = editText_password.getText().toString();
        mAuth.signInWithEmailAndPassword(getEmail,getPas)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            setData();
                        } else {
                            Toast.makeText(Register.this,"Gagal", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }

    private void setData() {
        String getUserID = FirebaseAuth.getInstance().getCurrentUser().getUid();
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference getReference;

        final String getNama = editText_nama.getText().toString();
        String getNohp = editText_phone.getText().toString();

        getReference = database.getReference();
        if (isEmpty(getNama) && isEmpty(getNohp)){

        } else {
            getReference.child("DataUser").child(getUserID)
                    .setValue(new data_user(getNama,getNohp))
                    .addOnSuccessListener(this, new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            startActivity(new Intent(Register.this, Home.class));
                        }
                    });
        }
    }

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
    }
}