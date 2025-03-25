package brokenlink;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class BrokenLinkChecker {
	
	
	public static int linkChecker(String urlStr) {
		int count = 0;
		int responseCode = 0;
		try {
			URL url = new URL(urlStr);
			 if(urlStr.startsWith("https")){
				 HttpsURLConnection httpurl = (HttpsURLConnection) url.openConnection();
				 httpurl.connect();
				  responseCode = httpurl.getResponseCode();
				 }else {
			HttpURLConnection httpurl = (HttpURLConnection) url.openConnection();
			httpurl.connect();
			 responseCode = httpurl.getResponseCode();
				 }
			
			//int responseCode = httpurl.getResponseCode();
			
			if(responseCode>=400) {
				count++;
				System.out.println("GIven link is broken link :"+urlStr);
			}
			else {
				System.out.println("Given link is valid link "+urlStr);
			}
			
			
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return count;
		
	}

}
