package edu.zafu;

import java.util.List;

import com.example.foodsell.*;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class GouwucheAdapter extends ArrayAdapter<gouwuchemessage> {
	private int resourceId;
	
	public GouwucheAdapter(Context context, int textViewResourceId,List<gouwuchemessage> objects) {
		super(context, textViewResourceId,objects);
		resourceId = textViewResourceId;
		// TODO Auto-generated constructor stub
	}


	
	@Override
	public View getView(int position,View convertView,ViewGroup parent){
		gouwuchemessage gouwuche=getItem(position);
		View view=LayoutInflater.from(getContext()).inflate(resourceId, null);
		TextView gwcname=(TextView) view.findViewById(R.id.gwcname);
		TextView gwcshuliang=(TextView) view.findViewById(R.id.gwcshuliang);
		TextView gwczongjia=(TextView) view.findViewById(R.id.gwczongjia);
		gwcname.setText(gouwuche.getGWC_name());
		gwcshuliang.setText(gouwuche.getGWC_shuliang());
		gwczongjia.setText(gouwuche.getGWC_zongjia());
		
		return view;
		
		
	}
	
	

	

}
