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
            for (int i = 0; i<100;i++){
                stackOfInteger.pushFromStack(1 + i);
            }
        stackOfInteger.printStack();
        System.out.println("********************************");
        stackOfInteger.popFromStack();
        stackOfInteger.printStack();
        System.out.println("********************************");
    }
}