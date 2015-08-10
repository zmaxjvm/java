####### Running a periodicallyTask in an executor after a delay #######

To execute a periodicallyTask in this scheduled executor after a period of time, you have to use the
schedule() method. This method receives the following three parameters:

#1 The periodicallyTask you want to execute
#2 The period of time you want the periodicallyTask to wait before its execution
#3 The unit of the period of time, specified as a constant of the TimeUnit class
