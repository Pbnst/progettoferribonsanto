package com.example.progettooop.service;
import java.util.Collection;

import com.example.progettooop.model.Job;
public interface JobService {
	public abstract void createJob(Job job);
	public abstract void updateJob(Integer id, Job job);
	public abstract void deleteJob(Integer id);
	public abstract Collection<Job> getJobs();

}
