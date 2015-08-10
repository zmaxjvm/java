####### ThreadPoolExecutor #######

newCachedThreadPool()
method. This method returns an ExecutorService object, so it's been cast to
ThreadPoolExecutor to have access to all its methods. The cached thread pool you have
created creates new threads if needed to execute the new tasks, and reuses the existing ones
if they have finished the execution of the periodicallyTask they were running, which are now available. The
reutilization of threads has the advantage that it reduces the time taken for thread creation.
The cached thread pool has, however, a disadvantage of constant lying threads for new tasks,
so if you send too many tasks to this executor, you can overload the system.

-------
Use the executor created by the newCachedThreadPool() method
only when you have a reasonable number of threads or when they
have a short duration.