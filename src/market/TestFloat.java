package market;

public class TestFloat {
	//ÀàÐÍ×ª»»
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] m={2.3,-2.7,5.9};
		int mm=0;
		for(double i:m){
			if (i>0){
				mm=mm+1;
			}
		}
		double k=mm/Double.valueOf(m.length);
//		double k=Float.valueOf(m.length)/mm;
		System.out.println(k);
		String a="24.23";
		Double b=Double.valueOf(a);
		System.out.println(b+b);
		
	}

}
