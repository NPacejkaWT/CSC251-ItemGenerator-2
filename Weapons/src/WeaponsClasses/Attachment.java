package WeaponsClasses;

public class Attachment {
    private final String attachmentName;

    public Attachment(String attachmentName) {
        this.attachmentName = attachmentName;
    }

    @Override
    public String toString() {
        return attachmentName;
    }
}
