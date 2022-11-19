package ss11_DSA_Stack_Queue.thuchanh;

public class GenericStackClient {
    public static void main(String[] args) {
        System.out.println("1. Stack of integers");
        stackOfIntegers();
        System.out.println("\n2. Stack of Strings");
        stackOfIStrings();
    }
    public static void stackOfIStrings(){
        MyGenericStack<String> stack=new MyGenericStack<>();
        stack.push("hieu");
        stack.push("pro");
        stack.push("123");
        System.out.println("1.1 Size of stack after push operations: " + stack.size());
        System.out.printf("1.2. Pop elements from stack : ");
        while (!stack.isEmpty()){
            System.out.printf("%s ", stack.pop());
        }
        System.out.println("\n1.3. Size of stack after pop operations : " + stack.size());
    }
    public static void stackOfIntegers(){
        MyGenericStack<Integer> stack=new MyGenericStack<>();
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }
        System.out.println("\n3.3 Size of stack after pop operations : " + stack.size());
    }
}
