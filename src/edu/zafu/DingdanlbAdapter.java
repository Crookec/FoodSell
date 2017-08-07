package edu.zafu;

import java.util.List;

import com.example.foodsell.*;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class DingdanlbAdapter extends ArrayAdapter<dingdanlbmessage> {
	private int resourceId;
	
	public DingdanlbAdapter(Context context, int textViewResourceId,List<dingdanlbmessage> objects) {
		super(context, textViewResourceId,objects);
		resourceId = textViewResourceId;
		// TODO Auto-generated constructor stub
	}


	
	@Override
	public View getView(int position,View convertView,ViewGroup parent){
		dingdanlbmessage ddlb=getItem(position);
		View view=LayoutInflater.from(getContext()).inflate(resourceId, null);
		TextView dianming=(TextView) view.findViewById(R.id.dianming);
		TextView ddzhuangtai=(TextView) view.findViewById(R.id.ddzhuangtai);
		TextView ddshijian=(TextView) view.findViewById(R.id.ddshijian);
		Bitmap bm=getDrawable(ddlb.getDD_tuname());
		ImageView dpimg=(ImageView) view.findViewById(R.id.diantu);
		dpimg.setImageBitmap(bm);
		dianming.setText(ddlb.getDD_dianming());
		ddzhuangtai.setText(ddlb.getDD_zhuangtai());
		ddshijian.setText(ddlb.getDD_shijian());
		return view;
		
		
	}
	
	//根据图片名称取得对应图片
		public Bitmap getDrawable(String name) {
			ApplicationInfo appInfo =getContext().getApplicationInfo();
			int resID = getContext().getResources().getIdentifier(name, "drawable", appInfo.packageName);
			//解析资源文件夹下，id为resID的图片
			return BitmapFactory.decodeResource(getContext().getResources(),  resID);
			}


	

}
