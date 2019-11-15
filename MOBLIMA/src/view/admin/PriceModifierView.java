package view.admin;

import controller.IOController;
import controller.TicketPriceController;
import controller.ViewController;

import java.io.IOException;

public class PriceModifierView extends ViewController {
    @Override
    public void initialize() throws IOException, ClassNotFoundException {
        displayMenu();
    }

    private void displayMenu() {
        while(true) {
            IOController.printTitle("Modify ticket price");
            System.out.println("List of ticket price modifier (+ - SGD)");
            System.out.println("1. Platinum cinema: " + TicketPriceController.getPlatinumPrice());
            System.out.println("2. 3D: " + TicketPriceController.get3DPrice());
            System.out.println("3. Blockbuster: " + TicketPriceController.getBlockBusterPrice());
            System.out.println("4. Senior Ticket: " + TicketPriceController.getSeniorPrice());
            //        System.out.println("5. Holiday (including weekends): " + TicketPriceController.getHolidayPrice());
            System.out.println("Select the modifier you want to edit. Press 0 to return");
            int choice = IOController.getChoice(0, 5);

            switch (choice) {
                case 0:
                    return;
                case 1:
                    double pricePlatinum = IOController.getDouble("Input the new Platinum price modifier");
                    TicketPriceController.setPlatinumPrice(pricePlatinum);
                    break;
                case 2:
                    double price3D = IOController.getDouble("Input the new 3D price modifier");
                    TicketPriceController.set3DPrice(price3D);
                    break;
                case 3:
                    double priceBlockBuster = IOController.getDouble("Input the new Blockbuster price modifier");
                    TicketPriceController.setBlockBusterPrice(priceBlockBuster);
                    break;
                case 4:
                    double priceSenior = IOController.getDouble("Input the new Senior Ticket price modifier");
                    TicketPriceController.setSeniorPrice(priceSenior);
                    break;
//                case 5:
//                    double priceHoliday = IOController.getDouble("Input the new Holiday price modifier");
//                    TicketPriceController.setHolidayPrice(priceHoliday);
            }
            System.out.println("Successfully Modified!");
        }
    }

}