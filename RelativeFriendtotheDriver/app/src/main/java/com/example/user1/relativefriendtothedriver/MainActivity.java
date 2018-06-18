package com.example.user1.relativefriendtothedriver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import javax.security.auth.login.LoginException;

public class MainActivity extends AppCompatActivity {

    private EditText Email;
    private  EditText Password;
    private Button Login;
    private ImageView Logo;
    private int Counter=5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Email=(EditText)findViewById(R.id.emailText);
        Password=(EditText)findViewById(R.id.passText);
        Logo= (ImageView)findViewById(R.id.imageView);
        Login=(Button)findViewById(R.id.btnLogIn);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(Email.getText().toString(), Password.getText().toString());

            }
        });

    }

    private  void validate (String Email , String Password)
    {
       if((Email=="Admin")&&(Password=="1234"))
       {

           Intent intent =new Intent(MainActivity.this , HomeScreen.class);
           startActivity(intent);
       }
       else
           {
             Counter--;
             if(Counter==0)
             {
               Login.setEnabled(false);
             }
       }
    }

}
