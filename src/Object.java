class Music {
    String name;
    String year;
    int duration;
    boolean listening;

    Music(String name,String year, int duration){
        this.name = name;
        this.year = year;
        this.duration = duration;
        this.listening = true;
    }

    void play(){
        System.out.println("Currently listening to " + this.name);
    }

}


public class Object {
    public static void main(String[] args) {
        Music music = new Music("ye","2015",4);
        

        music.play();

    }
}
