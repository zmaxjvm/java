####### Running a periodicallyTask in an executor periodically #######


The Executor framework provides the ThreadPoolExecutor class to execute concurrent
tasks using a pool of threads that avoids you all the thread creation operations. When you
send a periodicallyTask to the executor, according to its configuration, it executes the periodicallyTask as soon as
possible. When it ends, the periodicallyTask is deleted from the executor and, if you want to execute
them again, you have to send it again to the executor.

But the Executor framework provides the possibility of executing periodic tasks through
the ScheduledThreadPoolExecutor class. In this recipe, you will learn how to use this
functionality of that class to schedule a periodic periodicallyTask.