
import com.sun.source.tree.WhileLoopTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Q18 {
    public static void reverse(Queue<Integer> q){
        if(q.isEmpty()){
            return;
        }
        int item = q.poll();
        reverse(q);
        q.add(item);
    }
    public static void main(String[] args) {
        try{
            Queue<Integer> q = new LinkedList<Integer>();
            for(int i=1;i<10;i++){
                q.add(i*10);
            }
            reverse(q);

        }catch (Exception e){}
    }
}
