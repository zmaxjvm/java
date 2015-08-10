####### Controlling a task finishing in an executor #######


The FutureTask class provides a method called done() that allows you to execute some
code after the finalization of a task executed in an executor. It can be used to make some
post-process operations, generating a report, sending results by e-mail, or releasing some
resources. This method is called internally by the FutureTask class when the execution of
the task that this FutureTask object is controlling finishes. The method is called after the
result of the task is set and its status is changed to the isDone status, regardless of whether
the task has been canceled or finished normally.
By default, this method is empty. You can override the FutureTask class and implement this
method to change this behavior. In this recipe, you will learn how to override this method to
execute code after the finalization of the tasks.