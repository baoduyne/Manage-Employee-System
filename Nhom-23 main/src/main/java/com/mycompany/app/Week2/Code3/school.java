import java.util.*;

abstract class jaj {
        public int a = 0;
        public String b="";

    public abstract void study();

}

class student extends jaj{

    public student(int num,String name){
        a = num; b = name;
    }
    public int id = 1;
    public void study(){
        System.out.println("Hii");
    }

}

class school{
    protected String name = "";
    public school (String n){
        name = n;
    }

        public void show(){
            System.out.println(name);
        }

        public void set(String name){
            this.name = name;
        }
    public static void main(String[] args) {
        school sc = new school("Phenikaa");
        Scanner obj = new Scanner(System.in);
    System.out.println("Type the school's name: ");
        String str = obj.nextLine();
    System.out.println("The school's name is: ");
        sc.set(str);
        sc.show();
    }
}


