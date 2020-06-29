package com.study.designpatterns.structural.adaptor;

public class AdaptorMain {
    public static void main(String[] args) {
        SocketAdaptor socketAdaptorInheritance  = new SocketAdaptorImplInheritance();

        System.out.println(socketAdaptorInheritance.get3Volt());
        System.out.println(socketAdaptorInheritance.get12Volt());
        System.out.println(socketAdaptorInheritance.get120Volt());

        System.out.println("---------------------------");

        SocketAdaptor socketAdaptorComposition  = new SocketAdaptorImplComposition();

        System.out.println(socketAdaptorComposition.get3Volt());
        System.out.println(socketAdaptorComposition.get12Volt());
        System.out.println(socketAdaptorComposition.get120Volt());

    }

    /**
     * Adaptor pattern used in Java are
     *  - Arrays#asList()
     *  - InputStreamReader (InputStream) >> Reader object
     *  - OutputStreamReader (OutputStream) >> Write Object
     */
}
