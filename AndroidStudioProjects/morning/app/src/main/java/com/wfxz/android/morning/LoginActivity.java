package com.wfxz.android.morning;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by wf on 16-3-3.
 */
public class LoginActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login(View view){

        EditText editText1 = (EditText)findViewById(R.id.username);
        EditText editText2 = (EditText)findViewById(R.id.pwd);

        String username = editText1.getText().toString();
        String pwd = editText2.getText().toString();

        if (username == "biangbiang" && pwd == "123") {

            Toast.makeText(this,"登录成功",Toast.LENGTH_SHORT);

            Intent intent1 = new Intent(this,LoginSuccessActivity.class);
            startActivity(intent1);

        }else{

            Toast.makeText(this,"登录失败",Toast.LENGTH_SHORT);

            Intent intent2 = new Intent(this,LoginFailActivity.class);
            startActivity(intent2);
        }

    }


}
