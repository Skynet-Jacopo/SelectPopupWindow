package com.lxm.selectpicpopupwindow;

import java.util.ArrayList;
import java.util.List;

import com.lxm.selectpicpopupwindow.been.Items;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

public class SelectPicPopupWindow extends Activity implements OnClickListener {

//	private Button btn_take_photo, btn_pick_photo, btn_cancel;
//	private LinearLayout layout;
//	List<Items> items;
//	Items itemss;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.alert_dialog);
//		btn_take_photo = (Button) this.findViewById(R.id.btn_take_photo);
//		btn_pick_photo = (Button) this.findViewById(R.id.btn_pick_photo);
//		btn_cancel = (Button) this.findViewById(R.id.btn_cancel);
//		ListView listView = (ListView) findViewById(R.id.listview);
//		items = new ArrayList<Items>();
//		itemss = new Items();
//		for(int i=0;i<2;i++){
//			
//			itemss.setNo("11");
//			itemss.setItem_name("aa");
//			itemss.setSearch_time("cc");
//			items.add(itemss);
//		}
//		
//		MyAdapter adapter = new MyAdapter(getApplication(),items);
//		listView.setAdapter(adapter);
//		layout = (LinearLayout) findViewById(R.id.pop_layout);

		// 添加选择窗口范围监听可以优先获取触点，即不再执行onTouchEvent()函数，点击其他地方时执行onTouchEvent()函数销毁Activity
//		layout.setOnClickListener(new OnClickListener() {
//
//			public void onClick(View v) {
//				// TODO Auto-generated method stub
//				Toast.makeText(getApplicationContext(), "提示：点击窗口外部关闭窗口！",
//						Toast.LENGTH_SHORT).show();
//			}
//		});
//		// 添加按钮监听
//		btn_cancel.setOnClickListener(this);
//		btn_pick_photo.setOnClickListener(this);
//		btn_take_photo.setOnClickListener(this);
	}

	// 实现onTouchEvent触屏函数但点击屏幕时销毁本Activity
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		finish();
		return true;
	}
//
//	public void onClick(View v) {
//		switch (v.getId()) {
//		case R.id.btn_take_photo:
//			break;
//		case R.id.btn_pick_photo:
//			break;
//		case R.id.btn_cancel:
//			break;
//		default:
//			break;
//		}
//		finish();
//	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}

}
