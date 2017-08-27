package dafegroup.balanceapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class TransactionActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction);

        back = (ImageButton)findViewById(R.id.ibBack);

        back.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.ibBack:
                startActivity(new Intent(TransactionActivity.this, MainActivity.class));
                break;
        }
    }
}
