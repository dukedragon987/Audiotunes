
public class Audio {
  public static void main(String[] args) {
    System.out.println("Hello welcome to audio tunes just wait and listen");
   playTwinkle(60);
   StdMidi.pause(2);
   oCanada(100);

  }  

static void playTwinkle(int beatsPerMinute){
  String[] notesString = {"G4","A4","G4", };
  int[] notesCode = new int[notesString.length];


  
   int [] duration = {1,1,1,1,1,1,1,1,1,1,1,};

   for ( int i =0; i< notesCode.length;i++){
    notesCode[i] = Notes.getNoteCode(notesString[i]);
   }
           for (int i = 0; i < notesString.length; i++) {
           
           StdMidi.playNote(notesCode[i], duration[i]);
        }
       
    }


 

static void oCanada(int beatsPerMinute){
    StdMidi.noteOn(10);
    StdMidi.setTempo(60);
    StdMidi.setInstrument(70);
    StdMidi.playNote(StdMidi.G5, beatsPerMinute);

}

@Override
public String toString() {
  return "Audio []";
}
}
