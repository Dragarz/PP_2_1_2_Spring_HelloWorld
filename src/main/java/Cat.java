import java.io.Serializable;

public class Cat implements Serializable {
    private String say;

    public Cat() {
        say = "мяу";
    }

    public String getSay() {
        return say;
    }

    public void setSay(String say) {
        this.say = say;
    }
}