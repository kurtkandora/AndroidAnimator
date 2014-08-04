package com.example.androidanimator;

public class Quote {
	public String[] mquotes= {
			"A material metaphor is the unifying theory of a rationalized space and a system of motion.",
			"Motion in the world of material design is not only beautiful, it builds meaning about the spatial relationships, functionality, and intention of the system.",
			"All elements work together to construct a seamless experience and a beautiful, functional app.",
			"Color is inspired by bold color statements juxtaposed with muted environments, taking cues from contemporary architecture, road signs, pavement marking tape, and sports courts.",
			"Structural and visual consistency creates an environment for the user that is recognizable across products.",
			"Consider again what material design is: a design based on the qualities of paper.",
			"A product is accessible when all people—regardless of ability—can navigate it, understand it, and use it to achieve their goals.",
			"Surfaces and edges of the material provide visual cues that are grounded in reality.",
			"An emphasis on user actions makes core functionality immediately apparent and provides waypoints for the user.",
			"Motion is meaningful and appropriate, serving to focus attention and maintain continuity. Feedback is subtle yet clear. Transitions are efficient yet coherent."
	};
	private int mcont;
	public Quote() {
		mcont=0;
	}
	public String getQuote(){
		if(mcont==mquotes.length)
			mcont=0;
		
		String quote=mquotes[mcont];
		mcont++;
		return quote;
	}

}
