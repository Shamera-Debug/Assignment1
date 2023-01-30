package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private TextView process;
    private TextView result;

    private StringBuilder resultString;
    private StringBuilder processString;
    private double firstValue;
    private double secondValue;
    private String currentOperation = "";
    private double finalResult = 0;
    private boolean err = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt1 = findViewById(R.id.num1);
        Button bt2 = findViewById(R.id.num2);
        Button bt3 = findViewById(R.id.num3);
        Button bt4 = findViewById(R.id.num4);
        Button bt5 = findViewById(R.id.num5);
        Button bt6 = findViewById(R.id.num6);
        Button bt7 = findViewById(R.id.num7);
        Button bt8 = findViewById(R.id.num8);
        Button bt9 = findViewById(R.id.num9);
        Button bt0 = findViewById(R.id.num0);

        Button btPlus = findViewById(R.id.add);
        Button btDiv = findViewById(R.id.div);
        Button btMin = findViewById(R.id.sub);
        Button btMul = findViewById(R.id.mul);
        Button btEql = findViewById(R.id.equal);
        Button btClr = findViewById(R.id.clear);


        process = findViewById(R.id.calculation_process);
        result = findViewById(R.id.result);

        resultString = new StringBuilder();
        processString = new StringBuilder();

        bt1.setOnClickListener(view -> {
            resultString.append("1");
            process.setText(resultString.toString());
            processString.append("1");
            process.setText(processString.toString());
        });

        bt2.setOnClickListener(view -> {
            resultString.append("2");
            process.setText(resultString.toString());
            processString.append("2");
            process.setText(processString.toString());
        });

        bt3.setOnClickListener(view -> {
            resultString.append("3");
            process.setText(resultString.toString());
            processString.append("3");
            process.setText(processString.toString());
        });

        bt4.setOnClickListener(view -> {
            resultString.append("4");
            process.setText(resultString.toString());
            processString.append("4");
            process.setText(processString.toString());
        });

        bt5.setOnClickListener(view -> {
            resultString.append("5");
            process.setText(resultString.toString());
            processString.append("5");
            process.setText(processString.toString());
        });

        bt6.setOnClickListener(view -> {
            resultString.append("6");
            process.setText(resultString.toString());
            processString.append("6");
            process.setText(processString.toString());
        });

        bt7.setOnClickListener(view -> {
            resultString.append("7");
            process.setText(resultString.toString());
            processString.append("7");
            process.setText(processString.toString());
        });

        bt8.setOnClickListener(view -> {
            resultString.append("8");
            process.setText(resultString.toString());
            processString.append("8");
            process.setText(processString.toString());
        });

        bt9.setOnClickListener(view -> {
            resultString.append("9");
            process.setText(resultString.toString());
            processString.append("9");
            process.setText(processString.toString());
        });

        bt0.setOnClickListener(view -> {
            resultString.append("0");
            process.setText(resultString.toString());
            processString.append("0");
            process.setText(processString.toString());
        });


        //-------------------------------------------------------------------------------------

        btPlus.setOnClickListener(view -> {
            if (!resultString.toString().isEmpty())
            {
                if (!currentOperation.equals(""))
                {
                    err = true;
                }
            else
                {
                    firstValue = Double.parseDouble(resultString.toString());
                    currentOperation = "+";
                    resultString = new StringBuilder();
                }
                processString.append("+");
                process.setText(processString.toString());
            }
            else
            {
                processString.append("+");
                process.setText(processString.toString());
                err = true;
            }

        });

        btDiv.setOnClickListener(view -> {
            if (!resultString.toString().isEmpty())
            {
                if (!currentOperation.equals(""))
                {
                    err = true;
                }
                else
                {
                    firstValue = Double.parseDouble(resultString.toString());
                    currentOperation = "/";
                    resultString = new StringBuilder();
                }
                processString.append("/");
                process.setText(processString.toString());
            }
            else
            {
                processString.append("/");
                process.setText(processString.toString());
                err = true;
            }

        });

        btMin.setOnClickListener(view -> {
            if (!resultString.toString().isEmpty())
            {
                if (!currentOperation.equals(""))
                {
                    err = true;
                }
                else
                {
                    firstValue = Double.parseDouble(resultString.toString());
                    currentOperation = "-";
                    resultString = new StringBuilder();
                }
                processString.append("-");
                process.setText(processString.toString());
            }
            else
            {
                processString.append("-");
                process.setText(processString.toString());
                err = true;
            }

        });

        btMul.setOnClickListener(view -> {
            if (!resultString.toString().isEmpty())
            {
                if (!currentOperation.equals(""))
                {
                    err = true;
                }
                else
                {
                    firstValue = Double.parseDouble(resultString.toString());
                    currentOperation = "*";
                    resultString = new StringBuilder();
                }
                processString.append("*");
                process.setText(processString.toString());
            }
            else
            {
                processString.append("*");
                process.setText(processString.toString());
                err = true;
            }
        });


        btClr.setOnClickListener(view -> {
            resultString = new StringBuilder();
            result.setText(resultString.toString());
            processString = new StringBuilder();
            process.setText(resultString.toString());
            result.setText("");
            firstValue = 0;
            secondValue = 0;
            currentOperation = "";
            err = false;
        });

        btEql.setOnClickListener(view -> {
            if (!resultString.toString().isEmpty())
            {
                if (err)
                {
                    processString.append("=Error");
                    process.setText(processString.toString());

                }
                else
                {
                    processString.append("=");
                    process.setText(processString.toString());
                    secondValue = Double.parseDouble(resultString.toString());
                    calculate();
                }
            }
            else
            {
                processString.append("=Error");
                process.setText(processString.toString());
            }
        });
    }

    private void calculate() {
        switch (currentOperation) {
            case "+":
                finalResult = firstValue + secondValue;
                break;
            case "/":
                finalResult = firstValue / secondValue;
                break;
            case "-":
                finalResult = firstValue - secondValue;
                break;
            case "*":
                finalResult = firstValue * secondValue;
                break;


        }
        resultString = new StringBuilder(String.valueOf(finalResult));
        result.setText(resultString.toString());
    }
}