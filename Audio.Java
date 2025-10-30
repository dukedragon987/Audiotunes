import java.util.Scanner;

// Twinkle twinkle C4 C4 G4 G4 A4 A4 G4 F4 F4 E4 E4 D4 D4 C4 G4 G4 F4 F4 E4 E4 D4 G4 G4 F4 F4 E4 E4 D4 C4 C4 G4 G4 A4 A4 G4 F4 F4 E4 E4 D4 D4 C4
// Happy birthday  C4 C4 D4 C4 F4 C4 C4 D4 C4 G4 C4 C4 C5 A4 F4 E4 D4 D4 C4 G4 F4
// jingle bells E4 E4 E4 E4 E4 E4 E4 G4 C4 D4 E4 F4 F4 F4 F4 F4 E4 E4 E4 E4 D4 D4 E4 D4 G4 E4 E4 E4 E4 E4 E4 E4 G4 C4 D4 E4 F4 F4 F4 F4 F4 E4 E4 E4 E4 D4 D4 E4 D4 G4 C4 C4 C4 C4 G4 G4 F4 D4 C4
//
public class Audio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] duration = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,};
        String[] notes = getUserNotes(sc.nextLine());
        int[] noteCodes = getNoteCodes(notes);


       playNotes(noteCodes, duration);    
    }


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


