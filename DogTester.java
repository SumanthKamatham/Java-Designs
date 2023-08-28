class Dog{
    String name;
    void bark(){
        System.out.println(name+" Says Ruff");
    }
    void eat(){

    }
    void chaseCat(){

    }
}
public class DogTester{
    public static void main(String args[]){
        Dog myDog=new Dog();
        myDog.name="jimmy";
        myDog.bark();
        //create a array references of dog class
        Dog[] dogs=new Dog[3];
        dogs[0]=new Dog();
        dogs[1]=new Dog();
        dogs[2]=myDog;
        
        dogs[0].name="Bruno";
        dogs[1].name="Tiger";

        for(int list=0;list<dogs.length;list++){
            dogs[list].bark();
        }
    }
}