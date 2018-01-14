package market;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import market.GetData;
import java.util.regex.*;

public class Listtodic {
	//将两个列表转成字典
	public static void main(String[] args) {
		// 获取涨幅数据
		ArrayList<String> itData=new ArrayList<String>();
		itData=GetData.getData();
		// 获取日期数据
		ArrayList<String> itDate=new ArrayList<String>();
		itDate=GetData.getItDate();
		//将涨幅和日期组成字典
		HashMap<String, String> daPan = new HashMap<String, String>();
		daPan=Add_hashmap(itDate,itData);
		
		ArrayList<String> myDate=new ArrayList<String>();
		myDate=regToday("0119",itDate);
		System.out.println(myDate);//获得历史上的查询日期
		ArrayList<String> myData=new ArrayList<String>();
		for(String i:myDate){
			myData.add(daPan.get(i));
		}
		System.out.println(myData);
		HashMap<String,String> myDictData=new HashMap<String,String>();
		myDictData=Add_hashmap(myDate,myData);
		
		Iterator<?> hm=myDictData.entrySet().iterator();//打印查询日期及当天的涨幅
		while(hm.hasNext()){
			System.out.println(hm.next());
		}
		int count=0;
		for(String m:myData){
			float nowData=Float.valueOf(m);
			if(nowData>0){
				count=count+1;
//				System.out.println(nowData); //打印大于0的数据
			}
		}
		System.out.println(count);
		System.out.println(myDate.size());
		System.out.println((count/Float.valueOf(myDate.size())));
		
	}
	//两个ArrayList组成一个HashMap
	public static HashMap<String, String> Add_hashmap(ArrayList<String> a,ArrayList<String> b){
		HashMap<String, String> c = new HashMap<String, String>();
		for(int i=0;i<a.size();i++){
			c.put(a.get(i).toString(),b.get(i).toString());
		}
		return c;
	}
	//查看历史上今天的列表
	public static ArrayList<String> regToday(String a,ArrayList<String> itList){
		ArrayList<String> todayDate=new ArrayList<String>();
//		System.out.println(itList.size()); //打印传入的列表
		for(String today:itList){
			String itDate=today;
			String paDate=a.toString();
			String pattern="[0-9]{4}date";
			String pattern1=pattern.replaceAll("date", paDate);
//			System.out.println(pattern1);//打印正则表达式
			Pattern r = Pattern.compile(pattern1);
			Matcher mat=r.matcher(itDate);
			if(mat.find()){
				todayDate.add(today);
//				System.out.println(today);
			}
			
	
		}
		return todayDate;
	}
	

}
