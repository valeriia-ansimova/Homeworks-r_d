package homework12;

public class Child extends Parent{

    static {
        System.out.println("child static 1 -> 3");
    }

    static {
        System.out.println("child static 2 -> 4");
    }
    {
        System.out.println("child object 1 -> 8");
    }
    {
        System.out.println("child object 2 -> 9");
    }

    public Child(){
        System.out.println("Child constructor -> 10");
    }

}


