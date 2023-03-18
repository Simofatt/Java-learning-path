package stategyPattern;

public class context {
public Stategy stategy ; 

public void EffectuerStategy() { 
	stategy.executer() ; 
}
public void setStrategy(Stategy stategy ) { 
	this.stategy = stategy ; 
}
}
