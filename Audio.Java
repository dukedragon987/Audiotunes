
public class Audio {
  public static void main(String[] args) {
    System.out.println("Hello welcome to audio tunes just wait and listen");
   playTwinkle(100);
   StdMidi.pause(2);
   oCanada(100);

  }  

static void playTwinkle(int beatsPerMinute){
  int[] notes = {StdMidi.C4, StdMidi.C4, StdMidi.G4, StdMidi.A4, StdMidi.A4,StdMidi.C4};
  int [] duration = {1, 1, 1,1,2,1,1,2};
  for (int i = 0; i < notes.length; i++){
     StdMidi.playNote(notes[i], duration);
  }
 
}
static void oCanada(int beatsPerMinute){
    StdMidi.noteOn(10);
    StdMidi.setTempo(1);
    StdMidi.setInstrument(70);
    StdMidi.playNote(StdMidi.G5, beatsPerMinute);

}
}
