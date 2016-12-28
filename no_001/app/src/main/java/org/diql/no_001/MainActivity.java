package org.diql.no_001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Date;

/**
 * created by diql on 2016/12/28.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 创建一个线性布局管理器.
        LinearLayout linearLayout = new LinearLayout(this);
        // 设置 Activity 显示该 layout.
        setContentView(linearLayout);

        // textView，用来显示文字.
        final TextView textView = new TextView(this);
        // 把textView加入到布局管理器中.
        linearLayout.addView(textView);

        // button，用来设置点击事件.
        Button button = new Button(this);
        // button 文字.
        button.setText(R.string.ok);
        // button 如何显示.
        button.setLayoutParams(new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        ));
        // 为button设置点击事件。
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 在button点击之后，为textView设置文本.
                textView.setText("Hello , Android ," + new Date());
            }
        });
        linearLayout.addView(button);
    }
}
