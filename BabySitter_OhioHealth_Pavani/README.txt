//Hi Team, please use below process to run and test the application

Background
This kata simulates a babysitter working and getting paid for one night. The rules are pretty straight forward.

The babysitter:

starts no earlier than 5:00PM
leaves no later than 4:00AM
gets paid $12/hour from start-time to bedtime
gets paid $8/hour from bedtime to midnight
gets paid $16/hour from midnight to end of job
gets paid for full hours (no fractional hours)
Feature
As a babysitter
In order to get paid for 1 night of work
I want to calculate my nightly charge

Pre-coding notes

Goal: To build a project that results with a single value as output which is the amount to be paid to a babysitter after the shift completion.
Inputs: 
•	Shift start time
•	Bedtime
•	Midnight time
•	Ending time

A babysitter can be paid at three different rates and thus we need to find how many hours are being worked under each pay rate using simple arithmetic problem of multiplication and addition.
In order to manage different time zones we used “local time” library.

Output

The results are displayed by calculating the wage for all sub-shifts hours worked from three different shifts.
Before Start time and after end time results are displayed saying shift not yet started.

//To get output from application:

Please run as application as java application or use Alt+Shift+X and J

//TO verify test cases please run application as JUNIT test case or use Alt+Shift+X and T