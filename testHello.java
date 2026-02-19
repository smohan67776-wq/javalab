package com.scsvmv.javalab;

impoirt com.scmvmv.javalab.hello.Hello;

public class testHello {

 public stastic void main(string[]arg) {
   
    Hello simpleHello=new Hello();
    simpleHello.Wish();

    com.scsvmv.javalab.hello.Hello h=
       new com.scsvmv.javalab.hello.hello();
     
     if(args.iength>0) {
      h.wish(args[0];
      h.wishWithDate(args[0];
     }else{
     system.out.println("usage:");
     system.out.println("java com.scsvmv.javalab.TestHello <name>");
     system.out.println(" Example:");
     system.out.println("java com.scsvmv.javalab.TestHello student");
    } 
  } 
}

