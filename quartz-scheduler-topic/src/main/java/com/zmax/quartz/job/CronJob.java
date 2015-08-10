package com.zmax.quartz.job;

import org.apache.log4j.Logger;
import org.quartz.*;

import java.util.Date;

/**
 * Created by zmax.
 */
public class CronJob implements Job {

    private Logger log = Logger.getLogger(CronJob.class);

    public void execute(JobExecutionContext context) throws JobExecutionException {
        log.debug("Cron job says: " + context.getJobDetail().getKey() + " executing at " + new Date());
    }

}