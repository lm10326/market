package market;
import java.io.File;
import java.util.ArrayList;

import market.Readfile;
public class GetData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> itData=new ArrayList<String>();
		itData=getData();
		for(int i=0;i<itData.size();i++){
			System.out.println(itData.get(i).toString());
		}
		
		for(int i=0;i<itData.size();i++){
			System.out.println(itData.get(i).toString());
		}
		
		ArrayList<String> itDate=new ArrayList<String>();
		itDate=getItDate();
		for(int i=0;i<itDate.size();i++){
			System.out.println(itDate.get(i).toString());
		}

	}
	//��ȡ���������
	public static ArrayList<String> getData(){
		File file1 = new File("D:/����.txt");
        ArrayList<String> itData=new ArrayList<String>();
        String[] arrayStr=Readfile.txt2String(file1).split("\\s+");
        //��ȡ���������
        for (int i=2;i<arrayStr.length;i=i+2){
        		itData.add(arrayStr[i]);
        	}
		return itData;
	}
	//��ȡ���������
	public static ArrayList<String> getItDate(){
		File file1 = new File("D:/����.txt");
		ArrayList<String> itMondate=new ArrayList<String>();
	    String[] arrayStr=Readfile.txt2String(file1).split("\\s+");
	        //��ȡ���������
	    for (int i=1;i<arrayStr.length;i=i+2){
	        itMondate.add(arrayStr[i]);
	        }
		return itMondate;
		
	}


}
