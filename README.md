# Dating with Clojure

Okay so I have a complicated love life. I know. I know I'm the one that complicates. Now let me
show you how complicated it will be with Clojure!

## Lets get straight to it you and I

And also these four characters => C.R.U.D

```
Create
Read
Update
Delete
```

With each of those sexy operators we will join them in what they in the mapping and filing. So stay hydrated.

> Btw, as most of my love affairs, I'am 100% anxious

Test me

`./test.sh`

Run me

`./first-date`

# Testing

Darling we have to test. As a first pass, `test.sh` will begin all the current testing. It's made of two parts. 1. Calls the test task and pass all output to a test-report.txt file. 

> test is defined inside the bb.edn file.

2. The sha256sum is taken off the test-report.txt. I'm doing that because other than knowing that the test passed we will also know if and when test results change over time. I know I'm making excuses but we have testing.