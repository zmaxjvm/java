package com.zmax.quartz;

import com.zmax.quartz.job.CronJob;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import static org.quartz.CronScheduleBuilder.*;

import java.util.List;

/**
 * Created by zmax.
 * <p>
 * The Quartz API
 * <p>
 * Scheduler - the main API for interacting with the scheduler.
 * Job - an interface to be implemented by components that you wish to have executed by the scheduler.
 * JobDetail - used to define instances of Jobs.
 * Trigger - a component that defines the schedule upon which a given Job will be executed.
 * JobBuilder - used to define/build JobDetail instances, which define instances of Jobs.
 * TriggerBuilder - used to define/build Trigger instances.
 */
public class CronScheduler {

    public static void main(String[] args) {

        try {
            // specify the job' s details..
            JobDetail job = JobBuilder.newJob(CronJob.class)
                    .withIdentity("job1", "group1")
                    .build();
//TODO: see more http://quartz-scheduler.org/documentation/quartz-2.x/tutorials/tutorial-lesson-06
            // specify the running period of the job
            CronTrigger trigger = TriggerBuilder.newTrigger()
                    .withIdentity("trigger1", "group1")
                    .withSchedule(cronSchedule("0/10 * * * * ?"))
                    .build();

            //schedule the job
            SchedulerFactory schFactory = new StdSchedulerFactory();
            //create a simple, RAM-based scheduler.
            Scheduler sch = schFactory.getScheduler();
            sch.start();
            sch.scheduleJob(job, trigger);

//check status
            List<JobExecutionContext> r = sch.getCurrentlyExecutingJobs();

        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }

}
