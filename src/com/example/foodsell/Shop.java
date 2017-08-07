package com.example.foodsell;

import java.util.ArrayList;
import java.util.List;
import com.example.foodsell.R;

import edu.zafu.GouwucheAdapter;
import edu.zafu.ShangpinAdapter;
import edu.zafu.gouwuchemessage;
import edu.zafu.shangpinmessage;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
public class Shop extends ActionBarActivity {
	private List<shangpinmessage> shangpinList= new ArrayList<shangpinmessage>();
	private List<gouwuchemessage> gouwucheList= new ArrayList<gouwuchemessage>();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_shop);
		final DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer);
		ImageView jmp_waimai = (ImageView) findViewById(R.id.jmp_waimai);
		jmp_waimai.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(Shop.this,Choose.class);
				startActivity(intent);
			}
		});
		
		Button btn_gouwuche = (Button) findViewById(R.id.gouwuche);
		btn_gouwuche.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				drawer.openDrawer(Gravity.RIGHT);
			}
		});
		Button btn_quxiadan = (Button) findViewById(R.id.quxiadan);
		btn_quxiadan.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent2=new Intent(Shop.this,QRdingdan.class);
				startActivity(intent2);
			}
		});
		
		initShangpin();
	    ShangpinAdapter adapter = new ShangpinAdapter(Shop.this,R.layout.shangpin_item,shangpinList);
	    ListView listView =(ListView) findViewById(R.id.list_shangpin);
	    listView.setAdapter(adapter);
	    
	    initGouwuche();
	    GouwucheAdapter gwcadapter = new GouwucheAdapter(Shop.this,R.layout.gouwuche_item,gouwucheList);
	    ListView gwclistView =(ListView) findViewById(R.id.list_gouwuche);
	    gwclistView.setAdapter(gwcadapter);
	}
	private void initShangpin(){
		shangpinmessage shangpin1=new shangpinmessage("ÁøÒ¶Õô½È","500µ¥","£¤ 8");
		shangpinList.add(shangpin1);
		shangpinmessage shangpin2=new shangpinmessage("ÈýÏÊÉ°¹ø","267µ¥","£¤ 15");
		shangpinList.add(shangpin2);
		shangpinList.add(shangpin2);shangpinList.add(shangpin2);shangpinList.add(shangpin2);
		shangpinList.add(shangpin2);shangpinList.add(shangpin2);shangpinList.add(shangpin2);
		shangpinList.add(shangpin2);shangpinList.add(shangpin2);shangpinList.add(shangpin2);
		shangpinList.add(shangpin2);shangpinList.add(shangpin2);shangpinList.add(shangpin2);
		shangpinList.add(shangpin2);shangpinList.add(shangpin2);shangpinList.add(shangpin2);
		shangpinList.add(shangpin2);shangpinList.add(shangpin2);shangpinList.add(shangpin2);
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
