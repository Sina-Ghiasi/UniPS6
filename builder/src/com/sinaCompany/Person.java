package com.sinaCompany;

public class Person {

        private String name;
        private String familyName;
        private int age;
        private String user;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public static class Builder {
            private String name;

            private String familyName;

            private String user;

            private int age;


        public Builder setname(String name){

            this.name = name;

            return this;  //By returning the builder each time, we can create a fluent interface.

        }

        public Builder setfamilyname(String familyName){

            this.familyName = familyName;

            return this;

        }

        public Builder setuser(String user){

            this.user = user;

            return this;

        }

        public Builder atRate(int age){

            this.age = age;

            return this;

        }

        public Person build(){
            //Here we create the actual bank account object, which is always in a fully initialised state when it's returned.

            Person temp = new Person();

            temp.name = this.name;

            temp.familyName = this.familyName;

            temp.user = this.user;

            temp.age = this.age;

            return temp;

        }

    }

    private Person() {
        //Constructor is now private.
    }
}