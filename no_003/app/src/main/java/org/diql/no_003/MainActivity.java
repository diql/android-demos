package org.diql.no_003;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    protected ListView mLv01;
    protected ListView mLv02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mLv01 = (ListView) findViewById(R.id.lv_01);
        mLv02 = (ListView) findViewById(R.id.lv_02);

        String[] arr1 = {"孙悟空", "猪八戒", "沙悟净"};
        ArrayAdapter<String> adapter1 =
                new ArrayAdapter<>(this, R.layout.array_item, arr1);
        mLv01.setAdapter(adapter1);

        String[] arr2 = {"Java", "Hibernate", "Spring", "Android"};
        ArrayAdapter<String> adapter2 =
                new ArrayAdapter<>(this, R.layout.checked_item, arr2);
        mLv02.setAdapter(adapter2);
    }
}
