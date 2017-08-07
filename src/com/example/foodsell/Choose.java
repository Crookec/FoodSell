package com.example.foodsell;

import android.app.ActivityGroup;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Window;
import android.widget.TabHost;
@SuppressWarnings("deprecation")
public class Choose extends ActivityGroup {
private TabHost tabHost;
private Intent intent1;
private Intent intent2;
private Intent intent3;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_choose);
           
        this.intent1 = new Intent(this, Waimai.class);
        this.intent2 = new Intent(this, Dingdan.class);
        this.intent3 = new Intent(this, Wode.class);
        
        Bundle bundle = new Bundle();
        bundle.putString("height","10000");
        intent1.putExtras(bundle);
        startActivity(intent1);
        
        tabHost=(TabHost)findViewById(R.id.mytabhost);
        tabHost.setup();
        tabHost.setup(this.getLocalActivityManager()); 
        LayoutInflater inflater = LayoutInflater.from(this);  
        inflater.inflate(R.layout.activity_waimai, tabHost.getTabContentView()); 
        inflater.inflate(R.layout.activity_dingdan, tabHost.getTabContentView());
        inflater.inflate(R.layout.activity_wode, tabHost.getTabContentView());
       
        tabHost.addTab(tabHost.newTabSpec("tab1").setIndicator("外卖").setContent(this.intent1));
        tabHost.addTab(tabHost.newTabSpec("tab2").setIndicator("订 单").setContent(this.intent2));
        tabHost.addTab(tabHost.newTabSpec("tab3").setIndicator("我 的").setContent(this.intent3));
    }
}