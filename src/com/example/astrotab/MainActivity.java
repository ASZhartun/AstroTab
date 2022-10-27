package com.example.astrotab;



import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class MainActivity extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		TabHost th = getTabHost();
		
		TabSpec moonPhaseSpec = th.newTabSpec("MoonPhase");
		moonPhaseSpec.setIndicator("Phases", getResources().getDrawable(R.drawable.icon));
		Intent moonPhaseIntent = new Intent(this, MoonPhaseActivity.class);
		moonPhaseSpec.setContent(moonPhaseIntent);
		
		TabSpec seasonsSpec = th.newTabSpec("Seasons");
		seasonsSpec.setIndicator("Seasons", getResources().getDrawable(R.drawable.icon));
		Intent seasonsIntent = new Intent(this, SeasonsActivity.class);
		seasonsSpec.setContent(seasonsIntent);

		th.addTab(moonPhaseSpec);
		th.addTab(seasonsSpec);
	}

}
