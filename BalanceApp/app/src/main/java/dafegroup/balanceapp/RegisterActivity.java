package dafegroup.balanceapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener{

    private Button reg;
    private TextView tvLogin;
    private EditText etName, etPass;
    private DBHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        db = new DBHelper(this);
        reg = (Button)findViewById(R.id.btRegister);
        tvLogin = (TextView)findViewById(R.id.tvBack);
        etName = (EditText)findViewById(R.id.etName);
        etPass = (EditText)findViewById(R.id.etPass);

        reg.setOnClickListener(this);
        tvLogin.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btRegister:
                register();
                break;
            case R.id.tvBack:
                startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
                break;
            default:
        }
    }

    public void register(){
        String name = etName.getText().toString();
        String pass = etPass.getText().toString();
        if(name.isEmpty()){
            displayToast("Username field empty");
        }else if(pass.isEmpty()){
            displayToast("Password field empty");
        }else{
            db.addUser(name,pass);
            displayToast("User registered");
            finish();
        }
    }

    public void displayToast(String msg){
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
    }
}
