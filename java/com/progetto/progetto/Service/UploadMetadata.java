package com.progetto.progetto.Service;

import java.util.ArrayList;
import com.progetto.progetto.Model.*;

/**classe che carica i metadati
 * 
 * @author pietrobonsanto
 *
 */
public class UploadMetadata {
	
	public static ArrayList<Metadata> metadata = new ArrayList<Metadata>();

	/**
	 * Metodo che carica tutti i metadati in un ArrayList di metadati
	 * 
	 * @return un ArrayList di metadati
	 */
	public static ArrayList<Metadata> getMetadata() {
		metadata.add(new Metadata("id", "Numero identificativo del lavoro", "long"));
		metadata.add(new Metadata("role", "Ruolo lavorativo", "String"));
		metadata.add(new Metadata("cname", "Nome dell'azienda", "String"));
		metadata.add(new Metadata("etype", "Tipo di impiego", "String"));
		metadata.add(new Metadata("location", "Luogo", "String"));
		metadata.add(new Metadata("remote", "Lavoro a distanza", "Bool"));
		

		return metadata;
	}
}

