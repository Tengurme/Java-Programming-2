import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Q19 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            Queue<Integer> que = new LinkedList<>();
            for(int i=1;i<10;i++){
                que.add(i*10);
            }
            int n = sc.nextInt();
            reversek(que,n);
            for(int i:que){
                System.out.println(i);
            }
        }catch (Exception e){};

    }

    public static void reversek(Queue<Integer> q,int k){
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> Q = new LinkedList<>();
        while(k!=0){
            stack.push(q.poll());
            k--;
        }
        while (!stack.isEmpty()){
            Q.add(stack.pop());
        }
        while (!q.isEmpty()){
            Q.add(q.poll());
        }
    }
}
