package homework7;

public class MethodHandling {

    public static void main(String[] args) {
        cube(8);
        printStars(17);
        printSymbol("^", 87);

    }

    private static int cube(int cubingNumber){
        int calculateCube = cubingNumber * cubingNumber * cubingNumber;
        System.out.println(calculateCube);
        return calculateCube;
    }

    private static void printStars( int count){
        for( int i = 0; i < count; i ++) {
            System.out.print("*");
        }
        System.out.println();
    }

    private static void printSymbol( String symbol,int count){
        for( int i = 0; i < count; i ++) {
            System.out.print(symbol);
        }
    }

}
