package com.example.piffb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

public class DonorPaymentDetails extends AppCompatActivity {

    TextView textID, textAmount, textStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donor_payment_details);

        textID = (TextView) findViewById(R.id.textID);
        textAmount = (TextView) findViewById(R.id.textAmount);
        textStatus = (TextView) findViewById(R.id.textStatus);

        //get intent
        Intent intent = getIntent();

        try {
            JSONObject jsonObject = new JSONObject(intent.getStringExtra("Payment Details"));
            showDetails(jsonObject.getJSONObject("response"), intent.getStringExtra("Payment Amount"));

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private void showDetails(JSONObject response, String paymentAmount) {
        try {
            textID.setText(response.getString("ID"));
            textStatus.setText(response.getString("Status"));
            textAmount.setText("RM"+paymentAmount);

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}