package id.ac.poliban.dts.maya.prj01;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    //Deklarasikan Variabel
    EditText textNama;
    TextView hasil;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Panggil Variabel Berdasarkan id
        textNama = findViewById(R.id.TxtNama);
        hasil = findViewById(R.id.Lbl_Nama);
    }
    //Buat Method TampilNama Sesuai Dengan Property OnClick pada button
    @SuppressLint("SetTextI18n")
    public void TampilNama(View v) {
        hasil.setText("Nama Anda: "+textNama.getText());
    }
}
