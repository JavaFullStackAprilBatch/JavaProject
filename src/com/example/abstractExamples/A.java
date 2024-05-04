package com.example.abstractExamples;

public  class A extends AbstractExample{



    public String getDescription() {
        return "def";
    }


    public String getCategory() {
        return "efa";
    }



    protected void print()
    {
       // super.print();
        System.out.println(" Printing in B");
    }
}
