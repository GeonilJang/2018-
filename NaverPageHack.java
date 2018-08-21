import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

public class NaverPageHack {

	public static void main(String[] args) throws Exception {
		
		
		
			
		int fcnt = 0;
		
			while(true) {
				String target = "https://www.naver.com";
				URL url = new URL(target);
				HttpURLConnection conn = (HttpURLConnection) url.openConnection();
				
				InputStream inS;
				InputStreamReader inR;
				BufferedReader br;
				inS = conn.getInputStream();
				inR = new InputStreamReader(inS, "UTF-8");
				br = new BufferedReader(inR);
				
				
				String temp = null;
				ArrayList <String> list = new <String> ArrayList();
				
			
				int cnt=0;
				
				
				int year = 0;
				int month = 0;
				int day = 0;
				int hour = 0;
				int minute = 0;
				int second = 0;
				
				FileWriter fr=null;
				fr =  new FileWriter("hello"+fcnt+".txt");
				while((temp = br.readLine()) != null) {
			
					if(temp.contains("class=\"ah_k\">") && cnt < 20) {
						list.add(temp.split("class=\"ah_k\">")[1].split("</")[0]);
						
						System.out.println(++cnt+"번 - "+temp.split("class=\"ah_k\">")[1].split("</")[0]);
						fr.write(cnt+"번 - "+temp.split("class=\"ah_k\">")[1].split("</")[0]+"\r\n");
					}
					
					
					if(temp.contains("var svt = \"")) {
						temp = temp.split("var svt = \"")[1].split("\";")[0];
						year = Integer.parseInt(temp.substring(0, 4));
						month = Integer.parseInt(temp.substring(4,6));
						day = Integer.parseInt(temp.substring(6, 8));
						hour = Integer.parseInt(temp.substring(8, 10));
						minute = Integer.parseInt(temp.substring(10, 12)); 
						second = Integer.parseInt(temp.substring(12, 14));
						System.out.println(year+"년 "+month+"월 "+day+"일 "+hour+"시 "+minute+"분 "+second+"초");
						fr.write(year+"년 "+month+"월 "+day+"일 "+hour+"시 "+minute+"분 "+second+"초");
						fr.close();
						fcnt++;
						
					}
				}
				conn.disconnect();
				br.close();
				Thread.sleep(1000*60*60);//1 초 * 60 = 1분 * 13 = 13분 
			}
	}

}
