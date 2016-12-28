package org.diql.no_002;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * @author diql
 */
public class MainActivity extends AppCompatActivity {

    protected LinearLayout mLlRoot;
    private int[] mDrawables = {
            R.drawable.ic_00,
            R.drawable.ic_01,
            R.drawable.ic_02
    };
    private int mCurrIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);
        mLlRoot = (LinearLayout) findViewById(R.id.ll_root);

        final ImageView imageView = new ImageView(this);
        mLlRoot.addView(imageView);
        imageView.setImageResource(mDrawables[0]);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 改变要显示的图片.
                imageView.setImageResource(mDrawables[++mCurrIndex % mDrawables.length]);
            }
        });
    }

}
