package fldsmdfr.apiHttp;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;

public class TestHttp {
	
	public TestHttp(){
		
	}
	
	public String ejecutar(String url, String parametros){
		
		String contentType = "application/json";
		
		HttpURLConnection con = null;
		InputStreamReader r = null;
		OutputStreamWriter w = null;
	
		StringBuilder sb = new StringBuilder();
	
		try {
			
			String userCredentials = "Bearer 6d4e83abc42bbe83f773d6e07b6ebb82";
	
			con = (HttpURLConnection) new URL(url).openConnection();
			
			con.setRequestProperty ("Authorization", userCredentials);
	
			con.setConnectTimeout(30000);
			con.setReadTimeout(120000);
	
			con.setRequestProperty("Content-Type", contentType);
			con.setRequestProperty("Accept", contentType);
			
			if(parametros!=null){
	
				con.setDoOutput(true);
				w = new OutputStreamWriter(new BufferedOutputStream(con.getOutputStream()), "UTF-8");
				w.write(parametros);
				w.flush();
				w.close();
				
			}
	
			r = new InputStreamReader(con.getInputStream());
	
			int c;
			while ((c = r.read()) != -1) sb.append((char) c);
	
		} catch (SocketTimeoutException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(con!=null) con.disconnect();
		}
		
		return sb.toString();
		
	}
	
	public static void main(String[] args){
		TestHttp t=new TestHttp();
		
		String fecha=new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		
		String s=t.ejecutar("https://graph.facebook.com/v2.9/315501812177711?access_token=EAACEdEose0cBANkUQZAfIDZAOcWyFkiTaKX7p84qcxFQoGXpm9FhmLbkklnIfFUsxWaZASG63RDbv0chaKHx7dLXWw6ElbWtk93VIQGnky3ZCcWNJvqKMkMDqur9DPGXNrVLdaVJhiiymY02WPtRbYgLRUVLZAwtXchhAUmx9dswLcIA3gxmGZCbIQ8OPktvd59iOmYHVoAIMjtvlZBs6bTVQaot2jwzgP5x02XuNMGVQZDZD&debug=all&format=json&method=get&pretty=0&suppress_http_code=1" , null);
		String s1=t.ejecutar("https://graph.facebook.com/v2.9/100002038551242?access_token=EAACEdEose0cBALaeOmh8K5nk9juHlZCHvOFZCqfAQZBMSKZCkTBIz4OVS8RhdkwYG0OrTrjEWMXIFIi4mQriSDAHUbXAdVjyjqdLOI12wNyY7nbs2ClnJaZBTWAG7imwlKJZA5MIGhd5fm1WVJzK8iQ2DUO8FUc4lHuncdFf1kqI3ioqRTyzkZAoeGSxs75Jp4ZD&debug=all&format=json&method=get&pretty=0&suppress_http_code=1" , null);
		String s2=t.ejecutar("https://graph.facebook.com/v2.9/271080889953137?access_token=EAACEdEose0cBALmJm92BN3XEQpZAJOaaRUBnrvu3INVWIvPYAZAopnNnrOGplK23EVTpZCwynfl3EFaEAWpQl9SxTaON8sqFQHZAHj9lKT50huPmUMioRAzJcPrxZCFsTt7JehqVJlJAaoP4UpSZBiZCceZCmGZC9vt2bEwS7l5xd21yavZABjLauOHf5Ps3L41BbmguIhpMwHItnNxwOp6OiEhSFx7A9ZBBKDpXGAokZBUJvwZDZD&debug=all&format=json&method=get&pretty=0&suppress_http_code=1" , null);
		System.out.println("Foto individual");
		System.out.println(s);
		System.out.println("");
		System.out.println("Usuario");
		System.out.println(s1);
		System.out.println("");
		System.out.println("Álbum de fotos");
		System.out.println(s2);
	}

}