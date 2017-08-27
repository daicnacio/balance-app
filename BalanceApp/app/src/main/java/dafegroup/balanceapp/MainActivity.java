package dafegroup.balanceapp;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button logout;
    private Session session;
    private ImageButton addTransx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        session = new Session(this);
        if(!session.loggedin()){
            logout();
        }
        logout = (Button)findViewById(R.id.btLogout);
        addTransx = (ImageButton)findViewById(R.id.btAddTransaction);

        logout.setOnClickListener(this);
        addTransx.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btLogout:
                logout();
                break;
            case R.id.btAddTransaction:
                startActivity(new Intent(MainActivity.this,TransactionActivity.class));
                break;
        }
    }

    private void logout(){
        session.setLoggedin(false);
        finish();
        startActivity(new Intent(MainActivity.this, LoginActivity.class));
    }
}
