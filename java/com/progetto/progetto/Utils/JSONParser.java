package com.progetto.progetto.Utils;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.progetto.progetto.Model.Job;
/**classe che permette di trasformare il JSON scaricato in un oggetto di tipo job
 * 
 * @author pietrobonsanto
 *@see job
 */
public class JSONParser {
 public static ArrayList<Job> parsaJson(JSONArray jsonArray) {
	 ArrayList<Job> jjj = new ArrayList<Job>();
	 boolean vera= true;
	 for(int i = 0; i< jsonArray.size(); i++)
	 {
		 Job j = new Job();
		 JSONObject ogg = (JSONObject) jsonArray.get(i);
		 j.setId((long) ogg.get("id")); 
		 j.setRole((String) ogg.get("role"));
		 j.setCname((String) ogg.get("cname"));
		 
		 j.setEnumber((String) ogg.get("enumber"));
		 
		 if(ogg.get("etype").equals("full time")) {
			 j.setEtype("full time");
			 
		 }
		 else 
			 j.setEtype((String) ogg.get("part time"));
		 
		 j.setLocation((String) ogg.get("location"));
		 j.setRemote((boolean) ogg.get("remote"));
		
		 
		  if(ogg.get("remote").equals(vera)) {
			 j.setLocation("remote");}
		// }
		 /* else {j.setLocation((String) ogg.get("location"));
		 }
		  if(ogg.get("remote").equals("false")) {
		   j.setRemote("lavoro non in remoto"); 
		 }*/
		/** else {j.setRemote((String) ogg.get("remoto"));
		 
		 }
		 if (ogg.get("etype").equals("full time")) {
			 j.setEtype("lavoro fulltime");
		 } 
		 else {j.setEtype((String) ogg.get("a contratto/part time"));
		 }*/
			 
		 jjj.add(j);
	 }
	 return jjj;
			 
	 }
		 
				 
 



}












 

