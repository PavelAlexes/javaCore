package ProjectPhone;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose command: ");
        System.out.println("    1. Create new phone");
        System.out.println("    2. Create new person");
        System.out.println("    3. Buy new phone for a person");
        System.out.println("    4. Send message");
        System.out.println("    2. Show all phones");

        String scanner = sc.nextLine();



        switch (scanner){
            case "1":
                System.out.print("Enter number: ");
//                String number = sc.nextLine();

                System.out.print("Enter model: ");
//                String model = sc.nextLine();

                Phone phone = new Phone(sc.nextLine(), sc.nextLine());
//                Collections.phones.add(new Phone(sc.nextLine(), sc.nextLine()));

                System.out.println(STR."Phone \{phone.toString()} created");
                break;

                case "2":
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Do you have any phone(yas | no): ");
                    String choose = sc.nextLine();
                    switch (choose){
                        case "yas":
                            System.out.print("Enter number: ");


                    }

                    Collections.phones.add(new Phone(sc.nextLine(), sc.nextLine()));

//                    System.out.println(STR."Phone \{phone.toString()} created");
                    break;
        }


    }
}
