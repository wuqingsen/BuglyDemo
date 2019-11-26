package com.tencent.bugly.hotfix.easy;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

//import com.devilwwj.jni.TestJNI;
import com.tencent.bugly.beta.Beta;

/**
 * 改动 1.Beta.loadLibrary("mylib")删除;
 * 2.libs 文件删除,本地加载so库报错：TestJNI
 * 3.加载本地so库注释
 * 4.手动加载补丁包、手动合成补丁包，版本检查注释
 * 5.androidmanifest.xml注释内容：android:debuggable="true"
 */
public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "存在bug", Toast.LENGTH_SHORT).show();
//                Toast.makeText(MainActivity.this, "修复了bug，以便测试", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
