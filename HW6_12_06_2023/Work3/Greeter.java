package HW6_12_06_2023.Work3;

public class Greeter {
    private String formality;

    public String greet() {
        switch (this.formality) {
            case "formal":
                return "Good evening, sir.";
            case "casual":
                return "Sup bro?";
            case "intimate":
                return "Hello Darling!";
            default:
                return "Hello.";
        }
    }

    public void setFormality(String formality) {
        this.formality = formality;
    }
}
