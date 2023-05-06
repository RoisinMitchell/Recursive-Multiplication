public class multRecursiveDriver {
    public static void main(String[] args){
        int x = (int) (Math.random() * 100);
        int y = (int) (Math.random() * 100);
        multRecursive myMultiply = new multRecursive();
        int result = myMultiply.mult(x, y);
        System.out.println(x + " * " + y + " = " + result);
    }
}
