package com.example.testgit;

import java.text.SimpleDateFormat;
import java.util.Date;

import android.os.Bundle;
import android.R.integer;
import android.app.Activity;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// this is a tips
		// 1-git add testGit 将修改的文件或则目录添加到暂存区
		// 2-git commit -m "说明"	 将暂存区提交到本地库
		// 3-git push origin master 将本地推送到远程库
		SQLiteHelper dbHelper = new SQLiteHelper(this, "accounting.db", null, 1);
		SQLiteDatabase dbInstance = dbHelper.getWritableDatabase();	//创建或打开一个只写数据库
//		SQLiteDatabase dbInstance = dbHelper.getReadableDatabase();	//创建或打开一个只读数据库
		
		 
		String d = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		ContentValues content = getContent(188, 2, 2015,03,05,"djfkd", d, d);
		long insertResult = dbInstance.insert("accounting", null, content);
		System.out.println("insertResult="+insertResult);
	}

	private ContentValues getContent(int price,int type,int year,int month,int day,String note,String ctm,String utm){
		ContentValues content = new ContentValues();
		content.put("price", price);
		content.put("type", type);
		content.put("year", year);
		content.put("month", month);
		content.put("day", day);
		content.put("note", note);
		content.put("ctm", "2015-03-02 07:56:10");
		content.put("utm", utm);
		return content;
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
