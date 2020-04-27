package vn.edu.ntu.truonghoangkhoa.truonghoangkhoa_59131078_simplewidget;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtN, edtD, edtSTK;
    RadioGroup rdGT;
    CheckBox cb1, cb2, cb3, cb4, cb5;
    Button btXN;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addView();
        addEvents();
    }
    void addView()
    {
        edtN = findViewById(R.id.edtN);
        edtD = findViewById(R.id.edtD);
        edtSTK = findViewById(R.id.edtSTK);

        rdGT = findViewById(R.id.rdGT);

        cb1 = findViewById(R.id.cb1);
        cb2 = findViewById(R.id.cb2);
        cb3 = findViewById(R.id.cb3);
        cb4 = findViewById(R.id.cb4);
        cb5 = findViewById(R.id.cb5);

        btXN = findViewById(R.id.btXN);
    }
    void addEvents()
    {
        btXN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = "";
                text += edtN.getText().toString();
                text += "\nNgày sinh: " + edtD.getText().toString();

                switch (rdGT.getCheckedRadioButtonId())
                {
                    case R.id.rdNam: text += "\nGiới tính: Nam";break;
                    case R.id.rdNU: text += "\nGiới tính: Nữ";break;
                }

                text += "\nSở thích :";

                if (cb1.isChecked()) text += cb1.getText().toString() + ";";
                if (cb2.isChecked()) text += cb2.getText().toString() + ";";
                if (cb3.isChecked()) text += cb3.getText().toString() + ";";
                if (cb4.isChecked()) text += cb4.getText().toString() + ";";
                if (cb5.isChecked()) text += cb5.getText().toString() + ";";

                text += edtSTK.getText().toString();

                Toast.makeText(getApplicationContext(),text, Toast.LENGTH_LONG).show();
            }
        });
    }
}
