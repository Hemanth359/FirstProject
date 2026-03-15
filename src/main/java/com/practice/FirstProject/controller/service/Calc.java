package com.practice.FirstProject.controller.service;

public interface Calc
{
    void add(int n1, int n2);
    //public abstract add(int n1, int n2);
    int mul();
    //public abstract int mul();
    default void disp()
    {
        System.out.println("disp of calc");
     //   telusko();
    }
    static void alien()
    {
        System.out.println("alien of calc");
    }
    private void telusko()
    {
        System.out.println("private ");
    }
    
    private String telusko1()
    {
        System.out.println("private ");
        return "hello";
    }
}