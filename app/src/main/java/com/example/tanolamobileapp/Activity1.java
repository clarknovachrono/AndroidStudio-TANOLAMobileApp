package com.example.tanolamobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.DecimalFormat;

public class Activity1 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        Button btnTwoDayPackage = (Button) findViewById(R.id.btnTwoDayPackage);
        Button btnOvernightPackage = (Button) findViewById(R.id.btnOvernightPackage);
        TextView txtSelectedPackageType = (TextView) findViewById(R.id.txtSelectedPackageType);

        EditText editSenderAddr = (EditText) findViewById(R.id.editSenderAddr);
        EditText editRecipientAddr = (EditText) findViewById(R.id.editRecipientAddr);
        EditText editWeight = (EditText) findViewById(R.id.editWeight);
//        EditText editCost = (EditText) findViewById(R.id.editCost);
        Button btnCalcCost = (Button) findViewById(R.id.btnCalcCost);

        TextView txtSenderAddr = (TextView) findViewById(R.id.txtSenderAddr);
        TextView txtRecipientAddr = (TextView) findViewById(R.id.txtRecipientAddr);
        TextView txtTotalCost = (TextView) findViewById(R.id.txtTotalCost);

        btnTwoDayPackage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtSelectedPackageType.setText("Two Day Package");
            }
        });

        btnOvernightPackage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtSelectedPackageType.setText("Overnight Package");
            }
        });

        btnCalcCost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DecimalFormat df = new DecimalFormat("#.##");
                txtSenderAddr.setText("Sender Address: " + editSenderAddr.getText().toString());
                txtRecipientAddr.setText("Recipient Address: " + editRecipientAddr.getText().toString());

//                String twoDayValue = editWeight.getText().toString();
                String inputtedWeight = editWeight.getText().toString();
                double weightValue = Double.parseDouble(inputtedWeight);

                double twoDayCost = 2.0;
                double overnightCost = 3.0;

//                String overnightValue = editCost.getText().toString();
//                double costValue = Double.parseDouble(overnightValue);

                double totalTwoDayCost = twoDayCost * weightValue;
                double totalOvernightCost = overnightCost * weightValue;
//                double twoDayTotal = weightValue * costValue;
//                double overnightTotal = (weightValue * costValue) + overnightCost;

                if(txtSelectedPackageType.getText().toString().equals("Two Day Package")){
                    txtTotalCost.setText("Total cost: "+df.format(totalTwoDayCost));

                } else {
                    txtTotalCost.setText("Total cost: "+df.format(totalOvernightCost));
                }
            }
        });
    }
}
