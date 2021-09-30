package com.progetto.progetto.Service;
import com.progetto.progetto.Model.*;
import com.progetto.progetto.Utils.*;

/**classe che carica le statistiche 
 * 
 * @author pietrobonsanto
 *
 */
public class Uploadstats {
		static ModelloStatistiche stat = new ModelloStatistiche();
		static Statistiche statistica = new Statistiche();

		/**
		 * Metodo che carica tutte le statistiche in un oggetto di tipo
		 * ModelloStatistiche
		 * 
		 * @see ModelloStatistiche
		 * @return un oggetto di tipo ModelloStatistiche
		 */
		public static ModelloStatistiche getStats() {
			stat.setJobloc(Statistiche.contaLocation(JSONParser.parsaJson(JSONDownloader.JSONDownloadato())));
			stat.setJobfull(Statistiche.contaftime(JSONParser.parsaJson(JSONDownloader.JSONDownloadato())));
		    stat.setJobrem(Statistiche.contaLocationnin(JSONParser.parsaJson(JSONDownloader.JSONDownloadato())));
			return stat;
		}

	}


