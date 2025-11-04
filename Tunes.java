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


    

    public static void playFile(int filename) {
        
       
    }


    public static String happyBirthday(int i) {
      String line = "C4 C4 D4 C4 F4 C4 C4 D4 C4 G4 C4 C4 C5 A4 F4 E4 D4 D4 C4 G4 F4";
        return line;
    }


        
    }
