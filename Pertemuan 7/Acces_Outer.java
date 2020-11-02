package com.pboreg;

    class OuterClass_{
        int x = 10;

        class InnerClass{
            public int myInnerMethod() {
                return x;
            }
        }
    }

    public class Acces_Outer{
        public static void main(String[] args) {
            OuterClass_ myOuter = new OuterClass_();
            OuterClass_.InnerClass myInner = myOuter.new InnerClass();
            System.out.println(myInner.myInnerMethod());
        }
    }

