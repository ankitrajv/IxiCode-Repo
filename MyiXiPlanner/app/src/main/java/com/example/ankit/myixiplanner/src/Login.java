package com.example.ankit.myixiplanner.src;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.ankit.myixiplanner.R;
import com.example.ankit.myixiplanner.utility.Utility;
import com.facebook.login.widget.LoginButton;
import com.google.android.gms.common.SignInButton;

public class Login extends AppCompatActivity implements View.OnClickListener {

    private View seprateViewLine;
    private SignInButton google_btn;
    private LoginButton fb_btn;
    private TextView skip_btn;
    private int width;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        width = Utility.getScreenWidth(this);
        seprateViewLine = (View) findViewById(R.id.view_line);
        google_btn = (SignInButton) findViewById(R.id.gmail_button);
        fb_btn = (LoginButton) findViewById(R.id.facebook_button);
        skip_btn = (TextView) findViewById(R.id.skip);

        google_btn.setOnClickListener(this);
        fb_btn.setOnClickListener(this);
        skip_btn.setOnClickListener(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        seprateViewLine.getLayoutParams().height = (int) (width * .20);
        google_btn.getLayoutParams().width = (int) (width * .49);
        fb_btn.getLayoutParams().width = (int) (width * .49);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.gmail_button:
                startActivity(new Intent(Login.this, Dashboard.class));
                finish();
                break;

            case R.id.facebook_button:
                startActivity(new Intent(Login.this, Dashboard.class));
                finish();
                break;

            case R.id.skip:
                startActivity(new Intent(Login.this, Dashboard.class));
                finish();
                break;
        }

    }
}
