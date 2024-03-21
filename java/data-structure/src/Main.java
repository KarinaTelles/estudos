//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        ArrayTwo arrayTwo = new ArrayTwo();
//        arrayTwo.percorreArray();
//        Array array = new Array();
//        array.loopArrayHighSeas();
//        array.loopArrayNumber();
//        array.loopArrayString();
        StackOfInteger stackOfInteger = new StackOfInteger();
        System.out.println("********************************");
        stackOfInteger.pushFromStack(1);
        stackOfInteger.pushFromStack(2);
        stackOfInteger.pushFromStack(3);
        stackOfInteger.pushFromStack(4);
        stackOfInteger.pushFromStack(5);
        stackOfInteger.pushFromStack(6);
        stackOfInteger.printStack();
        System.out.println("********************************");
        stackOfInteger.popFromStack();
        stackOfInteger.printStack();
        System.out.println("********************************");
    }
}