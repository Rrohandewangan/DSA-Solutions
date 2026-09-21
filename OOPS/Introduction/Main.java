public class Main {
    
    public static void main(String[] args) {
        // store 5 roll no
        int[] numbers = new int[5];

        String[] names = new String[5];

        Student[] students = new Student[5];

        Student rohan = new Student();

        rohan.rno = 13;
        rohan.name = "Rohan Dewangan";
        rohan.marks = 88.5f;

        System.out.println(rohan.rno);
        System.out.println(rohan.name);
        System.out.println(rohan.marks);


        Student one = new Student();
        Student two = one;

        one.name = "Something Something";

        System.out.println(two.name);
    }
}

 // create a class 
    // for every single student 
    class Student {
        int rno;
        String name;
        float marks;

        // we need a way to add the values of the above 
        // properties object by object 

        // we need one word to access every object 

        Student() {
            this.rno = 13;
            this.name = "Rohan Dewangan";
            this.marks = 90;

        }

    }
