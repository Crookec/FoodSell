package com.example.foodsell;


import android.os.Bundle;
import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.view.Menu;
import android.view.Window;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.TabWidget;
import android.widget.TextView;

public class MainActivity extends TabActivity {
	private Intent intent1,intent2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		
		intent1 = new Intent(getApplicationContext(),Land.class);
		intent2 = new Intent(getApplicationContext(),Register.class);
		final TabHost tab3 = getTabHost();
		TabWidget  tabWidget = tab3.getTabWidget();
		tab3.addTab(tab3.newTabSpec("all").setIndicator("登 录")
				.setContent(intent1));
		tab3.addTab(tab3.newTabSpec("ok").setIndicator("注 册")
				.setContent(intent2));
		for (int i =0; i < tabWidget.getChildCount(); i++) {  
	         //修改Tabhost高度和宽度
	         tabWidget.getChildAt(i).getLayoutParams().height = 60;  
	         tabWidget.getChildAt(i).getLayoutParams().width = 65;
	         //修改显示字体大小
	         TextView tv = (TextView) tabWidget.getChildAt(i).findViewById(android.R.id.title);
	         tv.setTextSize(15);
	         tv.setTextColor(this.getResources().getColorStateList(android.R.color.holo_blue_dark));
	        }
	
	      
	}


	  

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
}