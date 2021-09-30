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
	 for(int i = 0; i< jsonArray.size(); i++) {
		 Job j = new Job();
		 JSONObject ogg = (JSONObject) jsonArray.get(i);
		 j.setId((int) ogg.get("id"));
		 j.setRole((String) ogg.get("role"));
		 j.setCname((String) ogg.get("cname"));
		 
		 JSONObject ut = (JSONObject) ogg.get("text");
		 
		 j.setEnumber((int) ut.get("enumber"));
		 j.setLocation((String) ut.get("location"));
		 j.setRemote((String) ut.get("remote"));
		 j.setEtype((String) ut.get("etype"));
		 
		 if(ut.get("location").equals("null")) {
			 j.setLocation("location ignota");
		 }
		 else {j.setLocation((String) ut.get("location"));
		 }
		  if(ut.get("remote").equals("false")) {
			 j.setRemote("lavoro non in remoto");
		 }
		 else {j.setRemote((String) ut.get("remoto"));
		 
		 }
		 if (ut.get("etype").equals("full time")) {
			 j.setEtype("lavoro fulltime");
		 }
		 else {j.setEtype((String) ut.get("a contratto/part time"));
		 }
			 
		 jjj.add(j);
	 }
	 return jjj;
			 
		 
		 
				 
 }}
 

