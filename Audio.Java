import java.util.Scanner;


public class Audio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("First enter your number of notes, than enter you notes on a different line");


        int length = Integer.parseInt(sc.nextLine());
        String[] notes = new String[length];
        int[] duration = {1, 1, 1, 1, 1, 1, 1, 1, 1};


        for (int i = 0; i < notes.length; i++) {
            notes[i] = sc.nextLine();
        }
       
        // String[] notes = {"A4", "G4" ,"C4", "F4", "E4", "C4"};
        int[] noteCodes = new int[notes.length];


        for (int i = 0; i < noteCodes.length; i++) {
            noteCodes[i] = Notes.getNoteCode(notes[i]);
        }


        StdMidi.noteOn(0);
        StdMidi.setInstrument(30);
        StdMidi.setTempo(60);


        for (int i = 0; i < notes.length; i++) {
   
           StdMidi.playNote(noteCodes[i], duration[i]);
        }

    
       
    }
    public static String[] getUserNotes(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How manny notes do you have");
        int length = Integer.parseInt(sc.nextLine());
        String[] notes = new String[length];
        for (int i = 0; i< notes.length; i++){
            notes[i] = sc.nextLine();
        }
        return notes;
    }
public static int[] getNoteCode(String[]notes){
    int[] noteCode = new int[notes.length];
    for (int i = 0; i< notes.length; i++){
        noteCode[i] = Notes.getNoteCode(notes[i]);

    }
    return noteCode;
}
}


