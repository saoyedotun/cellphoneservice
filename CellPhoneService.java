import java.util.Scanner; // import the Scanner class 

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Numerical data input
    int talkMinutesUsed;
    int maximumTextMessagesSent;
    int maximumGigabytesOfDataUsed;
    
    // Plans
    String planA = "Plan A";
    int priceOfPlanA = 49;
    String planB = "Plan B";
    int priceOfPlanB = 55;
    String planC = "Plan C for up to 100 text messages";
    int priceOfPlanC = 61;
    String planD = "Plan D for 100 text messages or more";
    int priceOfPlanD = 70;
    String planE = "Plan E for up to 3 gigabytes";
    int priceOfPlanE = 79;
    String planF = "Plan F for 3 gigabytes or more";
    int priceOfPlanF = 87;
    
    // Enter talk minutes used and press Enter
    System.out.print("Enter talk minutes used: "); 
    talkMinutesUsed = scanner.nextInt(); 
        
    // Enter Maximum text messages sent and press Enter
    System.out.print("Enter Maximum text messages sent: "); 
    maximumTextMessagesSent = scanner.nextInt();   
        
    // Enter Maximum gigabytes of data used and press Enter
    System.out.print("Enter Maximum gigabytes of data used: "); 
    maximumGigabytesOfDataUsed = scanner.nextInt(); 
    
    if(talkMinutesUsed < 500 && (maximumTextMessagesSent == 0 || maximumGigabytesOfDataUsed == 0)) {
        System.out.println("Name of plan: " + planA + " at $" + priceOfPlanA + " per month.");
    } else if (talkMinutesUsed < 500 && maximumTextMessagesSent > 0) {
        System.out.println("Name of plan: " + planB + " at $" + priceOfPlanB + " per month.");
    } else if (talkMinutesUsed >= 500 && maximumGigabytesOfDataUsed == 0) {
        System.out.println("Name of plan: " + planC + " at $" + priceOfPlanC + " per month.");
        System.out.println("OR");
        System.out.println("Name of plan: " + planD + " at $" + priceOfPlanD + " per month.");
    } else if (maximumGigabytesOfDataUsed > 0 && (talkMinutesUsed == 0 && maximumTextMessagesSent == 0 )) {
        System.out.println("Name of plan: " + planE + " at $" + priceOfPlanE + " per month.");
        System.out.println("OR");
        System.out.println("Name of plan: " + planF + " at $" + priceOfPlanF + " per month.");
    } else {
        System.out.println("No plan");
    }
  }
}
