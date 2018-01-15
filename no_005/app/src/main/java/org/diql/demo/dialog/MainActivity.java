package org.diql.demo.dialog;

import android.app.Dialog;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // dialog show() 时，背景默认为半透明。
        new AlertDialog.Builder(this)
                // 设置图标
                .setIcon(R.mipmap.ic_launcher)
                .setTitle("小车账户充值")
                .setMessage("给1号小车充值44元")
                .setPositiveButton("确定", null)
                .setNegativeButton("取消", null)
                // 中间按钮
                .setNeutralButton("忽略", null)
                .create()
                .show();
    }
}
