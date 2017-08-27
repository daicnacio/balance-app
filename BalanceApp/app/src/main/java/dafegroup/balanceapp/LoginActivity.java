package dafegroup.balanceapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    private Button login;
    private TextView register;
    private EditText etName, etPass;
    private DBHelper db;
    private Session session;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        db = new DBHelper(this);
        session = new Session(this);
        login = (Button)findViewById(R.id.btLogin);
        register = (TextView)findViewById(R.id.tvRegister);
        etName = (EditText)findViewById(R.id.etName);
        etPass = (EditText)findViewById(R.id.etPass);

        login.setOnClickListener(this);
        register.setOnClickListener(this);

        if(session.loggedin()){
            startActivity(new Intent(LoginActivity.this, MainActivity.class));
            finish();
        }

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.btLogin:
                login();
                break;
            case R.id.tvRegister:
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
                break;
        }
    }

    private void login() {
        String name = etName.getText().toString();
        String pass = etPass.getText().toString();

        if(db.getUser(name,pass)){
            session.setLoggedin(true);
            startActivity(new Intent(LoginActivity.this, MainActivity.class));
            finish();
        }else{
            Toast.makeText(getApplicationContext(), "Wrong name/password", Toast.LENGTH_SHORT).show();
        }
    }
}
