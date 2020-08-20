import java.util.*;
public class Q17 {
    public static Stack<Integer> sortstack(Stack<Integer>
                                                   input)
    {
        Stack<Integer> tmpStack = new Stack<Integer>();
        while(!input.isEmpty())
        {

            int tmp = input.pop();

            while(!tmpStack.isEmpty() && tmpStack.peek()
                    > tmp)
            {
                input.push(tmpStack.pop());
            }

            tmpStack.push(tmp);
        }
        return tmpStack;
    }

    public static void main(String args[])
    {
        Stack<Integer> input = new Stack<Integer>();
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<10;i++) {
            input.add(sc.nextInt());
        }
        Stack<Integer> tmpStack=sortstack(input);
        System.out.println("Sorted numbers are:");

        while (!tmpStack.empty())
        {
            System.out.print(tmpStack.pop()+" ");
        }
    }
}

