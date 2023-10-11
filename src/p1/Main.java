import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try{
            int res = sum(30, 10);
            System.out.println(res);
        }catch (MyException exception){
            System.out.println(exception.getMessage());
            System.out.println(exception.getX() + " " + exception.getY());
        }

        /*
        try {
            Scanner scanner = new Scanner(System.in);
            int[] nums = new int[3];
            int x = scanner.nextInt();
            if (x > nums.length) {
                throw new NumberFormatException("x > length array");
            }
            nums[x] = 45;
            System.out.println(nums[x]);
            System.out.println(sum(30, 20));
        } catch (NumberFormatException exception) {
            System.out.println("Error");
            exception.printStackTrace();
            exception.getStackTrace();
            exception.getMessage();
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Array index error");
        } catch (MyException exception){
            System.out.println(exception.getMessage());
        }
        finally {
            System.out.println("Finally");
        }
        System.out.println("Exit");*/
    }

    public static int sum(int x, int y) throws MyException{
        if (x>y) throw new MyException(x,y,"X>Y");
        return x+y;
    }

    //Throwable
    //Exception Error

    //RuntimeException
    //ArithmeticException
    //IndexOutOfBoundsException
    //IllegalArgumentException
    //NullPointerException
    //NumberFormatException

    //CloneNotSupportedException
    //InterruptedException
    //ClassNotFoundException

}