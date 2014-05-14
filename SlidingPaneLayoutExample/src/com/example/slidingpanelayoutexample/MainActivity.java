package com.example.slidingpanelayoutexample;

import android.os.Bundle;
import android.app.Activity;
import android.support.v4.widget.SlidingPaneLayout;
import android.view.Menu;

import com.actionbarsherlock.app.SherlockFragmentActivity;

public class MainActivity extends SherlockFragmentActivity{

    private SlidingPaneLayout mSlidingPaneLayout;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

        mSlidingPaneLayout = (SlidingPaneLayout) findViewById(R.id.sliding_pane);
        mSlidingPaneLayout.setParallaxDistance(200);
        mSlidingPaneLayout.setShadowDrawable(getResources().getDrawable(R.drawable.shad_slide_pane));

	}



	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
