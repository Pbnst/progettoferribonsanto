package com.progetto.progetto.Service;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;
import com.progetto.progetto.Model.*;
import com.progetto.progetto.Utils.*;
/**classe che implementa i metodi dell'interfaccia JobService
 * 
 * @author pietrobonsanto
 *@see JobService 
 *
 */
	
	@Service
	public class JobServiceImpl implements JobService {
		private Map<Long, Job> listalavori = new HashMap<>();
		private Map<String, Metadata> metadata = new HashMap<>();
		private ModelloStatistiche mod = Uploadstats.getStats();
		
		public JobServiceImpl() {
			try {
				ArrayList<Job> job = JSONParser.parsaJson(JSONDownloader.JSONDownloadato());
				for (int i = 0; i < job.size(); i++) {
					Job jb = job.get(i);
					listalavori.put((long) jb.getId(), jb);
				}
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		public Collection<Job> getJob() {
			return listalavori.values();
		}

		@Override
		public Collection<Metadata> getMetada() {
			return metadata.values();
		}

		@Override
		public ModelloStatistiche getStats() {
			return mod;
		}

			
		
				
			}
		
		
	


