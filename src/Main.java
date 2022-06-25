public class Main {
    public static void main(String[] args) {
        int account = 1200;
        int addFunds = 700;
        int bonus;
        if (account > 1000) {
            bonus = addFunds / 100;
        } else {
            bonus = 0;
        }
        int accountBalance = (account + addFunds + bonus);
        System.out.println(bonus);
        System.out.println(accountBalance);
    }
}
