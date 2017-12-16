class Account3{
public double search(double [] speed){
	int size = speed.length;
	double min = speed[0];
	for (int i=0; i < size; i++){
		if (speed[i] < min){
			min = speed[i];
		}
	return min;
	}
}
	public static void main(String[] args){
		Account3 a = new Account3();
		System.out.println(a.search([7.85,7.32,4.9,6.22,5.4,7.3,5.19]));
	}
	
}
