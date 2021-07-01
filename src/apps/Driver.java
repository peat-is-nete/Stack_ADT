package apps;
import ArrayStack.*;
import Interface.StackInterface;
import ArrayListStack.*;



public class Driver {



    public static void main(String[] args){

        StackInterface<String> test;
        test = new ArrayBoundedStack<>();

        test.push("A");
        test.push("B");
        test.push("C");

        String x = test.top();
        String y = test.top();

        System.out.println("This is x: " + x + " & " + "This is y: " + y);


        StackInterface<String> test1;
        test1 = new ArrayListStack<String>();

        test1.push("A");
        test1.push("B");
        test1.push("C");

        String x1 = test.top();
        String y1 = test.top();

        System.out.println("This is x: " + x1 + " & " + "This is y: " + y1);


    }

}
