public class inte {
    public static void main(String[] args) {
 Media music = new Music();
 music.play();
 music.stop();
 music.pause();
  Media vedio = new Vedio();
  vedio.play();
  vedio.stop();
  vedio.pause();
    }
}
 interface Media {
    void play();
    void stop();
    default void pause() {
        System.out.println("Playback paused.");
    }
    static void resetAll() {
        System.out.println("All media have been reset to default");
    }
 }
 class Music implements Media {
     public void play() {
         System.out.println("Music is playing");
     }

     public void stop() {
         System.out.println("Music is stopped");
     }

     public void pause() {
         System.out.println("Music is paused");
     }
 }
 class Vedio implements Media {
     public void play() {
         System.out.println("Vedio is playing");
     }

     public void stop() {
         System.out.println("Vedio is stopped");
     }

     public void pause() {
         System.out.println("Vedio is paused");
     }
 }

