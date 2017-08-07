package edu.zafu;

import java.util.List;

import com.example.foodsell.*;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class ShangpinAdapter extends ArrayAdapter<shangpinmessage> {
	private int resourceId;
	
	public ShangpinAdapter(Context context, int textViewResourceId,List<shangpinmessage> objects) {
		super(context, textViewResourceId,objects);
		resourceId = textViewResourceId;
		// TODO Auto-generated constructor stub
	}


	
	@Override
	public View getView(int position,View convertView,ViewGroup parent){
		shangpinmessage shangpin=getItem(position);
		View view=LayoutInflater.from(getContext()).inflate(resourceId, null);
		TextView shiwuming=(TextView) view.findViewById(R.id.shiwuming);
		TextView xiaoliang=(TextView) view.findViewById(R.id.xiaoliang);
		TextView shiwujiage=(TextView) view.findViewById(R.id.shiwujiage);
		shiwuming.setText(shangpin.getSP_name());
		xiaoliang.setText(shangpin.getSP_xiaoliang());
		shiwujiage.setText(shangpin.getSP_jiage());
		
		return view;
		
		
	}
	
	

	

}
