package tasks.classwork.den3classWork;

public class SpeakRunner {
    public static void main(String[] args) {

        Person men = new Men();
        men.speak("da");

        speakAnySpeakable(new Person());
        speakAnySpeakable(new Dog());
        speakAnySpeakable(new Kat());
    }
    private static void speakAnySpeakable(Speakable speakable) {
        speakable.speak(("ekek"));
    }

}

