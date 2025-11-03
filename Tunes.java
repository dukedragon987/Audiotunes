public class Tunes{
        public static String[] getUserNotes(String notesLine) {  
        String[] notesArray = notesLine.split(" ");
        return notesArray;
    }


    public static void playNotes(int[] noteCodes, int[] duration) {


         for (int i = 0; i < noteCodes.length; i++) {
           StdMidi.playNote(noteCodes[i], duration[1]);
        }
    }


    public static int[] getNoteCodes(String[] notes) {
        int[] noteCodes = new int[notes.length];
        for (int i = 0; i < notes.length; i++) {
            noteCodes[i] = Notes.getNoteCode(notes[i]);
        }
        
        return noteCodes;
    }
}