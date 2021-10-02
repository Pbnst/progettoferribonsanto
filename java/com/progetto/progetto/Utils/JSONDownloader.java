
package com.progetto.progetto.Utils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.HttpURLConnection;

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
	 *
	**/
	public static JSONArray JSONDownloadato() {
	
	//JSONObject obj = null;	
		
    String data="";
	String line="";
	String url = "https://findwork.dev/api/jobs/";
	
	
	try{
		HttpURLConnection openConnection = (HttpURLConnection) new URL(url).openConnection();
		openConnection.setRequestMethod("GET");
 		openConnection.addRequestProperty("User-Agent", "default");
		openConnection.addRequestProperty("Authorization", "Token 92e34789ad8bd5b885f25e5454d3aa645eeea845 ");
        openConnection.setRequestProperty("Accept", "application/json");
        InputStream in= openConnection.getInputStream();
	
	
	try {
		InputStreamReader inR =new InputStreamReader(in);
		BufferedReader buf= new BufferedReader(inR);
		
		while ((line = buf.readLine()) != null) {
			data+=line;
		}
	}finally {
		in.close();
	}
	//obj = (JSONObject) JSONValue.parseWithException(data);
	
} catch (IOException e) {
	e.printStackTrace();
} catch (Exception e) {
	e.printStackTrace();
}
   JSONArray json = new JSONArray();
	json.add(JSONValue.parse(data));
//JSONArray json= (JSONArray) JSONValue.parse(data);
return json;
}
	}

