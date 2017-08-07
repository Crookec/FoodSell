package com.example.foodsell;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Waimai extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_waimai);
		
		EditText jmp_souso = (EditText) findViewById(R.id.sousuotext);
		jmp_souso.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(Waimai.this,Sousuo.class);
				startActivity(intent);
			}
		});
		
		
		LinearLayout jmp_dianpu = (LinearLayout) findViewById(R.id.dianpu);
		jmp_dianpu.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(Waimai.this,Shop.class);
				startActivity(intent);
			}
		});
		
		Intent intent;
		 Bundle bunde;
		intent = this.getIntent();
		bunde = intent.getExtras();
		String height = bunde.getString("height");
		TextView ceshi =(TextView) findViewById(R.id.ceshi);
		ceshi.setText(height);
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.waimai, menu);
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
