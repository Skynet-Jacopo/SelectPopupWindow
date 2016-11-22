package com.lxm.selectpicpopupwindow;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.lxm.selectpicpopupwindow.been.Items;

public class MyAdapter extends BaseAdapter{
	List<Items> items;
	private LayoutInflater mInflater = null;
	public MyAdapter(Context context,List<Items> items) {
		this.mInflater = LayoutInflater.from(context);
		this.items = items;
	}

	@Override
	public int getCount() {
		return items.size();
	}

	@Override
	public Object getItem(int position) {
		return position;
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder = null;
		if(convertView == null){
			holder = new ViewHolder();
			convertView = mInflater.inflate(R.layout.list_item, null);
			holder.no =(TextView) convertView.findViewById(R.id.no);
			holder.item_name =(TextView) convertView.findViewById(R.id.item_name);
			holder.search_time =(TextView) convertView.findViewById(R.id.search_time);
			convertView.setTag(holder);
		}else{
			holder = (ViewHolder)convertView.getTag();
		}
		holder.no.setText(items.get(position).no);
		holder.item_name.setText(items.get(position).item_name);
		holder.search_time.setText(items.get(position).search_time);
		return convertView;
	}
	  //ViewHolder静态类
    static class ViewHolder
    {
    	public TextView no;
        public TextView item_name;
        public TextView search_time;
    }
}
