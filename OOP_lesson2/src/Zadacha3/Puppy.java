package Zadacha3;

/**
 * Created by Andrey on 20.07.2016.
 */
public class Puppy extends Dog{

    public Puppy(String name) {
        validatorNull(name);
        this.name = name;
        getName();
        jump();
        run();
        bark();
        bite();
    }

    @Override
    public void bark() {
        System.out.println("Щенок делает тяв-тяв-тяв");
    }

    @Override
    public void bite() {
        System.out.println("Щенок делает кусь-кусь");
    }

    public void getName(){
        System.out.println(name);
    }

    private boolean nullCheck(String s){
        boolean result = s != null;
        return result;
    }

    private void validatorNull(String s){
        if (!nullCheck(s)){
            throw new IllegalArgumentException("It can't be null");
        }
    }

}
