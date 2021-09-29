package com.example.progettooop.controller;
import org.json.*;
import org.json.JSONException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Controller {
	@RequestMapping(value="/data", method=RequestMethod.POST,produces="application/json")
	String getAllDataFiltered(@RequestBody(required=false) String filtro) {
		 try {
	            Timeline objects = JSONDownloader.parsaJson(JSONDownloader.JSONDownloadato());
	            JSONObject json = null;
	            Timeline result = null;
	            if(filtro != null){
	                try {
	                    json = new JSONObject(filtro);
	                    result = JSONDownloader.parsaJson(json);
	                } catch (ClassCastException e) {
	                    e.printStackTrace();
	                    return makeErrorMessage("Sono stati inseriti dei valori in un formato errato");
	                } catch (JSONException e) {
	                    e.printStackTrace();
	                    return makeErrorMessage("Il JSON non sembra essere ben formato");
	                } 
	            
	            }

	            ObjectMapper mapper = new ObjectMapper();
	            if(result != null) {
	                return mapper.writeValueAsString(result);
	            } else return mapper.writeValueAsString(objects.getTimeline());
	        } catch (IOException e){
	            return makeErrorMessage("Si è verificato un errore imprevisto");
	        }
	}

    /**
     * Rotta che mostra i metadati relativi ad ogni oggetto presente nel dataset
     * @return Restituisce i metadati sotto forma di JSON
     */
    @RequestMapping(value = "/metadata", method = RequestMethod.GET, produces="application/json")
    String getMetadata(){
        try {
            ObjectMapper mapper = new ObjectMapper();
            JsonSchemaGenerator schemaGen = new JsonSchemaGenerator(mapper);
            JsonSchema schema = schemaGen.generateSchema(Tweet.class);
            return mapper.writeValueAsString(schema);
        } catch (Exception e){
        	return makeErrorMessage("Si è verificato un errore imprevisto");
        }
    }
    /**
     * Metodo che consente di mostrare un messaggio di errore personalizzato sotto forma di JSON
     * @param message Testo da mostrare nel messaggio di errore
     * @return Restituisce il JSON contenente l'errore
     */
    private String makeErrorMessage(String message) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            HashMap<String, String> result = new HashMap<>();
            result.put("error", message);
            return mapper.writeValueAsString(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
}