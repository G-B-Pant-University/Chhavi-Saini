import java.util.Scanner;
public class java_program2 {
     static class Student{
        String name;
        String course;
        String gender;
        Student( String name, String course, String gender){
            this.name=name;
            this.course=course;
            this.gender=gender;
        }
    }
        static class room{
        int roomNo;
        Student s1, s2;
        room(int roomNo){
            this.roomNo=roomNo;
        }
        boolean allot(Student s){
            if(s1==null){
                s1=s;
                return true;
            }
            if(s2==null && s1.course.equals(s.course)&& s1.gender.equals(s.gender)){
                s2=s;
                return true;
            }
            return false;
        }
        void display(){
            System.out.println(roomNo);
            if(s1!=null){
                System.out.println(s1.course+" "+ s1.gender);

            }
            if(s2!=null){
                System.out.println(s2.course+" "+s2.gender);
            }
        }
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

        Student[] s = new Student[21];

        for (int i = 0; i < 21; i++) {
            System.out.println("Enter details of student " + (i + 1));

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Gender: ");
            String gender = sc.nextLine();

            System.out.print("Course: ");
            String course = sc.nextLine();
            Student st = new Student(name, course, gender);
            s[i]=st;
                        
        }
        room[] r = new room[10];
        for(int i=0; i<10; i++){
            r[i] = new room(i+1);
        }
        boolean[] alloted = new boolean[21];
        for(int i=0; i<21; i++){
            for(int j=0; j<10; j++){
                if(r[j].allot(s[i])){
                    alloted[i]=true;
                    break;
                }
            }
        } 
        System.out.println("Room Allotment: ");
        for(int i=0; i<10; i++){
            r[i].display();
        }
        System.out.println("Remaining Students: ");
        boolean found = false;
        for(int i = 0; i<21; i++){
            if(!alloted[i]){
                System.out.println(s[i].name + ""+s[i].gender+""+s[i].course);
                found = true;

            }
        }
        if(!found){
            System.out.println("No students remaining: ");
        }
        sc.close();
    

      
    
    }

}
  
    
     


    

   


