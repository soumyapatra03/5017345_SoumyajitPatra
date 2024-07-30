// Main.java
public class Main {
    public static void main(String[] args) {
        // Create a basic email notifier
        Notifier emailNotifier = new EmailNotifier();
        emailNotifier.send("Hello, this is a test notification!");

        // Add SMS functionality
        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);
        smsNotifier.send("Hello, this is a test notification!");

        // Add Slack functionality
        Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);
        slackNotifier.send("Hello, this is a test notification!");
    }
}
