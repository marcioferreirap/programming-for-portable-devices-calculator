package br.cesed.marcio.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textOp;
    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnPlus,btnMin,btnMult,btnDiv,btnEquals,btnDel ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textOp = (TextView) findViewById(R.id.txtOp);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);
        btn7 = (Button)findViewById(R.id.btn7);
        btn8 = (Button)findViewById(R.id.btn8);
        btn9 = (Button)findViewById(R.id.btn9);
        btn0 = (Button)findViewById(R.id.btn0);
        btnPlus = (Button)findViewById(R.id.btnPlus);
        btnMin = (Button)findViewById(R.id.btnMin);
        btnMult = (Button)findViewById(R.id.btnMult);
        btnDiv = (Button)findViewById(R.id.btnDiv);
        btnEquals = (Button)findViewById(R.id.btnEquals);
        btnDel = (Button)findViewById(R.id.btnDel);

        textOp.setText("");
    }


    public void clickBtn1 (View view){
        textOp.append("1");
    }

    public void clickBtn2 (View view){
        textOp.append("2");
    }

    public void clickBtn3 (View view){
        textOp.append("3");
    }

    public void clickBtn4 (View view){
        textOp.append("4");
    }

    public void clickBtn5 (View view){
        textOp.append("5");
    }

    public void clickBtn6 (View view){
        textOp.append("6");
    }

    public void clickBtn7 (View view){
        textOp.append("7");
    }

    public void clickBtn8 (View view){
        textOp.append("8");
    }

    public void clickBtn9 (View view){
        textOp.append("9");
    }

    public void clickBtn0 (View view){
        textOp.append("0");
    }

    public void clickBtnPlus (View view){
        textOp.append(" + ");
    }

    public void clickBtnMin (View view){
        textOp.append(" - ");
    }

    public void clickBtnMult (View view){
        textOp.append(" x ");
    }

    public void clickBtnDiv (View view){
        textOp.append(" / ");
    }

    public void clickBtnDel (View view){
        textOp.setText("");
    }


    public void clickBtnResult(View view) {
        String txtResult = textOp.getText().toString();
        String[] components = txtResult.split(" ");
        Double total;

        double op1 = Double.parseDouble(components[0].replace(",","."));
        double op2 = Double.parseDouble(components[2].replace(",",".")) ;
        String operador = components[1];

        switch (operador) {
            case "+":
                textOp.setText(String.format("%.0f",op1 + op2));
                break;
            case "-":
                textOp.setText(String.format("%.0f",op1 - op2));
                break;
            case "/":
                textOp.setText(String.format("%.4f",op1 / op2));
                break;
            case "x":
                textOp.setText(String.format("%.0f",op1 * op2));
                break;
            default:
                textOp.setText ("error");
                break;

        }

    }
}
