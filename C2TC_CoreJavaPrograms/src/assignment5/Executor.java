package assignment5;
import java.util.Scanner;
public class Executor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        String bookingDetails = sc.nextLine(); // e.g. Magic show,Lunu,43
        String[] parts = bookingDetails.split(",");

        if (parts.length != 3) {
            System.out.println("Invalid booking input");
            return;
        }

        String stageEvent = parts[0];
        String customer = parts[1];
        int noOfSeats = Integer.parseInt(parts[2]);

        TicketBooking booking = new TicketBooking(stageEvent, customer, noOfSeats);

        if (!sc.hasNextInt()) {
            System.out.println("Invalid choice");
            return;
        }

        int choice = sc.nextInt();
        sc.nextLine(); 

        booking.displayDetails();

        switch (choice) {
            case 1: 
                double amountCash = sc.nextDouble();
                booking.makePayment(amountCash);
                break;

            case 2: 
                double amountWallet = sc.nextDouble();
                sc.nextLine(); 
                String walletNumber = sc.nextLine();
                booking.makePayment(amountWallet, walletNumber);
                break;

            case 3: 
                String holderName = sc.nextLine();
                double amountCard = sc.nextDouble();
                sc.nextLine(); 
                String cardType = sc.nextLine();
                String ccv = sc.nextLine();
                booking.makePayment(holderName, amountCard, cardType, ccv);
                break;

            default:
                System.out.println("Invalid choice");
        }
    }

	}


