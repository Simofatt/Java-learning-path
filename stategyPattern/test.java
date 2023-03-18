package stategyPattern;

public class test {

	public static void main (String [] args ) {  
		
		context ctx = new context() ;
		ctx.setStrategy(new stategyImp1());
		ctx.EffectuerStategy();
	}

}
