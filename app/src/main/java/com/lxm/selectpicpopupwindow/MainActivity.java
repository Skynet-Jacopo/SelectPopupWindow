package com.lxm.selectpicpopupwindow;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 
        TextView tv = (TextView) this.findViewById(R.id.text);
        //把文字控件添加监听，点击弹出自定义窗口
        tv.setOnClickListener(new OnClickListener() {			
			public void onClick(View v) {
				startActivity(new Intent(MainActivity.this,SelectPicPopupWindow.class));
			}
		});
    }
    
}
