package homework18;

public class Vocabulary {

        private String english;
        private String japanese;
        private String german;

    public Vocabulary(String english, String japanese, String german) {
        this.english = english;
        this.japanese = japanese;
        this.german = german;
    }

    @Override
    public String toString() {
        return
                "english='" + english + '\'' +
                ", japanese='" + japanese + '\'' +
                ", german='" + german + '\'' ;
    }
}
