public class Main {
    public static void main(String[] args) {
        // First log
        System.out.println("Java Music Instrument Project!");

        String[] concertSounds = performConcert();
        
        for (String item : concertSounds) {
            System.out.println(item);
        }
    }
    
    static Instrument addHorn(){
        Instrument horn = new Horn();
        return horn;
    }

    static Instrument addFlute(){
        Instrument flute = new Flute();
        return flute;
    }

    static Instrument addViolin(){
        Instrument violin = new Violin();
        return violin;
    }

    static String[] performConcert() {
        var horn = addHorn();
        var flute = addFlute();
        var violin = addViolin();

        String[] sounds = new String[3];
        sounds[0] = play(horn);
        sounds[1] = play(flute);
        sounds[2] = play(violin);

        return sounds;
    }

    static String play(Instrument instrument) {
        return instrument != null ? instrument.playSound() : null;
    }
}

abstract class Instrument {
    public abstract String playSound();
}

class Flute extends Instrument {
    public String playSound() {
        return "Gentle clear, bright tones cascade from the flute.";
    }
}

class Horn extends Instrument {
    public String playSound() {
        return "Rich and mellow sounds resonate through the air from the horn.";
    }
}

class Violin extends Instrument {
    public String playSound() {
        return "The violin's high-pitched and melodious tones fill the room.";
    }
}