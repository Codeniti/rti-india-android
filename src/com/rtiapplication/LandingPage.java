package com.rtiapplication;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import android.app.Activity;
import android.widget.EditText;

@EActivity(R.layout.activity_landing_page)
public class LandingPage extends Activity {

	@ViewById
	
	EditText fromName,fromAdd1;
	
	
	@AfterViews
	public void calledAfterViewInjections()
	{
		
	}

}
