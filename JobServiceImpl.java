package com.example.progettooop.service;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import com.example.progettooop.model.Job;
// da finire 

@Service

public class JobServiceImpl {
	
	public class JobServiceImpl implements JobService {
		private static Map<Integer, Job> listalavori=new HashMap<>();
		
		@Override
		public void updateJob(Integer id, Job job) {
			listalavori.remove(id);
			job.setId(id);
			listalavori.put(id, job);
		}
		@Override
		public void createJob(Job job) {
			listalavori.put(job.getId(),job);
		}
		@Override
		public void deleteJob(Integer id) {
			listalavori.remove(id);
		}
		@Override
		public Collection<Job> getJobs() 
		return listalavori.values()
;		}
	}

}
