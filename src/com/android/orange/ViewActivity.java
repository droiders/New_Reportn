package com.android.orange;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;



public class ViewActivity extends Activity{
	
	private ListView listeview;
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listeview);  
    }
}
