package com.example.androidanimator;

import java.util.Random;

import android.support.v7.app.ActionBarActivity;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MyAnimation {

	public MyAnimation() {
		// TODO Auto-generated constructor stub
	}
	public Animation getAnimation(ActionBarActivity activity)
	{
		
		Animation myAnimation;
		Random random= new Random();
		
		
		int typeOfAnimation=1+random.nextInt(5);
		
		switch (typeOfAnimation) {
		case 1:
			myAnimation = AnimationUtils.loadAnimation(activity, R.anim.abc_fade_in);
			break;
		case 2:
			myAnimation = AnimationUtils.loadAnimation(activity, R.anim.abc_fade_out);
			break;
		case 3:
			myAnimation = AnimationUtils.loadAnimation(activity, R.anim.abc_slide_in_bottom);
			break;
		case 4:
			myAnimation = AnimationUtils.loadAnimation(activity, R.anim.abc_slide_in_top);
			break;
		case 5:
			myAnimation = new AlphaAnimation(0,1);
			myAnimation.setDuration(1500);
			myAnimation.setFillAfter(true);
			break;

		default:
			myAnimation = AnimationUtils.loadAnimation(activity, R.anim.abc_fade_in);
			break;
		}
		if(typeOfAnimation%2==0)
			myAnimation.setRepeatMode(Animation.REVERSE);
			
		return myAnimation;
	}
}
