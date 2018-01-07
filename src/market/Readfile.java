package market;
import java.io.File;  
import java.io.InputStreamReader;  
import java.io.BufferedReader;  
import java.io.BufferedWriter;  
import java.io.FileInputStream;  
import java.io.FileReader; 
import java.util.*;
public class Readfile {
	//读取文件信息
	public static String txt2String(File file){
        StringBuilder result = new StringBuilder();
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));//构造一个BufferedReader类来读取文件
            String s = null;
            while((s = br.readLine())!=null){//使用readLine方法，一次读一行
                result.append(System.lineSeparator()+s);
            }
            br.close();    
        }catch(Exception e){
            e.printStackTrace();
        }
        return result.toString();
    }
    
    public static void main(String[] args){
        File file = new File("D:/概率.txt");
        List<String> itData=new ArrayList<String>();
        List<String> itMondate=new ArrayList<String>();
        String[] arrayStr=txt2String(file).split("\\s+");
        //获取当天的数据
        for (int i=2;i<arrayStr.length;i=i+2){
        		itData.add(arrayStr[i]);
        	}
        //获取当天的日期
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

