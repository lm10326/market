package market;
import java.util.ArrayList;

public class GetMonth {
	/*获取1月月份*/
	public static ArrayList<String> get_January(){
		ArrayList<String> its_month=new ArrayList<String>();
		String m="0";
		for(int i=101;i<132;i++){
			String s=m+i;
			its_month.add(s);
		}
		System.out.println(its_month);
		return its_month;
	}
	/*获取2月月份*/
	public static ArrayList<String> get_February(){
		ArrayList<String> its_month=new ArrayList<String>();
		String m="0";
		for(int i=201;i<230;i++){
			String s=m+i;
			its_month.add(s);
		}
		System.out.println(its_month);
		return its_month;
	}
	/*获取3月月份*/
	public static ArrayList<String> get_March(){
		ArrayList<String> its_month=new ArrayList<String>();
		String m="0";
		for(int i=301;i<332;i++){
			String s=m+i;
			its_month.add(s);
		}
		System.out.println(its_month);
		return its_month;
	}
	
	/*获取4月月份*/
	public static ArrayList<String> get_April(){
		ArrayList<String> its_month=new ArrayList<String>();
		String m="0";
		for(int i=401;i<431;i++){
			String s=m+i;
			its_month.add(s);
		}
		System.out.println(its_month);
		return its_month;
	}
	/*获取5月月份*/
	public static ArrayList<String> get_May(){
		ArrayList<String> its_month=new ArrayList<String>();
		String m="0";
		for(int i=501;i<532;i++){
			String s=m+i;
			its_month.add(s);
		}
		System.out.println(its_month);
		return its_month;
	}
	
	/*获取6月月份*/
	public static ArrayList<String> get_June(){
		ArrayList<String> its_month=new ArrayList<String>();
		String m="0";
		for(int i=601;i<631;i++){
			String s=m+i;
			its_month.add(s);
		}
		System.out.println(its_month);
		return its_month;
	}
	
	/*获取7月月份*/
	public static ArrayList<String> get_July(){
		ArrayList<String> its_month=new ArrayList<String>();
		String m="0";
		for(int i=701;i<732;i++){
			String s=m+i;
			its_month.add(s);
		}
		System.out.println(its_month);
		return its_month;
	}
	
	/*获取8月月份*/
	public static ArrayList<String> get_August(){
		ArrayList<String> its_month=new ArrayList<String>();
		String m="0";
		for(int i=801;i<832;i++){
			String s=m+i;
			its_month.add(s);
		}
		System.out.println(its_month);
		return its_month;
	}
	
	/*获取9月月份*/
	public static ArrayList<String> get_September(){
		ArrayList<String> its_month=new ArrayList<String>();
		String m="0";
		for(int i=901;i<931;i++){
			String s=m+i;
			its_month.add(s);
		}
		System.out.println(its_month);
		return its_month;
	}
	
	/*获取10月月份*/
	public static ArrayList<String> get_October(){
		ArrayList<String> its_month=new ArrayList<String>();
		String m="";
		for(int i=1001;i<1032;i++){
			String s=m+i;
			its_month.add(s);
		}
		System.out.println(its_month);
		return its_month;
	}
	
	/*获取11月月份*/
	public static ArrayList<String> get_November(){
		ArrayList<String> its_month=new ArrayList<String>();
		String m="";
		for(int i=1101;i<1131;i++){
			String s=m+i;
			its_month.add(s);
		}
		System.out.println(its_month);
		return its_month;
	}
	
	/*获取12月月份*/
	public static ArrayList<String> get_December(){
		ArrayList<String> its_month=new ArrayList<String>();
		for(int i=1201;i<1232;i++){
			its_month.add(String.valueOf(i));
		}
		System.out.println(its_month);
		return its_month;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		get_January();
		get_February();
		get_March();
		get_April();
		get_May();
		get_June();
		get_July();
		get_August();
		get_September();
		get_October();
		get_November();
		get_December();
	}

}
