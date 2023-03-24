package seedu.bankwithus;

import java.util.Scanner;

public class Ui {

    private Scanner scanner;

    public void showFileNotFoundError() {
        System.out.println("File not found, trying to create file.");
    }

    public void showFileCreated() {
        System.out.println("Savefile created successfully!");
    }

    public void showIOError() {
        System.out.println("Something's really wrong! Exiting program now.");
    }

    public void showNumberFormatError() {
        System.out.println("The input is not a valid number! Please try again.");
    }

    public void showNullInputError() {
        System.out.println("The input cannot be empty! Please try again.");
    }

    public void showCommandNotFoundError() {
        System.out.println("Not a valid command!");
    }

    public void showFarewellMessage() {
        System.out.println("Goodbye! Hope to see you again! :)");
    }

    public void showAddAccountMessage() {
        System.out.println("Account created!");
    }

    public void showDepositMessage() {
        System.out.println("New deposit added!");
    }

    public void showWithdrawMessage() {
        System.out.println("Withdrawal successful!");
    }

    /**
     * Creates a scanner in the Ui class
     */
    public void createScanner() {
        this.scanner = new Scanner(System.in);
    }

    /**
     * Gets the next line of user input
     *
     * @return the next of user input
     */
    public String getNextLine() {
        return scanner.nextLine();
    }

    /**
     * Closes the scanner
     */
    public void closeScanner() {
        this.scanner.close();
    }

    public void printLine() {
        System.out.println("----------------------------");
    }

    public void viewAccount(String accDetails) {
        String[] accounts = accDetails.split("\\n");
        System.out.println("MAIN Account:");
        for (String account : accounts) {
            String name = account.split(";")[0];
            String bal = account.split(";")[1];
            System.out.println("Name: " + name);
            System.out.println("Balance: $" + bal);
            printLine();
        }
    }

    public void showBal(String finalBal) {
        System.out.println("You have $" + finalBal + " remaining!");
    }

    public void showNegativeAmountError() {
        System.out.println("Negative amount entered!");
    }

    public void showInsufficientBalanceMessage() {
        System.out.println("You do not have sufficient Balance");
        printLine();
    }

    public void showHelp() {
        System.out.println("help: displays the current menu");
        System.out.println("view-account: shows account name and balance");
        System.out.println("withdraw <amount>: withdraws <amount> from available balance");
        System.out.println("deposit <amount>: deposits <amount> and adds deposit to balance");
        System.out.println("set-wl <amount>: sets <amount> to be the withdrawal limit");
        System.out.println("check-wl: shows the withdrawal limit and the amount of money withdrawn");
        System.out.println("          this month.");
        System.out.println("exit: quits program and saves");
        printLine();
    }

    public void greet() {
        System.out.println("Welcome to: ");
        System.out.println("\n" +
                " /$$$$$$$                      /$$       /$$      /$$" +
                " /$$   /$$     /$$       /$$   /$$          \n" +
                "| $$__  $$                    | $$      | $$  /$ | $$" +
                "|__/  | $$    | $$      | $$  | $$          \n" +
                "| $$  \\ $$  /$$$$$$  /$$$$$$$ | $$   /$$| $$ /$$$|" +
                " $$ /$$ /$$$$$$  | $$$$$$$ | $$  | $$  /$$$$$$$\n" +
                "| $$$$$$$  |____  $$| $$__  $$| $$  /$$/| $$/$$ $$" +
                " $$| $$|_  $$_/  | $$__  $$| $$  | $$ /$$_____/\n" +
                "| $$__  $$  /$$$$$$$| $$  \\ $$| $$$$$$/ | $$$$_  " +
                "$$$$| $$  | $$    | $$  \\ $$| $$  | $$|  $$$$$$\n" +
                "| $$  \\ $$ /$$__  $$| $$  | $$| $$_  $$ | $$$/ \\  " +
                "$$$| $$  | $$ /$$| $$  | $$| $$  | $$ \\____  $$\n" +
                "| $$$$$$$/|  $$$$$$$| $$  | $$| $$ \\  $$| $$/   \\ " +
                " $$| $$  |  $$$$/| $$  | $$|  $$$$$$/ /$$$$$$$/\n" +
                "|_______/  \\_______/|__/  |__/|__/  \\__/|__/     " +
                "\\__/|__/   \\___/  |__/  |__/ \\______/ |_______/\n"
        );
    }

    public void askForName() {
        System.out.println("What's your name?");
    }

    public void showBlankUserNameError() {
        System.out.println("User Name cannot be blank.");
    }

    public void askForBalance() {
        System.out.println("How much would you like to add as Balance?");
    }

    public void showCorruptedSaveFileError() {
        System.out.println("Save file is corrupted!!! Creating new account...");
    }

    public void showForbiddenCharacterError() {
        System.out.println("Please do not put the chacter ';' in the name.");
    }
    //@@author Sherlock-YH
    public void showAccountDeleted(String name) {
        System.out.println("Account: " + name + " deleted");
        printLine();
    }
    //@@author Sherlock-YH
    public void showNoAccountFound() {
        System.out.println("Account is not found, please rectify the name");
        printLine();
    }
    //@@author Sherlock-YH
    public void showAccountNotFound() {
        System.out.println("There is no account");
        printLine();
    }

    public void showEmptyFile() {
        System.out.println("There is no saved account, please create a new account");
        printLine();
    }
    //@@author Sherlock-YH
    public void showNumberOfAccount(int accSize) {
        System.out.println("Found " + accSize + " Account");
        printLine();
    }
    //@@author Sherlock-YH
    public void showNewAccountAdded(Account acc) {
        printLine();
        System.out.println("Account created!");
        System.out.println("Name: " + acc.getAccountName());
        System.out.println("Balance: $" + acc.getAccountBalance());
        printLine();
    }
    //@@author Sherlock-YH
    public void showThereIsOnlyOneAccount() {
        System.out.println("There is only one account");
        printLine();
    }
    //@@author Sherlock-YH
    public void showMainAccountSwitched() {
        System.out.println("Main Account switched");
        printLine();
    }
    //@@author tyuyang
    public void showWithdrawalLimitSet(String withdrawalLimit) {
        System.out.println("Withdrawal limit set to " + withdrawalLimit + "!");
    }

    public void showWithdrawalLimit(String withdrawalLimit) {
        if (withdrawalLimit != null) {
            System.out.println("Withdrawal limit is currently " + withdrawalLimit + ".");
        } else {
            System.out.println("No withdrawal limit set!");
        }
    }

    public void showTotalAmountWithdrawn(String totalAmtWithdrawn) {
        System.out.println("You have withdrawn " + totalAmtWithdrawn + " this month.");
    }
}
