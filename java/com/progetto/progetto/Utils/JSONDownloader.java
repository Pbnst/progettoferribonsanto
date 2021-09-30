package com.progetto.progetto.Utils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import org.json.simple.JSONArray;
import org.json.simple.JSONValue;

/**classe che mi permette di scaricare i JSON dall'url fornito
 * @link https://findwork.dev/api/jobs/
 * @author pietrobonsanto
 *
 */
public class JSONDownloader {
	
	/** metodo che scarica il JSON e lo trasforma in JSON array
	 * @return JSON arraycon i dati scaricati
	 */
	
	
	public static JSONArray JSONDownloadato() {
	
	String data="";
	String line="";
	String url = "https://findwork.dev/api/jobs/";
	String token = "dfac007afb1130c8d529e192f72097f254bb4fa2";
	{
	try{
		
		URLConnection openConnection = new URL(url).openConnection();
		openConnection.addRequestProperty("User-Agent",
				"Mozilla/5.0 (Windows NT 6.1; WOW64; rv:25.0) Gecko/20100101 Firefox/25.0");
	InputStream in= openConnection.getInputStream();
	openConnection.setRequestProperty("Authorization", token);
	
	try {
		InputStreamReader inR=new InputStreamReader(in);
		BufferedReader buf= new BufferedReader(inR);
		
		while ((line=buf.readLine())!= null) {
			data+=line;
		}
	}finally {
		in.close();
	}
	
} catch (IOException e) {
	e.printStackTrace();
} catch (Exception e) {
	e.printStackTrace();
}

JSONArray json= (JSONArray) JSONValue.parse(data);
return json;
}
	}}

