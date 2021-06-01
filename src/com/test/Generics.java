package com.test;

public class Generics {
    public static void main(String[] args) {
        Info<String> i = new Info<>("Hello");
        System.out.println(i);
    }
}

class Info<T> { //здесь вместо T можно писать любую букву, слово. Т означает, что в дальнейшем будем использовать какой-то определенный тип, String, Integer и т.д.
    private T value;//здесь будет заменено на String value
    Info(T value){
        this.value=value;
    }//и здесь тоже на String value
    public String toString(){
        return "(( " + value + " ))";
    }
}
/*
OUTPUT:
(( Hello ))

*/
