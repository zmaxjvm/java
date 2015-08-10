package com.zmax.quartz.listeners;

import org.apache.log4j.Logger;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobListener;

/**
 * Created by mzavgorodny
 */
public class SimpleListener implements JobListener {

    private Logger log = Logger.getLogger(SimpleListener.class);

    public static final String LISTENER_NAME = "dummyJobName";

    public String getName() {
        return LISTENER_NAME;
    }

    public void jobToBeExecuted(JobExecutionContext jobExecutionContext) {
        String jobName = jobExecutionContext.getJobDetail().getKey().toString();
        log.debug("jobToBeExecuted");
        log.debug("Job : " + jobName + " is going to start...");

    }

    public void jobExecutionVetoed(JobExecutionContext jobExecutionContext) {
        log.debug("jobExecutionVetoed");
    }

    public void jobWasExecuted(JobExecutionContext jobExecutionContext, JobExecutionException e) {
        log.debug("jobWasExecuted");

        String jobName = jobExecutionContext.getJobDetail().getKey().toString();
        log.debug("Job : " + jobName + " is finished...");

        if (!e.getMessage().equals("")) {
            log.debug("Exception thrown by: " + jobName + " Exception: " + e.getMessage());
        }
    }
}
