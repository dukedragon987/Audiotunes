public class Tunes {

    public static String[] getUserNotes(String notesLine) {  
        return notesLine.trim().split("\\s+"); // safer split
    }

    public static void playNotes(int[] noteCodes, int duration) {
        for (int code : noteCodes) {
            StdMidi.playNote(code, duration); // assumes StdMidi exists
        }
    }

    public static int[] getNoteCodes(String[] notes) {
        int[] noteCodes = new int[notes.length];
        for (int i = 0; i < notes.length; i++) {
            noteCodes[i] = Notes.getNoteCode(notes[i]); // assumes Notes exists
        }
        return noteCodes;
    }

    public static String happyBirthday() {
        String line = "C4 C4 D4 C4 F4 C4 C4 D4 C4 G4 C4 C4 C5 A4 F4 E4 D4 D4 C4 G4 F4";
        String[] notes = getUserNotes(line);
        int[] noteCodes = getNoteCodes(notes);
        playNotes(noteCodes, 1);
        return line;
    }

    public static String jingleBells() {
        String line = " E4 E4 E4 E4 E4 E4 E4 G4 C4 D4 E4 F4 F4 F4 F4 F4 E4 E4 E4 E4 D4 D4 E4 D4 G4 E4 E4 E4 E4 E4 E4 E4 G4 C4 D4 E4 F4 F4 F4 F4 F4 E4 E4 E4 E4 D4 D4 E4 D4 G4 C4 C4 C4 C4 G4 G4 F4 D4 C4";
        String[] notes = getUserNotes(line);
        int[] noteCodes = getNoteCodes(notes);
        playNotes(noteCodes, 1);
        return line;

    }
        public static String twinkle () {
        String line = " C4 C4 G4 G4 A4 A4 G4 F4 F4 E4 E4 D4 D4 C4 G4 G4 F4 F4 E4 E4 D4 G4 G4 F4 F4 E4 E4 D4 C4 C4 G4 G4 A4 A4 G4 F4 F4 E4 E4 D4 D4 C4";
        String[] notes = getUserNotes(line);
        int[] noteCodes = getNoteCodes(notes);
        playNotes(noteCodes, 1);
        return line;
    }
}
