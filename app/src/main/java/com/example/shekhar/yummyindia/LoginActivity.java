package com.example.shekhar.yummyindia;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button loginButton = (Button) findViewById(R.id.logInButton);

        final EditText passwordText = (EditText) findViewById(R.id.passwordText);
        final EditText emailAddress = (EditText) findViewById(R.id.emailAddressText);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(null != emailAddress.getText() && emailAddress.getText().length() == 0){
                    emailAddress.setError("Email address is mandatory");
                }
                if(null != passwordText.getText() && passwordText.getText().length() < 8) {
                    passwordText.setError("Password should be greater than 8 characters");
                }
                
            }
        });

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
