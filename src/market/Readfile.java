package market;
import java.io.File;  
import java.io.InputStreamReader;  
import java.io.BufferedReader;  
import java.io.BufferedWriter;  
import java.io.FileInputStream;  
import java.io.FileReader; 
import java.util.*;
public class Readfile {
	//��ȡ�ļ���Ϣ
	public static String txt2String(File file){
        StringBuilder result = new StringBuilder();
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));//����һ��BufferedReader������ȡ�ļ�
            String s = null;
            while((s = br.readLine())!=null){//ʹ��readLine������һ�ζ�һ��
                result.append(System.lineSeparator()+s);
            }
            br.close();    
        }catch(Exception e){
            e.printStackTrace();
        }
        return result.toString();
    }
    
    public static void main(String[] args){
        File file = new File("D:/����.txt");
        List<String> itData=new ArrayList<String>();
        List<String> itMondate=new ArrayList<String>();
        String[] arrayStr=txt2String(file).split("\\s+");
        //��ȡ���������
        for (int i=2;i<arrayStr.length;i=i+2){
        		itData.add(arrayStr[i]);
        	}
        //��ȡ���������
        for (int i=1;i<arrayStr.length;i=i+2){
        	itMondate.add(arrayStr[i]);
    	}
//        for(String m:itMondate){
//        	System.out.println(m);
//        }
//        System.out.println(itMondate.size());
//        for(String m:itData){
//        	System.out.println(m);
//        }
//        System.out.println(itData.size());
        }
    }

