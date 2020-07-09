package com.example.piffb;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidmads.library.qrgenearator.QRGEncoder;

public class StudentQRCode extends AppCompatActivity {

    String tag="GenerateQRCode";
    ImageView qrImage;
    Button redeemButton;
    Bitmap bitmap;
    QRGEncoder qrgEncoder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_q_r_code);

        qrImage = (ImageView) findViewById(R.id.qrcode);
        redeemButton = (Button) findViewById(R.id.redeemButtom);

        redeemButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputvalue
            }
        });
    }
}