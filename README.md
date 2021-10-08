# DaggerATM
This is me learning dagger from the docs. A simple ATM simulator.

## ATM APPLICATION SIMULATOR

An automated teller machine (ATM) or cash machine (in British English) is an electronic telecommunications device that enables customers of financial institutions to perform financial transactions, such as cash withdrawals, deposits, funds transfers, balance inquiries or account information inquiries, at any time and without the need for direct interaction with bank staff. 

This application simulates a command line ATM application. A user can log in to the bank, deposit and withdraw funds. The data is stored in-memory and no data persistence framework implemented.

### PROJECT REQUIREMENTS

This application has been built using the following:
> Java 1.8 ~ JDK

> Gradle Groovy ~ Build System

> Dagger 2.x ~ Dependency

You can create an executable jar file by following either of the followng.

* JetBrains Documentation

  -  https://www.jetbrains.com/help/idea/compiling-applications.html
  
* Java CLI
  -  jar cmf atm.mf atm.jar /* .class  /* .java

### SAMPLE COMMANDS

The following is a list of sample commands to run the application

* Log in user

        login user
 
* Deposit cash

        deposit 5000
        
* Withdraw cash

        withdraw 200
               
* Log out

        logout
        
        
## LICENSE
This application is distributed under the MIT open license. Feel free to contribute and share.
