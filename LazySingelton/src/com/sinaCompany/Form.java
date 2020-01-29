package com.sinaCompany;

public class Form {
    private static Form form;

    public synchronized  static Form getInstance(){
        if (form==null){
            form=new Form();
        }
        return form;
    }

    private Form() {
    }
    public void ShowForm(){
        System.out.println("name : ");
        System.out.println("family name :");
        System.out.println("your last job :");
        System.out.println("explain your work Experience : ");
    }
}
