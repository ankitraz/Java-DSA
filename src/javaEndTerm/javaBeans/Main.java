package javaEndTerm.javaBeans;

import java.io.Serializable;

class employee implements Serializable {
    private int id;
    private String name;

    public void setName(String name){
        this.name = name;
    }

    public void setID(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

}



public class Main {
    public static void main(String[] args) {
        employee e1 = new employee();
        e1.setID(1);
        e1.setName("Ankit");
        System.out.println(e1.getId());
        System.out.println(e1.getName());
    }
}
