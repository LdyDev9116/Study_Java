package oop.day8.interface_2;

public class InterfaceMain {
    public static void main(String[] args) {

        InterfaceImpl impl = new InterfaceImpl();
        System.out.println(impl.toString());
        InterfaceA interfaceaA = impl;
        InterfaceB interfaceaB = impl;
        InterfaceC interfaceaC = impl;

        interfaceaA.methodA();

        interfaceaB.methodB();

        interfaceaC.methodA();
        interfaceaC.methodB();
        interfaceaC.methodC();

    }

}
