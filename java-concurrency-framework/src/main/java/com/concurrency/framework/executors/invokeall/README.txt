####### Running multiple tasks and processing the first result #######

The invokeAll() method invokes all of the Callable objects you pass to it in the collection passed as parameter.
The invokeAll() returns a list of Future objects via which you can obtain the results of the executions of each Callable.
Keep in mind that a periodicallyTask might finish due to an exception, so it may not have "succeeded".
There is no way on a Future to tell the difference.




