package com.example.foodsell;

import java.util.ArrayList;
import java.util.List;

import edu.zafu.GouwucheAdapter;
import edu.zafu.gouwuchemessage;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.ListView;

public class Dingdanxq extends ActionBarActivity {
	private List<gouwuchemessage> gouwucheList= new ArrayList<gouwuchemessage>();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_dingdanxq);
		 initGouwuche();
		    GouwucheAdapter gwcadapter = new GouwucheAdapter(Dingdanxq.this,R.layout.gouwuche_item,gouwucheList);
		    ListView gwclistView =(ListView) findViewById(R.id.list_caidan);
		    gwclistView.setAdapter(gwcadapter);
	}
	private void initGouwuche(){
		gouwuchemessage gouwuche1=new gouwuchemessage("ÁøÒ¶Õô½È","x1","£¤ 8");
		gouwucheList.add(gouwuche1);
		gouwuchemessage gouwuche2=new gouwuchemessage("ÈýÏÊÉ°¹ø","x1","£¤ 15");
		gouwucheList.add(gouwuche2);
		gouwucheList.add(gouwuche2);gouwucheList.add(gouwuche2);gouwucheList.add(gouwuche2);
		gouwucheList.add(gouwuche2);gouwucheList.add(gouwuche2);gouwucheList.add(gouwuche2);
		gouwucheList.add(gouwuche2);gouwucheList.add(gouwuche2);gouwucheList.add(gouwuche2);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.dingdanxq, menu);
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
