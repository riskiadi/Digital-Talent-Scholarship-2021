package com.alkalynx.aplikasiinputnama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nama;
    TextView hasil;
    Button btnShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nama = (EditText) findViewById(R.id.edtNama);
        hasil = (TextView) findViewById(R.id.txtTampil);
        btnShow = (Button) findViewById(R.id.btnShow);

    }

    public void showName(View view) {
        Toast.makeText(this, nama.getText(), Toast.LENGTH_LONG).show();
        hasil.setText(getString(R.string.namaAnda) + nama.getText());
    }
}