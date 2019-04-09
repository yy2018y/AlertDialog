package com.example.yang.alertdialog;

import android.content.Context;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Context mContext;
    private TextView tv;
    private EditText et1;
    private EditText et2;
    private Button btok;
    private Button btcancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_dialog);
        this.mContext=this;
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        View dialogView = layoutInflater.inflate(R.layout.my_dialog, null);
        tv=(TextView) dialogView.findViewById(R.id.tv);
        et1=(EditText) dialogView.findViewById(R.id.et1);
        et2=(EditText) dialogView.findViewById(R.id.et2);
        btok=(Button) dialogView.findViewById(R.id.btn_ok);
        btcancel=(Button) dialogView.findViewById(R.id.btn_cancel);
        android.app.AlertDialog dialog=new android.app.AlertDialog.Builder(mContext)
                .setTitle(null)
                .setView(dialogView)                //加载自定义的对话框式样
                .setNeutralButton("Cancel", null)
                .setPositiveButton("Sign in", null)

                .create();


        dialog.show();
    }
}
