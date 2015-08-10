package com.zmax.quartz;

import com.zmax.quartz.job.SimpleJob;
import com.zmax.quartz.listeners.SimpleListener;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.impl.matchers.KeyMatcher;

import java.util.Date;

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
public class SimpleSheduler {

    public static void main(String[] args) throws InterruptedException {

        try {

            JobKey jobKey = new JobKey("dummyJobName", "group1");

            // compute a time that is on the next round minute
            Date runTime = new Date();


            // define the job and tie it to our HelloJob class
            JobDetail job = JobBuilder.newJob(SimpleJob.class)
                    .withIdentity("job1", "group1")
                    .build();

            // Trigger the job to run on the next round minute
            Trigger trigger = TriggerBuilder.newTrigger()
                    .withIdentity("trigger1", "group1")
                    .startAt(runTime)
                    .build();


            /*// specify the running period of the job
            Trigger trigger = TriggerBuilder.newTrigger()
                    .withSchedule(
                            SimpleScheduleBuilder.simpleSchedule()
                                    .withIntervalInSeconds(30)
                                    .repeatForever())
                    .build();
*/

            //schedule the job
            SchedulerFactory schFactory = new StdSchedulerFactory();
            Scheduler sch = schFactory.getScheduler();

            sch.getListenerManager().addJobListener(
                    new SimpleListener(), KeyMatcher.keyEquals(jobKey)
            );

            sch.start();
            sch.scheduleJob(job, trigger);


 /*           Thread.sleep(9L * 1000L);
            sch.shutdown(true);
*/
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }

}
