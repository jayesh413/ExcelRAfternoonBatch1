package day22solid.scp.solution;

public class Addition implements ArithmeticOperation {

	double n1,n2,result;
	
	public Addition(double n1, double n2) {
		this.n1 = n1;
		this.n2 = n2;
	}


	@Override
	public void calculate() {
		result=this.n1+this.n2;
		System.out.println("Addition result :"+result);
	}

}
