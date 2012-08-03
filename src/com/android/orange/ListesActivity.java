package com.android.orange;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;



public class ListesActivity extends Activity{
	
	private ListView listerapports;
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listerapports);  
    }
}
