package id.sch.smktelkom.www;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private String nama,tanggal,alamat,hobi,keinginan,telp;
    private TextView tvName, tvBirthday, tvAddress, tvTelp, tvHobby, tvDream;


    EditText edt_name;
    EditText edt_birthday;
    EditText edt_address;
    EditText edt_telp;
    EditText edt_hobby;
    EditText edt_dream;

    Button btn_got;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_name = (EditText) findViewById(R.id.edt_name);
        edt_birthday = (EditText) findViewById(R.id.edt_birthday);
        edt_address = (EditText) findViewById(R.id.edt_address);
        edt_telp = (EditText) findViewById(R.id.edt_telp);
        edt_hobby = (EditText) findViewById(R.id.edt_hobby);
        edt_dream = (EditText) findViewById(R.id.edt_dream);
        tvName = findViewById(R.id.tv_name);
        tvBirthday = findViewById(R.id.tv_birthday);
        tvAddress = findViewById(R.id.tv_address);
        tvTelp = findViewById(R.id.tv_telp);
        tvHobby = findViewById(R.id.tv_hobby);
        tvDream = findViewById(R.id.tv_dream);

        btn_got = (Button) findViewById(R.id.btn_got);
        btn_got.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        String name = edt_name.getText().toString();
        tvName.setText(name);
        String birthday = edt_birthday.getText().toString();
        tvBirthday.setText(birthday);
        String address = edt_address.getText().toString();
        tvAddress.setText(address);
        String telp = edt_telp.getText().toString();
        tvTelp.setText(telp);
        String hobby = edt_hobby.getText().toString();
        tvHobby.setText(hobby);
        String dream = edt_dream.getText().toString();
        tvDream.setText(dream);


        }


}