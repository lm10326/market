package market;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import market.GetData;
import java.util.regex.*;

public class Listtodic {
	//�������б�ת���ֵ�
	public static void main(String[] args) {
		// ��ȡ�Ƿ�����
		ArrayList<String> itData=new ArrayList<String>();
		itData=GetData.getData();
		// ��ȡ��������
		ArrayList<String> itDate=new ArrayList<String>();
		itDate=GetData.getItDate();
		//���Ƿ�����������ֵ�
		HashMap<String, String> daPan = new HashMap<String, String>();
		daPan=Add_hashmap(itDate,itData);
		
		ArrayList<String> myDate=new ArrayList<String>();
		myDate=regToday("0119",itDate);
		System.out.println(myDate);//�����ʷ�ϵĲ�ѯ����
		ArrayList<String> myData=new ArrayList<String>();
		for(String i:myDate){
			myData.add(daPan.get(i));
		}
		System.out.println(myData);
		HashMap<String,String> myDictData=new HashMap<String,String>();
		myDictData=Add_hashmap(myDate,myData);
		
		Iterator<?> hm=myDictData.entrySet().iterator();//��ӡ��ѯ���ڼ�������Ƿ�
		while(hm.hasNext()){
			System.out.println(hm.next());
		}
		int count=0;
		for(String m:myData){
			float nowData=Float.valueOf(m);
			if(nowData>0){
				count=count+1;
//				System.out.println(nowData); //��ӡ����0������
			}
		}
		System.out.println(count);
		System.out.println(myDate.size());
		System.out.println((count/Float.valueOf(myDate.size())));
		
	}
	//����ArrayList���һ��HashMap
	public static HashMap<String, String> Add_hashmap(ArrayList<String> a,ArrayList<String> b){
		HashMap<String, String> c = new HashMap<String, String>();
		for(int i=0;i<a.size();i++){
			c.put(a.get(i).toString(),b.get(i).toString());
		}
		return c;
	}
	//�鿴��ʷ�Ͻ�����б�
	public static ArrayList<String> regToday(String a,ArrayList<String> itList){
		ArrayList<String> todayDate=new ArrayList<String>();
//		System.out.println(itList.size()); //��ӡ������б�
		for(String today:itList){
			String itDate=today;
			String paDate=a.toString();
			String pattern="[0-9]{4}date";
			String pattern1=pattern.replaceAll("date", paDate);
//			System.out.println(pattern1);//��ӡ������ʽ
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
