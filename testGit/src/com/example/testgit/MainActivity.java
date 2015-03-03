package com.example.testgit;

import android.os.Bundle;
import android.app.Activity;
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
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
