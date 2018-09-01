package Zadania_6_9_08;

public class TextEmail extends Data {

    //TODO pola powinny być prywatne
    String emailAddress;
    String title;
    String content;

    public TextEmail(String emailAddress, String title, String content) {
        super(emailAddress, title);
        this.content = content;
    }

}
