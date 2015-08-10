####### Thread Executors #######

-------
0) Executor framework around the Executor interface,
its subinterface ExecutorService, and the ThreadPoolExecutor class that implements both interfaces.

-------
1) Difference betwean Runnable and Callabble intergace

Another important advantage of the Executor framework is the Callable interface. It's
similar to the Runnable interface, but offers two improvements, which are as follows:
ff The main method of this interface, named call(), may return a result.
ff When you send a Callable object to an executor, you get an object that implements
the Future interface. You can use this object to control the status and the result of
the Callable object.

-------
2)
 The key of this example is the Server class. This class creates and uses
   ThreadPoolExecutor to execute tasks.
   The first important point is the creation of ThreadPoolExecutor in the constructor of the
   Server class. The ThreadPoolExecutor class has four different constructors but, due
   to their complexity, the Java concurrency API provides the Executors class to construct
   executors and other related objects. Although we can create ThreadPoolExecutor directly
   using one of its constructors, it's recommended to use the Executors class.
   In this case, you have created a cached thread pool using the newCachedThreadPool()
   method. This method returns an ExecutorService object, so it's been cast to
   ThreadPoolExecutor to have access to all its methods. The cached thread pool you have
   created creates new threads if needed to execute the new tasks, and reuses the existing ones
   if they have finished the execution of the periodicallyTask they were running, which are now available. The
   reutilization of threads has the advantage that it reduces the time taken for thread creation.
   The cached thread pool has, however, a disadvantage of constant lying threads for new tasks,
   so if you send too many tasks to this executor, you can overload the system.

-------
   3) ExecutorService Shutdown When you are done using the ExecutorService you should shut it down, so the threads do not keep running.
      For instance, if your application is started via a main() method and your main thread exits your application,
      the application will keep running if you have an active ExexutorService in your application. The active threads inside this ExecutorService prevents the JVM from shutting down.
      To terminate the threads inside the ExecutorService you call its shutdown() method. The ExecutorService will not shut down immediately, but it will no longer accept new tasks,
      and once all threads have finished current tasks, the ExecutorService shuts down. All tasks submitted to the ExecutorService before shutdown() is called, are executed.
      If you want to shut down the ExecutorService immediately, you can call the shutdownNow() method.
      This will attempt to stop all executing tasks right away,
      and skips all submitted but non-processed tasks.
      There are no guarantees given about the executing tasks. Perhaps they stop, perhaps the execute until the end. It is a best effort attempt.


#########

Разобраться как работает -> executorService.shutdown();