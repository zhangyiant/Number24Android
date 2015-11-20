package com.antee.number24;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btnCalculate;
    private EditText txtNumber1;
    private EditText txtNumber2;
    private EditText txtNumber3;
    private EditText txtNumber4;
    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNumber1 = (EditText) findViewById(R.id.editText1);
        txtNumber2 = (EditText) findViewById(R.id.editText2);
        txtNumber3 = (EditText) findViewById(R.id.editText3);
        txtNumber4 = (EditText) findViewById(R.id.editText4);
        txtResult = (TextView) findViewById(R.id.txtResult);
        btnCalculate = (Button) findViewById(R.id.btnCalculate);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strNumber1, strNumber2, strNumber3, strNumber4;
                strNumber1 = txtNumber1.getText().toString();
                strNumber2 = txtNumber2.getText().toString();
                strNumber3 = txtNumber3.getText().toString();
                strNumber4 = txtNumber4.getText().toString();
                int number1, number2, number3, number4;
                number1 = Integer.parseInt(strNumber1);
                number2 = Integer.parseInt(strNumber2);
                number3 = Integer.parseInt(strNumber3);
                number4 = Integer.parseInt(strNumber4);

                Number24Calculator c = new Number24Calculator();
                String r = c.calculate(number1, number2, number3, number4);
                if (r.equals("")) {
                    r = "无解";
                } else {
                    r = r + "=24";
                }

                txtResult.setText(r);
            }
        });

    }

}
