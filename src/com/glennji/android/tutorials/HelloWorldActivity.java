package com.glennji.android.tutorials;

import android.app.Activity;
import android.widget.TextView;

import com.googlecode.androidannotations.annotations.AfterViews;
import com.googlecode.androidannotations.annotations.EActivity;
import com.googlecode.androidannotations.annotations.ViewById;
import com.googlecode.androidannotations.annotations.res.StringRes;

@EActivity(R.layout.main)
public class HelloWorldActivity extends Activity {

	@StringRes
	String hello;
	
	@ViewById
	TextView messageText;
	
	@AfterViews
	void setMessageText() {
		messageText.setText(hello);
	}

}