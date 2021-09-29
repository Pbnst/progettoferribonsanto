package com.example.progettooop.utility;
import java.io.*;
import java.net.*;
import org.json.*;
import com.example.progettooop.model.ListaLavori;
import com.example.progettooop.model.Job;



/**la classe fornisce i metodi per ottenere le informazioni da un json scaricato
 * 
 * @author pietrobonsanto
 *
 */


public class JsonDownload {
 
	/** metodo che riceve un URL associato ad un JSOn
	 * lo scarica e lo trasforma in un JsonObject
	 * @param url del JSON
	 * @return restituisce il jsonobject
	 *@throws JSONEception
	 *@throws IOException errore in caso di problemi I/O 
	 */

	public static JSONObject JsonDownloaded() throws JSONException {
		String data="";
		String line="";
		String url = "https://findwork.dev/api/jobs/";
		
		try {
			URLConnection openConnection = new URL(url).openConnection();
			openConnection.addRequestProperty("Safari: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_0) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.100 Safari/537.36");
			
			InputStream in= openConnection.getInputStream();
			
			
			
			try {
				InputStreamReader inR=new InputStreamReader(in);
				BufferedReader buf= new BufferedReader(inR);
				
				while((line=buf.readLine())!= null) {
					data+=line;
				}
			}
			finally {
				in.close()
;
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		JSONObject json=new JSONObject("{\"listalavori\":"+data.toString()+"}");
		return json;
		}
	
	/** Metodo per parsare il JSON che gli viene passato
	 * *@param JSON
	 * 
	 */
	public static ListaLavori parseJSon(JSONObject json) {
		ListaLavori listalavori = new ListaLavori();
		if(json!=null) {
			JSONArray dataset = json.optJSONArray("listalavori");
			if(dataset!=null) {
				for(int i=0; i<dataset.lenght(); i++) {
					JSONObject job = dataset.optJSONObject(i);
					
					
					Job job1=new Job();
					job1.setId(job.optInt("id"));
					job1.setRole(job.opt("role"));
					job1.setName(job.opt("name"));
					job1.setNumber(job.opt("number_employees"));
					job1.setPlace(job.opt("place"));
					job1.setFulltime(job.opt("full-time"));
					listalavori.inserisciJob(job1);
				}
				}}
		
		return listalavori;
		
	
	
	
	
			}
		}
	










}
















