package com.rtiapplication;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

@EActivity(R.layout.activity_landing_page)
public class LandingPage extends Activity implements OnItemSelectedListener {

	File sdCard,dir,file;
	FileOutputStream fout;
	OutputStreamWriter osw;
	@ViewById
	
	EditText fromName,fromAdd1,q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,fromCity,fromState,fromPinCode,fromAdd2,toPa,toAdd1,toAdd2,toCity,toState,toPin,description;
	private Spinner spinner1;
	
	@AfterViews
	public void calledAfterViewInjections()
	{
		
	}
	
	public void onRadioButtonClicked(View view) {
	    // Is the button now checked?
	    boolean checked = ((RadioButton) view).isChecked();
	    
	    // Check which radio button was clicked
	    switch(view.getId()) {
	        case R.id.yes:
	            if (checked)
	            
	            break;
	        case R.id.no:
	            if (checked)
	             
	            break;
	    }
	}
	public void rticharge(View view) {
	    // Is the button now checked?
	    boolean checked = ((RadioButton) view).isChecked();
	    
	    // Check which radio button was clicked
	    switch(view.getId()) {
	        case R.id.cfc:
	            if (checked)
	            
	            break;
	        case R.id.ipo:
	            if (checked)
	             
	            break;
	        case R.id.dd:
	            if (checked)
	             
	            break;
	    }
	}
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	//	spinner1.setOnItemSelectedListener(this);
	  }
	public void onItemSelected(AdapterView<?> parent, View view, 
            int pos, long id) {
		if(pos==0){
			description.setText(getResources().getString(R.string.txt_ration_description).toString());
			q1.setText(getResources().getString(R.string.txt_ration_q1).toString());
			q2.setText(getResources().getString(R.string.txt_ration_q2).toString());
			q3.setText(getResources().getString(R.string.txt_ration_q3).toString());
			q4.setText(getResources().getString(R.string.txt_ration_q4).toString());
			q5.setText(getResources().getString(R.string.txt_ration_q5).toString());
			q6.setText(getResources().getString(R.string.txt_ration_q6).toString());
		}
		else if(pos==1)
		{
			description.setText(getResources().getString(R.string.txt_ration_description).toString());
			q1.setText(getResources().getString(R.string.txt_status_epf_q1).toString());
			q2.setText(getResources().getString(R.string.txt_status_epf_q2).toString());
			q3.setText(getResources().getString(R.string.txt_status_epf_q3).toString());
			q4.setText(getResources().getString(R.string.txt_status_epf_q4).toString());
			q5.setText(getResources().getString(R.string.txt_status_epf_q5).toString());
			q6.setText(getResources().getString(R.string.txt_status_epf_q6).toString());
			q7.setText(getResources().getString(R.string.txt_status_epf_q7).toString());
			q8.setText(getResources().getString(R.string.txt_status_epf_q8).toString());
			q9.setText(getResources().getString(R.string.txt_status_epf_q9).toString());
			q10.setText(getResources().getString(R.string.txt_status_epf_q10).toString());
		}
		else if(pos==2)
		{
			description.setText(getResources().getString(R.string.txt_status_pending_discription).toString());
			q1.setText(getResources().getString(R.string.txt_status_pending_q1).toString());
			q2.setText(getResources().getString(R.string.txt_status_pending_q2).toString());
			q3.setText(getResources().getString(R.string.txt_status_pending_q3).toString());
			q4.setText(getResources().getString(R.string.txt_status_pending_q4).toString());
			q5.setText(getResources().getString(R.string.txt_status_pending_q5).toString());
			q6.setText(getResources().getString(R.string.txt_status_pending_q6).toString());
			q7.setText(getResources().getString(R.string.txt_status_pending_q7).toString());
			q8.setText(getResources().getString(R.string.txt_status_pending_q8).toString());
		}
		else if(pos==3)
		{
			description.setText(getResources().getString(R.string.txt_enquiry_mla_discription).toString());
			q1.setText(getResources().getString(R.string.txt_enquiry_mla_q1).toString());
			q2.setText(getResources().getString(R.string.txt_enquiry_mla_q2).toString());
			q3.setText(getResources().getString(R.string.txt_enquiry_mla_q3).toString());
			q4.setText(getResources().getString(R.string.txt_enquiry_mla_q4).toString());
		}
		else if(pos==4)
		{
			description.setText(getResources().getString(R.string.txt_list_streets_discription).toString());
			q1.setText(getResources().getString(R.string.txt_list_streets_q1).toString());
			q2.setText(getResources().getString(R.string.txt_list_streets_q2).toString());
			q3.setText(getResources().getString(R.string.txt_list_streets_q3).toString());
			q4.setText(getResources().getString(R.string.txt_list_streets_q4).toString());
			q5.setText(getResources().getString(R.string.txt_list_streets_q5).toString());
			q6.setText(getResources().getString(R.string.txt_list_streets_q6).toString());
			q7.setText(getResources().getString(R.string.txt_list_streets_q7).toString());
			q8.setText(getResources().getString(R.string.txt_list_streets_q8).toString());
			q9.setText(getResources().getString(R.string.txt_list_streets_q9).toString());
			q10.setText(getResources().getString(R.string.txt_list_streets_q10).toString());
		}
		else if(pos==5)
		{
			description.setText(getResources().getString(R.string.txt_status_complaint_description).toString());
			q1.setText(getResources().getString(R.string.txt_status_complaint_q1).toString());
			q2.setText(getResources().getString(R.string.txt_status_complaint_q2).toString());
			q3.setText(getResources().getString(R.string.txt_status_complaint_q3).toString());
			q4.setText(getResources().getString(R.string.txt_status_complaint_q4).toString());
			q5.setText(getResources().getString(R.string.txt_status_complaint_q5).toString());
			q6.setText(getResources().getString(R.string.txt_status_complaint_q6).toString());
			q7.setText(getResources().getString(R.string.txt_status_complaint_q7).toString());
		}
		else if(pos==6)
		{
			description.setText(getResources().getString(R.string.txt_scholar_description).toString());
			q1.setText(getResources().getString(R.string.txt_scholar_q1).toString());
			q2.setText(getResources().getString(R.string.txt_scholar_q2).toString());
			q3.setText(getResources().getString(R.string.txt_scholar_q3).toString());
			q4.setText(getResources().getString(R.string.txt_scholar_q4).toString());
			q5.setText(getResources().getString(R.string.txt_scholar_q5).toString());
			q6.setText(getResources().getString(R.string.txt_scholar_q6).toString());
			q7.setText(getResources().getString(R.string.txt_scholar_q7).toString());
			q8.setText(getResources().getString(R.string.txt_scholar_q8).toString());
			q9.setText(getResources().getString(R.string.txt_scholar_q9).toString());
		}
		else if(pos==7)
		{
			description.setText(getResources().getString(R.string.txt_oldage_description).toString());
			q1.setText(getResources().getString(R.string.txt_oldage_q1).toString());
			q2.setText(getResources().getString(R.string.txt_oldage_q2).toString());
			q3.setText(getResources().getString(R.string.txt_oldage_q3).toString());
			q4.setText(getResources().getString(R.string.txt_oldage_q4).toString());
			q5.setText(getResources().getString(R.string.txt_oldage_q5).toString());
			q6.setText(getResources().getString(R.string.txt_oldage_q6).toString());
			q7.setText(getResources().getString(R.string.txt_oldage_q7).toString());
		}
		else if(pos==8)
		{
			description.setText("");
			q1.setText("");
			q2.setText("");
			q3.setText("");
			q4.setText("");
			q5.setText("");
			q6.setText("");
			q7.setText("");
			q8.setText("");
			q9.setText("");
			q10.setText("");
		}
		
			
    }

    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }
    public void generate(View v)throws Exception{
    	sdCard=Environment.getExternalStorageDirectory();
    	dir=new File(sdCard.getAbsolutePath()+"/rti");
    	dir.mkdirs();
    	file=new File(dir,"rti.html");
    	fout=new FileOutputStream(file);
    	osw=new OutputStreamWriter(fout);
    	try
    	{
    		final String htmlcode=new String("<!DOCTYPE html><html><head><style> h4 { padding: 0px; margin: 0px; } </style></head><body><h3><center>Application for Information under the Right to Information Act, 2005</center></h3><pre style='text-align:right'> Date:                             </pre><h4>From</h4>"+fromName.getText().toString()+"<br/>"+fromAdd1.getText().toString()+"<br/>"+fromAdd2.getText().toString()+"<br/>"    	+fromCity.getText().toString()+"<br/>"+fromState.getText().toString()+" - "+fromPinCode.getText().toString()+"<br/><br/><h4>To</h4>Public Information Officer<br/>"+toPa.getText().toString()+"<br/>"+toAdd1.getText().toString()+"<br/>"+toAdd2.getText().toString()+"<br/>"+toCity.getText().toString()+"<br/>"+toState.getText().toString()+" - "+toPin.getText().toString()+"<br/><br/><h4>Subject</h4>Application under Right to Information Act, 2005<br/><br/><h4>Description of Information Required</h4>"+description.getText().toString()+"<br/><br/>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;"+q1.getText().toString()+"<br/><br/>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;"+q2.getText().toString()+"<br/><br/>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;"+q3.getText().toString()+"<br/><br/>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;"+q4.getText().toString()+"<br/><br/>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;"+q5.getText().toString()+"<br/><br/>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;"+q6.getText().toString()+"<br/><br/>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;"+q7.getText().toString()+"<br/><br/>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;"+q8.getText().toString()+"<br/><br/>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;"+q9.getText().toString()+"<br/><br/>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;"+q10.getText().toString()+"<br/><br/><br/>RTI Application fee of Rs. 10 is affixed as court fee Stamp<br/><br/>Applicant<br/><br/><br/><br/>"+fromName.getText().toString()+"</body></html>");

    	osw.write(htmlcode);
    	}
    	catch(Exception e){;};
   // 	finally
    //	{
    		osw.flush();
    		osw.close();
    //		return;
    //	}
    }
	
}

