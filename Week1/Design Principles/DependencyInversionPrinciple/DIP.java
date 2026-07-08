package Week1.DependencyInversionPrinciple;

public class DIP {

    public static void main(String[] args) {

        // Email Notification
        MessageService email =
                new EmailService();

        Notification n1 =
                new Notification(email);

        n1.notifyUser();

        System.out.println();

        // SMS Notification
        MessageService sms =
                new SMSService();

        Notification n2 =
                new Notification(sms);

        n2.notifyUser();

        System.out.println();

        // WhatsApp Notification
        MessageService whatsapp =
                new WhatsAppService();

        Notification n3 =
                new Notification(whatsapp);

        n3.notifyUser();
    }
}

// Interface
interface MessageService {

    void sendMessage();
}

// Email Service
class EmailService
        implements MessageService {

    @Override
    public void sendMessage() {

        System.out.println(
                "Email Notification Sent."
        );
    }
}

// SMS Service
class SMSService
        implements MessageService {

    @Override
    public void sendMessage() {

        System.out.println(
                "SMS Notification Sent."
        );
    }
}

// WhatsApp Service
class WhatsAppService
        implements MessageService {

    @Override
    public void sendMessage() {

        System.out.println(
                "WhatsApp Notification Sent."
        );
    }
}

// High Level Module
class Notification {

    private MessageService service;

    public Notification(
            MessageService service) {

        this.service = service;
    }

    public void notifyUser() {

        service.sendMessage();
    }
}