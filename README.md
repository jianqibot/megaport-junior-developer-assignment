# megaport-junior-developer-assignment

![Build](https://img.shields.io/github/workflow/status/jianqibot/megaport-junior-developer-assignment/Java%20CI%20with%20Maven) ![Coverage](.github/badges/jacoco.svg) ![Branches](.github/badges/branches.svg)

Assignment from Megaport(Junior java developer position)



## Quick Start


```sh
# Download source code
$ git clone https://github.com/jianqibot/megaport-junior-developer-assignment.git
$ cd megaport-junior-developer-assignment

# Prepare text file
# Create a new file on your disk names ${text-file-name}.txt with following example entries,
  
# BAKER,THEODORE
# SMITH,ANDREW
# KENT,MADISON
# SMITH,FREDRICK

# Test
$ mvn test

# Build 
$ mvn -Dmaven.test.skip=true package

# run
$ java -jar target/mepaport-junior-developer-assignment-1.0-SNAPSHOT.jar "Path-To-Your ${text-file-name}.txt"
  
# for example,
$ java -jar target/mepaport-junior-developer-assignment-1.0-SNAPSHOT.jar names.txt
$ java -jar target/mepaport-junior-developer-assignment-1.0-SNAPSHOT.jar ~/Documents/names.txt

# Check the result 
# in the same directory of your "input-text-file", find a file called ${text-file-name}-sorted.txt 
# in unix system,
$ cat ${text-file-name}-sorted.txt
# take above example, the result should be
  
# BAKER,THEODORE
# KENT,MADISON
# SMITH,ANDREW
# SMITH,FREDRICK
```
