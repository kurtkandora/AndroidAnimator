package com.example.androidanimator;

import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
	private TextView mQuoteLabel;
	private final Handler mHandler = new Handler();
	private final Handler mHandler2 = new Handler();
	private Quote mquote;
	private MyAnimation manimation;
	private MyColor mcolor;
	private RelativeLayout mlayout;

	private final Runnable rAnimate = new Runnable()
	{
	  public void run()
	  {
		  animate();
	      mHandler.postAtTime(this, SystemClock.uptimeMillis() + 4000);
	  }
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mQuoteLabel = (TextView) findViewById(R.id.lQuote);
		mquote= new Quote();
		manimation= new MyAnimation();
		mcolor= new MyColor();
		mlayout= (RelativeLayout)findViewById(R.id.lback);
		
		rAnimate.run();

	}

	private void animate() {
		mQuoteLabel.setText(mquote.getQuote());
		mlayout.setBackgroundColor(mcolor.getBackGroundColor());
		mQuoteLabel.setTextColor(mcolor.getTextGroundColor());
		mQuoteLabel.startAnimation(manimation.getAnimation(this));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
