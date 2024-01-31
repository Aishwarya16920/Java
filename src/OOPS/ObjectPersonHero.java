package OOPS;

public class ObjectPersonHero {
    public static void main(String[] args){

        Hero hero = new Hero("Batman", 42, "$$$");
        System.out.println(hero.name);
        System.out.println(hero.age);
        System.out.println(hero.power);

        hero.toString();
    }
}
