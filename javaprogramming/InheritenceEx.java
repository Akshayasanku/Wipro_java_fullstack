import java.util.Scanner;
class InheritenceEx{
public static void main(String[] args){
Dog dog=new Dog();
dog.eat();
dog.barks();
}
}
class Animal{
   void eat(){
      System.out.println("Eating...");
      }
}
class Dog extends Animal{
void barks(){
System.out.println("Barking...");
}
}
