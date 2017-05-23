package jp.ac.chiba_fjb.x15g029.test17;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //追加先のインスタンス取得
        LinearLayout output = (LinearLayout) findViewById(R.id.output);

        LinearLayout layout;
        layout = (LinearLayout)getLayoutInflater().inflate(R.layout.layout1,null);
        output.addView(layout);

        layout = (LinearLayout)getLayoutInflater().inflate(R.layout.layout1, null);   //レイアウトをその場で生成
        output.addView(layout);

        layout = (LinearLayout)getLayoutInflater().inflate(R.layout.layout1, null);   //レイアウトをその場で生成
        output.addView(layout);


//        //親のビューを取得
//        View v = findViewById(R.id.include1);
//        //親のビューからfindViewByIdを使用する
//        TextView textView = (TextView) v.findViewById(R.id.textView);
//        textView.setText("テキスト設定");
    }
}
