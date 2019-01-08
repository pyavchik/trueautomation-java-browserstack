# trueautomation-java-browserstack

You must have: <br>
installed TrueAutomation client, JDK 8 or later. <br>
account at www.browserstack.com

## How to run test:

* Checkout project

 ```
 git clone https://github.com/pyavchik/trueautomation-java-browserstack.git
 ```
* Set up your username and automation key:
```
public static final String USERNAME = "USERNAME";
public static final String AUTOMATE_KEY = "AUTOMATE_KEY";
```
* Init project use `trueautomation init` command
 
* Run test

```bash
mvn -Dtest=exampleTest test

```