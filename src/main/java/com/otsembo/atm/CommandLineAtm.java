package com.otsembo.atm;

import com.otsembo.atm.classes.CommandRouter;
import com.otsembo.atm.interfaces.CommandRouterFactory;
import com.otsembo.atm.interfaces.DaggerCommandRouterFactory;

import java.util.Scanner;

public class CommandLineAtm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CommandRouterFactory factory = DaggerCommandRouterFactory.create();

        CommandRouter commandRouter = factory.router();

        while(scanner.hasNextLine()){
            commandRouter.route(scanner.nextLine());
        }

    }

}
