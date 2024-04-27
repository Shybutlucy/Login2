package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class dengluActivity extends AppCompatActivity implements View.OnClickListener {
    //声明控件
    private Button mBtnLogin;
    private EditText mEtUser;
    private EditText mEtPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_denglu);
        //找到控件
        mEtUser = findViewById(R.id.et_dl_1);
        mEtPassword = findViewById(R.id.et_dl_2);
        mBtnLogin = findViewById(R.id.btn_dl_login);

        //匹配正确的密码
    mBtnLogin.setOnClickListener(this);
    }
    public void onClick(View v){
        //获取输入的数据
        String username = mEtUser.getText().toString();
        String password = mEtPassword.getText().toString();
        //弹出内容设置
        String ok = "登录成功！";
        String fail = "密码或者账号有误，请重新登录！";
        Intent intent = null;

        //假设正确的用户名和密码为 yhy  123456
//        if(username.equals("sinvoice")&&password.equals("123456")){
//            //toast 普通版
//            Toast.makeText(getApplicationContext(),ok,Toast.LENGTH_SHORT).show();
//            intent = new Intent(dengluActivity.this,functionActivity.class);
//            startActivity(intent);
//        }else{
//            //不正确，弹出登录失败
//            //Toast 提升版，居中显示
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