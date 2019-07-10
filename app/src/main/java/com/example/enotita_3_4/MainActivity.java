package com.example.enotita_3_4;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity{

    double input1 = 0;
    double input2 = 0;
    boolean Addition;
    boolean Subtraction;
    boolean Multiplication;
    boolean Division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText edtxt_screen = findViewById(R.id.edtxt_screen);
        Button btn_prc = findViewById(R.id.btn_percent);
        Button btn_squareRoot = findViewById(R.id.btn_sq_root);
        Button btn_square = findViewById(R.id.btn_square);
        Button btn_fraction = findViewById(R.id.btn_fraction);
        Button btn_CE = findViewById(R.id.btn_CE);
        Button btn_C = findViewById(R.id.btn_C);
        Button btn_delete = findViewById(R.id.btn_del);
        Button btn_divide = findViewById(R.id.btn_div);
        Button btn_seven = findViewById(R.id.btn_7);
        Button btn_eight = findViewById(R.id.btn_8);
        Button btn_nine = findViewById(R.id.btn_9);
        Button btn_multiply = findViewById(R.id.btn_multiply);
        Button btn_four = findViewById(R.id.btn_4);
        Button btn_five = findViewById(R.id.btn_5);
        Button btn_six = findViewById(R.id.btn_6);
        Button btn_subtract = findViewById(R.id.btn_subtract);
        Button btn_one = findViewById(R.id.btn_1);
        Button btn_two = findViewById(R.id.btn_2);
        Button btn_three = findViewById(R.id.btn_3);
        Button btn_plus = findViewById(R.id.btn_add);
        Button btn_plusminus = findViewById(R.id.btn_plusminus);
        Button btn_zero = findViewById(R.id.btn_0);
        Button btn_decimal = findViewById(R.id.btn_decimal);
        Button btn_equal = findViewById(R.id.btn_equals);

        btn_prc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input1 = Float.parseFloat(edtxt_screen.getText() + "");
                edtxt_screen.setText(input1 / 100 + "");
            }
        });

        btn_squareRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String display = edtxt_screen.getText().toString();
                double sqroot = Double.valueOf(display);
                double dis_sqroot = Math.sqrt(sqroot);
                String res = String.valueOf(dis_sqroot);
                edtxt_screen.setText(res);
            }
        });

        btn_square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input1 = Float.parseFloat(edtxt_screen.getText() + "");
                edtxt_screen.setText(input1 * input1 + "");
            }
        });

        btn_fraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input1 = Float.parseFloat(edtxt_screen.getText() + "");
                edtxt_screen.setText(1 / input1 + "");
            }
        });

        btn_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtxt_screen.setText(edtxt_screen.getText() + "0");
            }
        });

        btn_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtxt_screen.setText(edtxt_screen.getText() + "1");
            }
        });

        btn_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtxt_screen.setText(edtxt_screen.getText() + "2");
            }
        });

        btn_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtxt_screen.setText(edtxt_screen.getText() + "3");
            }
        });

        btn_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtxt_screen.setText(edtxt_screen.getText() + "4");
            }
        });

        btn_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtxt_screen.setText(edtxt_screen.getText() + "5");
            }
        });

        btn_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtxt_screen.setText(edtxt_screen.getText() + "6");
            }
        });

        btn_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtxt_screen.setText(edtxt_screen.getText() + "7");
            }
        });

        btn_eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtxt_screen.setText(edtxt_screen.getText() + "8");
            }
        });

        btn_nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtxt_screen.setText(edtxt_screen.getText() + "9");
            }
        });

        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtxt_screen.getText().length() != 0) {
                    input1 = Float.parseFloat(edtxt_screen.getText() + "");
                    Addition = true;
                    edtxt_screen.setText(null);
                }
            }
        });

        btn_subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtxt_screen.getText().length() != 0) {
                    input1 = Float.parseFloat(edtxt_screen.getText() + "");
                    Subtraction = true;
                    edtxt_screen.setText(null);
                }
            }
        });

        btn_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtxt_screen.getText().length() != 0) {
                    input1 = Float.parseFloat(edtxt_screen.getText() + "");
                    Multiplication = true;
                    edtxt_screen.setText(null);
                }
            }
        });

        btn_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtxt_screen.getText().length() != 0) {
                    input1 = Float.parseFloat(edtxt_screen.getText() + "");
                    Division = true;
                    edtxt_screen.setText(null);
                }
            }
        });

        btn_CE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtxt_screen.setText("");
                input2 = 0.0;
            }
        });

        btn_C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtxt_screen.setText("");
                input1 = 0.0;
                input2 = 0.0;
            }
        });

        btn_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String display = edtxt_screen.getText().toString();
                if (display.length() > 1) {
                    display = display.substring(0, display.length() - 1);
                    edtxt_screen.setText(display);
                }
                else if (display.length() <= 1) {
                    edtxt_screen.setText("");
                }
            }
        });

        btn_plusminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input1 = Float.parseFloat(edtxt_screen.getText() + "");
                if (input1 < 0) {
                    double neg = Math.abs(input1);
                    String str_neg = String.valueOf(neg);
                    edtxt_screen.setText(str_neg);
                } else if (input1 > 0) {
                    double pos = Double.valueOf(input1);
                    pos = -pos;
                    String str_pos = String.valueOf(pos);
                    edtxt_screen.setText(str_pos);
                }
            }
        });

        btn_decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtxt_screen.getText().length() == 0) {
                    edtxt_screen.setText("0.");
                }else if (edtxt_screen.getText().toString().contains(".")) {
                }else {
                    edtxt_screen.setText(edtxt_screen.getText() + ".");
                }
            }
        });

        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Addition || Subtraction || Multiplication || Division) {
                    input2 = Float.parseFloat(edtxt_screen.getText() + "");
                }
                if (Addition) {
                    edtxt_screen.setText(input1 + input2 + "");
                    Addition = false;
                }
                if (Subtraction) {
                    edtxt_screen.setText(input1 - input2 + "");
                    Subtraction = false;
                }
                if (Multiplication) {
                    edtxt_screen.setText(input1 * input2 + "");
                    Multiplication = false;
                }
                if (Division) {
                    edtxt_screen.setText(input1 / input2 + "");
                    Division = false;
                }
            }
        });
    }
}

