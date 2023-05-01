// COMP 2161, T00705586 Huy Mirko, Assignment 4, Oct 2022

package com.example.calculator2;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // declare variables
    TextView memoryTv, resultTv, solutionTv;
    MaterialButton matButton_bin, matButton_oct, matButton_hex, matButton_base10;
    MaterialButton matButton_c, matButton_sign, matButton_pi, matButton_divide, matButton_ms;
    MaterialButton matButton_7, matButton_8, matButton_9, matButton_multiply, matButton_mr;
    MaterialButton matButton_4, matButton_5, matButton_6, matButton_add, matButton_mc;
    MaterialButton matButton_3, matButton_2, matButton_1, matButton_subtract, matButton_mAdd;
    MaterialButton matButton_ac, matButton_0, matButton_decimal, matButton_equals, matButton_mSub;
    String memorized = "";
    String memoryToCalculate = "";
    String dataToCalculate = "";
    String finalResult = "";
    int i;

    // on create method
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // hide title bar
        getSupportActionBar().hide();

        // set view port ids
        memoryTv = findViewById(R.id.memory_tv);
        resultTv = findViewById(R.id.result_tv);
        solutionTv = findViewById(R.id.solution_tv);

        // set button ids
        matButton_bin = findViewById(R.id.button_bin);
        matButton_oct = findViewById(R.id.button_oct);
        matButton_hex = findViewById(R.id.button_hex);
        matButton_base10 = findViewById(R.id.button_base10);
        matButton_c = findViewById(R.id.button_c);
        matButton_ac = findViewById(R.id.button_ac);
        matButton_sign = findViewById(R.id.button_sign);
        matButton_add = findViewById(R.id.button_add);
        matButton_subtract = findViewById(R.id.button_subtract);
        matButton_divide = findViewById(R.id.button_divide);
        matButton_multiply = findViewById(R.id.button_multiply);
        matButton_decimal = findViewById(R.id.button_decimal);
        matButton_equals = findViewById(R.id.button_equals);
        matButton_pi = findViewById(R.id.button_pi);
        matButton_9 = findViewById(R.id.button_9);
        matButton_8 = findViewById(R.id.button_8);
        matButton_7 = findViewById(R.id.button_7);
        matButton_6 = findViewById(R.id.button_6);
        matButton_5 = findViewById(R.id.button_5);
        matButton_4 = findViewById(R.id.button_4);
        matButton_3 = findViewById(R.id.button_3);
        matButton_2 = findViewById(R.id.button_2);
        matButton_1 = findViewById(R.id.button_1);
        matButton_0 = findViewById(R.id.button_0);
        matButton_ms = findViewById(R.id.button_ms);
        matButton_mr = findViewById(R.id.button_mr);
        matButton_mc = findViewById(R.id.button_mc);
        matButton_mAdd = findViewById(R.id.button_mAdd);
        matButton_mSub = findViewById(R.id.button_mSub);

        // set on click listeners
        matButton_bin.setOnClickListener(this);
        matButton_oct.setOnClickListener(this);
        matButton_hex.setOnClickListener(this);
        matButton_base10.setOnClickListener(this);
        matButton_c.setOnClickListener(this);
        matButton_ac.setOnClickListener(this);
        matButton_sign.setOnClickListener(this);
        matButton_add.setOnClickListener(this);
        matButton_subtract.setOnClickListener(this);
        matButton_divide.setOnClickListener(this);
        matButton_multiply.setOnClickListener(this);
        matButton_decimal.setOnClickListener(this);
        matButton_equals.setOnClickListener(this);
        matButton_pi.setOnClickListener(this);
        matButton_9.setOnClickListener(this);
        matButton_8.setOnClickListener(this);
        matButton_7.setOnClickListener(this);
        matButton_6.setOnClickListener(this);
        matButton_5.setOnClickListener(this);
        matButton_4.setOnClickListener(this);
        matButton_3.setOnClickListener(this);
        matButton_2.setOnClickListener(this);
        matButton_1.setOnClickListener(this);
        matButton_0.setOnClickListener(this);
        matButton_ms.setOnClickListener(this);
        matButton_mr.setOnClickListener(this);
        matButton_mc.setOnClickListener(this);
        matButton_mAdd.setOnClickListener(this);
        matButton_mSub.setOnClickListener(this);

        // restore saved instance state upon rotation
        if(savedInstanceState != null){
            // recall variable instances
            memorized = savedInstanceState.getString("mem");
            memoryToCalculate = savedInstanceState.getString("memData");
            dataToCalculate = savedInstanceState.getString("data");
            finalResult = savedInstanceState.getString("result");

            // reassign variables to text views
            memoryTv.setText(memorized);
            solutionTv.setText(dataToCalculate);
            resultTv.setText(getResult(dataToCalculate));
        }
    }

    // on click method with switch statement
    @Override
    public void onClick(View view) {
        switch(view.getId()){
            // button 0
            case R.id.button_0:
                Log.i("TAG", "0 button was pressed.");
                dataToCalculate += "0";
                Log.i("TAG", "Current data to calculate: " + dataToCalculate);
                solutionTv.setText(dataToCalculate);
                resultTv.setText(getResult(dataToCalculate));
                break;

            // button 1
            case R.id.button_1:
                Log.i("TAG", "1 button was pressed.");
                dataToCalculate += "1";
                Log.i("TAG", "Current data to calculate: " + dataToCalculate);
                solutionTv.setText(dataToCalculate);
                resultTv.setText(getResult(dataToCalculate));
                break;

            // button 2
            case R.id.button_2:
                Log.i("TAG", "2 button was pressed.");
                dataToCalculate += "2";
                Log.i("TAG", "Current data to calculate: " + dataToCalculate);
                solutionTv.setText(dataToCalculate);
                resultTv.setText(getResult(dataToCalculate));
                break;

            // button 3
            case R.id.button_3:
                Log.i("TAG", "3 button was pressed.");
                dataToCalculate += "3";
                Log.i("TAG", "Current data to calculate: " + dataToCalculate);
                solutionTv.setText(dataToCalculate);
                resultTv.setText(getResult(dataToCalculate));
                break;

            // button 4
            case R.id.button_4:
                Log.i("TAG", "4 button was pressed.");
                dataToCalculate += "4";
                Log.i("TAG", "Current data to calculate: " + dataToCalculate);
                solutionTv.setText(dataToCalculate);
                resultTv.setText(getResult(dataToCalculate));
                break;

            // button 5
            case R.id.button_5:
                Log.i("TAG", "5 button was pressed.");
                dataToCalculate += "5";
                Log.i("TAG", "Current data to calculate: " + dataToCalculate);
                solutionTv.setText(dataToCalculate);
                resultTv.setText(getResult(dataToCalculate));
                break;

            // button 6
            case R.id.button_6:
                Log.i("TAG", "6 button was pressed.");
                dataToCalculate += "6";
                Log.i("TAG", "Current data to calculate: " + dataToCalculate);
                solutionTv.setText(dataToCalculate);
                resultTv.setText(getResult(dataToCalculate));
                break;

            // button 7
            case R.id.button_7:
                Log.i("TAG", "7 button was pressed.");
                dataToCalculate += "7";
                Log.i("TAG", "Current data to calculate: " + dataToCalculate);
                solutionTv.setText(dataToCalculate);
                resultTv.setText(getResult(dataToCalculate));
                break;

            // button 8
            case R.id.button_8:
                Log.i("TAG", "8 button was pressed.");
                dataToCalculate += "8";
                Log.i("TAG", "Current data to calculate: " + dataToCalculate);
                solutionTv.setText(dataToCalculate);
                resultTv.setText(getResult(dataToCalculate));
                break;

            // button 9
            case R.id.button_9:
                Log.i("TAG", "9 button was pressed.");
                dataToCalculate += "9";
                Log.i("TAG", "Current data to calculate: " + dataToCalculate);
                solutionTv.setText(dataToCalculate);
                resultTv.setText(getResult(dataToCalculate));
                break;

            // button decimal
            case R.id.button_decimal:
                Log.i("TAG", "Decimal button was pressed.");
                dataToCalculate += ".";
                Log.i("TAG", "Current data to calculate: " + dataToCalculate);
                solutionTv.setText(dataToCalculate);
                resultTv.setText(getResult(dataToCalculate));
                break;

            // button =
            case R.id.button_equals:
                Log.i("TAG", "= button was pressed.");
                Log.i("TAG", "Current data to calculate: " + dataToCalculate);
                solutionTv.setText(getResult(dataToCalculate));
                resultTv.setText(getResult(dataToCalculate));
                break;

            // button +
            case R.id.button_add:
                Log.i("TAG", "+ button was pressed.");
                dataToCalculate += "+";
                Log.i("TAG", "Current data to calculate: " + dataToCalculate);
                solutionTv.setText(dataToCalculate);
                break;

            // button -
            case R.id.button_subtract:
                Log.i("TAG", "- button was pressed.");
                dataToCalculate += "-";
                Log.i("TAG", "Current data to calculate: " + dataToCalculate);
                solutionTv.setText(dataToCalculate);
                break;

            // button *
            case R.id.button_multiply:
                Log.i("TAG", "* button was pressed.");
                dataToCalculate += "*";
                Log.i("TAG", "Current data to calculate: " + dataToCalculate);
                solutionTv.setText(dataToCalculate);
                break;

            // button /
            case R.id.button_divide:
                Log.i("TAG", "/ button was pressed.");
                dataToCalculate += "/";
                Log.i("TAG", "Current data to calculate: " + dataToCalculate);
                solutionTv.setText(dataToCalculate);
                break;

            // button +/-
            case R.id.button_sign:
                Log.i("TAG", "+/- button was pressed.");
                char lastChar = dataToCalculate.charAt(dataToCalculate.length() - 1);
                Log.i("TAG", "lastChar = " + lastChar);
                String lastCharS = "" + lastChar;
                if (lastCharS.equals("-")){
                    dataToCalculate = dataToCalculate.substring(0, dataToCalculate.length() - 1);
                }else{
                    dataToCalculate += "-";
                }
                Log.i("TAG", "Current data to calculate: " + dataToCalculate);
                solutionTv.setText(dataToCalculate);
                break;

            // button pi
            case R.id.button_pi:
                Log.i("TAG", "Pi button was pressed.");
                dataToCalculate += "3.14159";
                Log.i("TAG", "Current data to calculate: " + dataToCalculate);
                solutionTv.setText(dataToCalculate);
                break;

            // button AC
            case R.id.button_ac:
                Log.i("TAG", "AC button was pressed.");
                dataToCalculate = "";
                Log.i("TAG", "Current data to calculate: " + dataToCalculate);
                solutionTv.setText(dataToCalculate);
                resultTv.setText(dataToCalculate);
                break;

            // button C
            case R.id.button_c:
                Log.i("TAG", "C button was pressed.");
                if(dataToCalculate.length() == 0){
                    resultTv.setText("Error");
                }else {
                    dataToCalculate = dataToCalculate.substring(0, dataToCalculate.length() - 1);
                    solutionTv.setText(dataToCalculate);
                    if(dataToCalculate.length() > 0) {
                        Log.i("TAG", "Current data to calculate: " + dataToCalculate);
                        finalResult = getResult(dataToCalculate);
                        resultTv.setText(finalResult);
                    }else{
                        resultTv.setText("");
                    }
                }
                break;

            // button MS
            case R.id.button_ms:
                Log.i("TAG", "MS button was pressed.");
                memorized = resultTv.getText().toString();
                Log.i("TAG", "Stored in memory: " + memorized);
                memoryTv.setText(memorized);
                break;

            // button MR
            case R.id.button_mr:
                Log.i("TAG", "MR button was pressed.");
                dataToCalculate += memorized;
                Log.i("TAG", "Current data to calculate: " + dataToCalculate);
                solutionTv.setText(dataToCalculate);
                resultTv.setText(getResult(dataToCalculate));
                break;

            // button MC
            case R.id.button_mc:
                Log.i("TAG", "MC button was pressed.");
                memorized = "";
                Log.i("TAG", "Stored in memory: " + memorized);
                memoryTv.setText(memorized);
                break;

            // button M+
            case R.id.button_mAdd:
                Log.i("TAG", "M+ button was pressed.");
                memoryToCalculate = memorized + "+" + resultTv.getText().toString();
                Log.i("Tag", "Memory to calculate: " + memoryToCalculate);
                memorized = getResult(memoryToCalculate);
                Log.i("TAG", "Stored in memory: " + memorized);
                memoryTv.setText(memorized);
                break;

            // button M-
            case R.id.button_mSub:
                Log.i("TAG", "M- button was pressed.");
                memoryToCalculate = memorized + "-" + resultTv.getText().toString();
                Log.i("Tag", "Memory to calculate: " + memoryToCalculate);
                memorized = getResult(memoryToCalculate);
                Log.i("TAG", "Stored in memory: " + memorized);
                memoryTv.setText(memorized);
                break;

            // button bin
            case R.id.button_bin:
                Log.i("TAG", "bin button was pressed.");
                // check if data contains decimal point
                if(dataToCalculate.indexOf('.') >= 0){
                    resultTv.setText("Error (Dec Point)");
                }else{
                    i = Integer.parseInt(getResult(dataToCalculate));
                    String binary = Integer.toBinaryString(i);
                    resultTv.setText(binary);
                }
                break;

            // button oct
            case R.id.button_oct:
                Log.i("TAG", "bin button was pressed.");
                // check if data contains decimal point
                if(dataToCalculate.indexOf('.') >= 0){
                    resultTv.setText("Error (Dec Point)");
                }else{
                    i = Integer.parseInt(getResult(dataToCalculate));
                    String octal = Integer.toOctalString(i);
                    resultTv.setText(octal);
                }
                break;

            // button hex
            case R.id.button_hex:
                Log.i("TAG", "bin button was pressed.");
                // check if data contains decimal point
                if(dataToCalculate.indexOf('.') >= 0){
                    resultTv.setText("Error (Dec Point)");
                }else{
                    i = Integer.parseInt(getResult(dataToCalculate));
                    String hex = Integer.toHexString(i);
                    resultTv.setText(hex);
                }
                break;

            // button base10
            case R.id.button_base10:
                Log.i("TAG", "base10 button was pressed.");
                resultTv.setText(getResult(dataToCalculate));
                break;
        }
    }

    // overriding function to save variables for landscape rotation
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("mem", memorized);
        outState.putString("memData", memoryToCalculate);
        outState.putString("data", dataToCalculate);
        outState.putString("result", finalResult);
    }

    // function to calculate result, calls from org.mozilla imports
    String getResult(String data){
        try {
            Context context = Context.enter();
            context.setOptimizationLevel(-1);
            Scriptable scriptable = context.initStandardObjects();
            String finalResult = context.evaluateString(scriptable, data, "Javascript", 1, null).toString();
            if(finalResult.endsWith(".0")){
                finalResult = finalResult.replace(".0", "");
            }
            return finalResult;
        }catch(Exception e){
            return "Error";
        }
    }
}