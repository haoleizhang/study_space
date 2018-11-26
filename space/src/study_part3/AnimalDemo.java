package study_part3;

/**
 * Created by biz on 2018/7/6.
 */

class Animal{

    public void eat(){
        System.out.println("动物是要吃东西的");
    }
}

class dog extends Animal{
    public void eat(){
        System.out.println("狗是吃肉的");
    }

}

class cat extends Animal{

    public void eat(){
        System.out.println("猫是吃鱼的");
    }
}

//饲养员

class person1{

    static void eated(Animal animal){
        System.out.println("喂动物喽");
        animal.eat();
    }
}



public class AnimalDemo {

    public static void main(String[] args){

        Animal animal = new cat();

        person1 p = new person1();

        p.eated(animal);


        Animal a = new dog();

        p.eated(a);

    }
}
