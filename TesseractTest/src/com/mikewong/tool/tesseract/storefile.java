package com.mikewong.tool.tesseract;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.Format;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class storefile extends Activity{
	EditText et;
	EditText et2;
	String text;
	Spinner spinner;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
        setContentView(R.layout.activity02);
		Log.i("fff","ddd");
		et = (EditText) findViewById(R.id.et);
		et2 = (EditText) findViewById(R.id.et2);
		spinner = (Spinner) findViewById(R.id.sp);
		
		Intent intent = getIntent();
		text = intent.getStringExtra("text");
		et.setText(text);		
	}
	public void save(View v) throws IOException{
		text = et.getText().toString();
		String name = et2.getText().toString();
		String format = spinner.getSelectedItem().toString();
		File f=new File( MainActivity.TXT_PATH + "//"+name+format);
		if(!f.exists())
		{
			f.createNewFile();
		}
		FileWriter outf=new FileWriter(f);
		BufferedWriter bufferout=new BufferedWriter(outf);
		bufferout.write(text);
		Toast.makeText(getApplicationContext(), "´æ´¢³É¹¦£¡", Toast.LENGTH_LONG).show();
		bufferout.flush();
		bufferout.close();
	}

	public void returntoMain(View v){
		Intent intent = new Intent(this,MainActivity.class);
		startActivity(intent);
	}
}
