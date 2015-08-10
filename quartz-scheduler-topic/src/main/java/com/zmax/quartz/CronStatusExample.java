package com.zmax.quartz;

import com.zmax.quartz.job.SimpleJob;
import com.zmax.quartz.listeners.SimpleListener;
import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.impl.matchers.KeyMatcher;

/**
 * Created by zmax.
 */
public class CronStatusExample {

    public static void main(String[] args) throws Exception {

        JobKey jobKey = new JobKey("dummyJobName", "group1");
        JobDetail job = JobBuilder.newJob(SimpleJob.class)
                .withIdentity(jobKey).build();

        Trigger trigger = TriggerBuilder
                .newTrigger()
                .withIdentity("dummyTriggerName", "group1")
                .withSchedule(
                        CronScheduleBuilder.cronSchedule("0/20 * * * * ?"))
                .build();

        Scheduler scheduler = new StdSchedulerFactory().getScheduler();
        //Listener attached to jobKey
        scheduler.getListenerManager().addJobListener(
                new SimpleListener(), KeyMatcher.keyEquals(jobKey)
        );

        //Listener attached to group named "group 1" only.
        //scheduler.getListenerManager().addJobListener(
        //	new HelloJobListener(), GroupMatcher.jobGroupEquals("group1")
        //);

        scheduler.start();
        scheduler.scheduleJob(job, trigger);
    }
}
