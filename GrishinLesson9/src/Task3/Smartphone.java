package Task3;

// допишите реализацию класса Smartphone
public class Smartphone extends MobilePhone{

    public Smartphone(String number){
        super(number);
    }

            // объявите метод sendEmail()
            public void sendEmail(String messageText, String email) {
        System.out.println("Напишем другу сообщение " + messageText + " по email " + email);
    }

}
