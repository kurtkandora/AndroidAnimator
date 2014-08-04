package com.example.androidanimator;

import java.util.Random;

import android.graphics.Color;

public class MyColor {
	private Random rand;
	private int myColor;
	private int r,g,b;
	private boolean bright;
	public MyColor() {
		rand = new Random();
		bright=true;
	}
	public int getBackGroundColor(){
		if(bright)
			return getBrightColor();
		else
			return getDarkColor();
		
	}
	public int getTextGroundColor(){
		if(bright){
			bright=false;
			return getDarkColor();
		}
		else{
			bright=true;
			return getBrightColor();
		}
	}
	
	
	private int getBrightColor(){
		
		r = rand.nextInt(255)-150;
		g = rand.nextInt(255)-150;
		b = rand.nextInt(255)-150;
		myColor=Color.rgb(r, g, b);
		return myColor;
		
	}
	
	private int getDarkColor(){
		
		r = rand.nextInt(155)+100;
		g = rand.nextInt(155)+100;
		b = rand.nextInt(155)+100;
		myColor=Color.rgb(r, g, b);
		return myColor;
		
	}

}
