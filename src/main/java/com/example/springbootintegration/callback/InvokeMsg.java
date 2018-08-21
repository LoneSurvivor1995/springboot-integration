package com.example.springbootintegration.callback;

public class InvokeMsg {

    void invoke(String name ,CallbackMsg callbackMsg){
        System.out.println(name + callbackMsg.before());

        callbackMsg.after();
    }

    public static void main(String[] args) {
        new InvokeMsg().invoke("meihao ", new CallbackMsg() {
            @Override
            public String before() {
                return "before";
            }

            @Override
            public String after() {
                System.out.println("this is after");
                return null;
            }
        });
    }
}
