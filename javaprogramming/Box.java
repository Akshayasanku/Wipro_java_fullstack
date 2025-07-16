import java.util.Scanner;
class Box{
    double volume;
    void volume(int width,int height,int depth){
        this.volume= width*height*depth;
    }
    void display(){
        System.out.println("Volume "+volume);
    }
    public static void main(String args[]){
        Box boxvolume= new Box();
        boxvolume.volume(500,20,10);
        boxvolume.display();
    }
}
