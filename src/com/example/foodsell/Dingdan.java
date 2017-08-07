package com.example.foodsell;

import java.util.ArrayList;
import java.util.List;

import edu.zafu.DingdanlbAdapter;
import edu.zafu.ShangpinAdapter;
import edu.zafu.dingdanlbmessage;
import edu.zafu.gouwuchemessage;
import edu.zafu.shangpinmessage;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

public class Dingdan extends ActionBarActivity {
	private List<dingdanlbmessage> dingdanlbList= new ArrayList<dingdanlbmessage>();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dingdan);
		initDingdanlb();
	    DingdanlbAdapter ddlbadapter = new DingdanlbAdapter(Dingdan.this,R.layout.dingdanlb_item,dingdanlbList);
	    ListView listView =(ListView) findViewById(R.id.list_dingdanlb);
	    listView.setAdapter(ddlbadapter);
	}
	private void initDingdanlb(){
		dingdanlbmessage dingdan1=new dingdanlbmessage("d_sx","沙县小吃","订单完成","2016-12-15 14:00");
		dingdanlbList.add(dingdan1);
		dingdanlbList.add(dingdan1);
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.dingdan, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
