package com.zmax.quartz.job;

import org.apache.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.concurrent.TimeUnit;

/**
 * Created by zmax.
 */
public class SimpleJob implements Job {


	//TODO: use  JDBC-JobStore and JobDataMap
	private Logger log = Logger.getLogger(SimpleJob.class);
	
	public void execute(JobExecutionContext jExeCtx) throws JobExecutionException {
		log.debug("SimpleJob run successfully...");
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
