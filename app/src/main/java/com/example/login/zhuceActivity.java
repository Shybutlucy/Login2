package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class zhuceActivity extends AppCompatActivity implements View.OnClickListener {
//    //声明控件
    private Button mBtnLogin;
    private EditText mEtUser;
    private EditText mEtPassword1;
    private EditText mEtPassword2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zhuce);
        //找到控件
        mEtUser = findViewById(R.id.et_zc_1);
        mEtPassword1 = findViewById(R.id.et_zc_2);
        mEtPassword2 = findViewById(R.id.et_zc_3);
        mBtnLogin = findViewById(R.id.btn_zc_login);
        mBtnLogin.setOnClickListener(this);
    }

    public void onClick(View v) {
        //获取输入的数据
        String username = mEtUser.getText().toString();
        String password1 = mEtPassword1.getText().toString();
        String password2 = mEtPassword2.getText().toString();
        String ok = "注册成功！";
        String fail = "两次输入的密码不匹配，请重新输入！";
        Intent intent = null;


//        if (password1.equals(password2)) {
//            Toast.makeText(getApplicationContext(),ok,Toast.LENGTH_SHORT).show();
//            intent = new Intent(zhuceActivity.this, functionActivity.class);
//            startActivity(intent);
//        } else {
//            //不正确，弹出登录失败
//            Toast toastCenter = Toast.makeText(getApplicationContext(),fail,Toast.LENGTH_SHORT);
//            toastCenter.setGravity(Gravity.CENTER,0,0);
//            toastCenter.show();
//        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}