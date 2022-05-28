package mcm.edu.ph.gloria_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import org.mariuszgromada.math.mxparser.Expression;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {

    private EditText usersInputBox;
    private ImageButton backspace;

    private Button btnClear;
    private Button btnPar;
    private Button btnExponent;
    private Button btnDivide;
    private Button btnSeven;
    private Button btnEight;
    private Button btnNine;
    private Button btnMultiply;
    private Button btnFour;
    private Button btnFive;
    private Button btnSix;
    private Button btnMinus;
    private Button btnOne;
    private Button btnTwo;
    private Button btnThree;
    private Button btnPlus;
    private Button btnPlus_Minus;
    private Button btnZero;
    private Button btnDecimal;
    private Button btnEqual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUI();
        usersInputBox.setText("");

        backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cursorPosEnd = usersInputBox.getSelectionEnd();
                int textLength = usersInputBox.getText().length();

                if (cursorPosEnd != 0 && textLength != 0){
                    SpannableStringBuilder selection = (SpannableStringBuilder) usersInputBox.getText();
                    selection.replace(cursorPosEnd - 1, cursorPosEnd, "");
                    usersInputBox.setText(selection);
                    usersInputBox.setSelection(cursorPosEnd - 1);
                }
            }
        });


        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = usersInputBox.getSelectionStart();
                usersInputBox.setText(updateText("0", usersInputBox.getText().toString(), pos));
                usersInputBox.setSelection(pos + 1);
            }
        });

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = usersInputBox.getSelectionStart();
                usersInputBox.setText(updateText("1", usersInputBox.getText().toString(), usersInputBox.getSelectionStart()));
                usersInputBox.setSelection(pos + 1);
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = usersInputBox.getSelectionStart();
                usersInputBox.setText(updateText("2", usersInputBox.getText().toString(), usersInputBox.getSelectionStart()));
                usersInputBox.setSelection(pos + 1);
            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = usersInputBox.getSelectionStart();
                usersInputBox.setText(updateText("3", usersInputBox.getText().toString(), usersInputBox.getSelectionStart()));
                usersInputBox.setSelection(pos + 1);
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = usersInputBox.getSelectionStart();
                usersInputBox.setText(updateText("4", usersInputBox.getText().toString(), usersInputBox.getSelectionStart()));
                usersInputBox.setSelection(pos + 1);
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = usersInputBox.getSelectionStart();
                usersInputBox.setText(updateText("5", usersInputBox.getText().toString(), usersInputBox.getSelectionStart()));
                usersInputBox.setSelection(pos + 1);
            }
        });

        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = usersInputBox.getSelectionStart();
                usersInputBox.setText(updateText("6", usersInputBox.getText().toString(), usersInputBox.getSelectionStart()));
                usersInputBox.setSelection(pos + 1);
            }
        });

        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = usersInputBox.getSelectionStart();
                usersInputBox.setText(updateText("7", usersInputBox.getText().toString(), usersInputBox.getSelectionStart()));
                usersInputBox.setSelection(pos + 1);
            }
        });

        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = usersInputBox.getSelectionStart();
                usersInputBox.setText(updateText("8", usersInputBox.getText().toString(), usersInputBox.getSelectionStart()));
                usersInputBox.setSelection(pos + 1);
            }
        });

        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = usersInputBox.getSelectionStart();
                usersInputBox.setText(updateText("9", usersInputBox.getText().toString(), usersInputBox.getSelectionStart()));
                usersInputBox.setSelection(pos + 1);
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                usersInputBox.setText("");
            }
        });

        btnExponent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = usersInputBox.getSelectionStart();
                usersInputBox.setText(updateText("^", usersInputBox.getText().toString(), usersInputBox.getSelectionStart()));
                usersInputBox.setSelection(pos + 1);
            }
        });

        btnPlus_Minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = usersInputBox.getSelectionStart();
                usersInputBox.setText(updateText("-", usersInputBox.getText().toString(), usersInputBox.getSelectionStart()));
                usersInputBox.setSelection(pos + 1);
            }
        });

        btnDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = usersInputBox.getSelectionStart();
                usersInputBox.setText(updateText(".", usersInputBox.getText().toString(), usersInputBox.getSelectionStart()));
                usersInputBox.setSelection(pos + 1);
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String expression = usersInputBox.getText().toString();

                expression = expression.replaceAll("÷", "/");
                expression = expression.replaceAll("×", "*");

                Expression exp = new Expression(expression);

                String result = String.valueOf(exp.calculate());

                usersInputBox.setText(result);
                usersInputBox.setSelection(result.length());

            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = usersInputBox.getSelectionStart();
                usersInputBox.setText(updateText("÷", usersInputBox.getText().toString(), usersInputBox.getSelectionStart()));
                usersInputBox.setSelection(pos + 1);
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = usersInputBox.getSelectionStart();
                usersInputBox.setText(updateText("×", usersInputBox.getText().toString(), usersInputBox.getSelectionStart()));
                usersInputBox.setSelection(pos + 1);
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = usersInputBox.getSelectionStart();
                usersInputBox.setText(updateText("-", usersInputBox.getText().toString(), usersInputBox.getSelectionStart()));
                usersInputBox.setSelection(pos + 1);
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = usersInputBox.getSelectionStart();
                usersInputBox.setText(updateText("+", usersInputBox.getText().toString(), usersInputBox.getSelectionStart()));
                usersInputBox.setSelection(pos + 1);
            }
        });

        btnPar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = usersInputBox.getSelectionStart();
                int openPar = 0;
                int closedPar = 0;
                int inboxLength = usersInputBox.getText().toString().length();

                for (int i = 0; i < usersInputBox.getSelectionStart(); i++){
                    if (usersInputBox.getText().toString().substring(i, i+1).equals("(")){
                        openPar += 1;
                    }
                    else if (usersInputBox.getText().toString().substring(i, i+1).equals(")")){
                        closedPar += 1;
                    }
                }

                if (openPar == closedPar || usersInputBox.getText().toString().substring(
                        inboxLength - 1, inboxLength).equals("(")){
                    //usersInputBox.setText(String.format("%s%s", usersInputBox.getText().toString(), "("));
                    usersInputBox.setText(updateText("(", usersInputBox.getText().toString(), usersInputBox.getSelectionStart()));
                }
                else if (closedPar < openPar && !usersInputBox.getText().toString().substring(
                        inboxLength - 1, inboxLength).equals("(")){
                    //usersInputBox.setText(String.format("%s%s", usersInputBox.getText().toString(), ")"));
                    usersInputBox.setText(updateText(")", usersInputBox.getText().toString(), usersInputBox.getSelectionStart()));
                }
                usersInputBox.setSelection(pos + 1);
            }
        });

    }

    private void setupUI() {
        usersInputBox = findViewById(R.id.textView);
        usersInputBox.setShowSoftInputOnFocus(false);

        backspace = findViewById(R.id.backspace);

        btnClear = findViewById(R.id.btnClear);
        btnPar = findViewById(R.id.btnPar);
        btnExponent = findViewById(R.id.btnExponent);
        btnDivide = findViewById(R.id.btnDivide);
        btnSeven = findViewById(R.id.btnSeven);
        btnEight = findViewById(R.id.btnEight);
        btnNine = findViewById(R.id.btnNine);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnFour = findViewById(R.id.btnFour);
        btnFive = findViewById(R.id.btnFive);
        btnSix = findViewById(R.id.btnSix);
        btnMinus = findViewById(R.id.btnMinus);
        btnOne = findViewById(R.id.btnOne);
        btnTwo = findViewById(R.id.btnTwo);
        btnThree = findViewById(R.id.btnThree);
        btnPlus = findViewById(R.id.btnPlus);
        btnZero = findViewById(R.id.btnZero);
        btnDecimal = findViewById(R.id.btnDecimal);
        btnEqual = findViewById(R.id.btnEqual);
    }
    private String updateText(String stringToAdd, String oldString, int cursorPos){
        String leftOfCursor = oldString.substring(0, cursorPos);
        String rightOfCursor = oldString.substring(cursorPos);

        return leftOfCursor + stringToAdd + rightOfCursor;

    }
}