package homework12;

public class Parent {

    static {
        System.out.println("parent static 1 -> 1");
    }
    static {
        System.out.println("parent static 2 -> 2");
    }
    {
        System.out.println("parent object 1 -> 5");
    }
    {
        System.out.println("parent object 2 -> 6");
    }

    public Parent(){
        System.out.println("Parent constructor -> 7");
    }

}
