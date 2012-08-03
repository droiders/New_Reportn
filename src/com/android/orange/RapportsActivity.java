package com.android.orange;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;


public class RapportsActivity extends  TabActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //TextView textview = new TextView(this);
        setContentView(R.layout.activity_main); 
        
    
            Resources res = getResources(); // Resource object to get Drawables
            TabHost tabHost = getTabHost();  // The activity TabHost
            TabHost.TabSpec spec;  // Resusable TabSpec for each tab
            Intent intent;  // Reusable Intent for each tab
            // Create an Intent to launch an Activity for the tab (to be reused)

            intent = new Intent().setClass(this, ListesActivity.class);
            
            // Initialize a TabSpec for each tab and add it to the TabHost
           spec = tabHost.newTabSpec("liste").setIndicator("",
                              res.getDrawable(R.drawable.rapports))
                          .setContent(intent);
            tabHost.addTab(spec);
            
            intent = new Intent().setClass(this, ViewActivity.class);
            
            // Initialize a TabSpec for each tab and add it to the TabHost
            spec = tabHost.newTabSpec("view").setIndicator("",
                              res.getDrawable(R.drawable.partage))
                          .setContent(intent);
            tabHost.addTab(spec);
            
            intent = new Intent().setClass(this, RSSExampleActivity.class);
            
            spec = tabHost.newTabSpec("rss").setIndicator("",
                    res.getDrawable(R.drawable.info))
                .setContent(intent);
            tabHost.addTab(spec);
           
//
//            intent = new Intent().setClass(this, SongsActivity.class);
//            spec = tabHost.newTabSpec("songs").setIndicator("Songs",
//                              res.getDrawable(R.drawable.ic_tab_songs))
//                          .setContent(intent);
//            tabHost.addTab(spec);

            tabHost.setCurrentTab(2);
        }
}