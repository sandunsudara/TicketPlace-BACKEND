package com.ticketplace.cli;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.Yaml;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class ApplicationCLI {

    private int totalTickets;
    private int ticketReleaseRate;
    private int customerRetrievalRate;
    private int maxTicketCapacity;
    private static String path = "src/main/resources/application-dev.yml";

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            System.out.println("\n+----------------------------------------------+\n|      Admin Panel For TicketPlace System      |\n+----------------------------------------------+");
            System.out.println("\n1. Configure System\n2. Monitor System\n3. Exit");
            System.out.print("\nEnter your choice : ");
            switch (scanner.nextLine()) {
                case "1":
                    configureSystem();
                    break;
                case "2":
                    System.out.print("Monitor");
                    break;
                case "3":
                    loop = false;
                    break;
                default:
                    System.out.println("\tInvalid choice...");
            }

        }
    }


    public void configureSystem(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n+----------------------------------+\n|         Configure System         |\n+----------------------------------+\n");

        totalTickets=getValidInput(scanner ,"Enter total tickets available in system : ");
        ticketReleaseRate=getValidInput(scanner,"Enter ticket release rate (tickets per interval): ");
        customerRetrievalRate=getValidInput(scanner,"Enter customer retrieval rate (purchases per interval): ");
        maxTicketCapacity=getValidInput(scanner,"Enter max ticket capacity: ");

        System.out.println("Configuration complete.");

        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            Map<String,Object> data = new Yaml().load(fileInputStream);
            Map<String,Object> projectData = (Map<String, Object>) data.get("project");

            projectData.put("totalTickets", totalTickets);
            projectData.put("ticketReleaseRate", ticketReleaseRate);
            projectData.put("customerRetrievalRate", customerRetrievalRate);
            projectData.put("maxTicketCapacity", maxTicketCapacity);

            DumperOptions options = new DumperOptions();
            options.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);
            options.setIndent(2);
            options.setPrettyFlow(true);

            Yaml yaml = new Yaml(options);

            FileWriter fileWriter = new FileWriter(path);
            yaml.dump(data, fileWriter);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private int getValidInput(Scanner scanner , String que) {
        int value;
        while (true) {
            try {
                System.out.print(que);
                value = Integer.parseInt(scanner.nextLine());
                if (value > 0) {
                    break;
                } else {
                    System.out.print("Invalid input, Enter the positive number, Try again..\n");
                }
            } catch (NumberFormatException e) {
                System.out.print("Invalid input, Try again..\n");
            }
        }
        return value;
    }

    public static void main(String[] args) {
        ApplicationCLI app = new ApplicationCLI();
        app.menu();
    }

}
