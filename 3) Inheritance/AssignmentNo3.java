package Assignments;
import java.util.Scanner;
class employee {
    Scanner sc = new Scanner(System.in);
    String name, add, mail;
    float id,  basic;
    int mobile;

    void getData() {
        System.out.print("Enter the name of employee :");
        name = sc.nextLine();
        System.out.print("Employee ID : ");
        mail = sc.next();
        System.out.print("Employee address : ");
        add = sc.next();
        System.out.print("Employee mobile no : ");
        mobile = sc.nextInt();
    }
    void input(){
        System.out.print("Enter the basic pay: ");
        basic=sc.nextFloat();
    }

    void display() {
        System.out.println("\n*****************************");
        System.out.println("Employee name : "+name);
        System.out.println("Employee id : "+mail);
        System.out.println("Employee address : "+add);
        System.out.println("Employee mobile no : "+mobile);
    }
    void salary(){
        float da,hra,cf,pf,gross;
        da=basic*97/100;
        hra=basic*10/100;
        pf=basic*12/100;
        cf=basic*0.1f/100;
        gross=basic+da+hra-pf-cf;
        System.out.println("Basic salary of an employee :"+basic);
        System.out.println("Gross salary of an employee :"+gross);
    }
}
class Programmer extends employee{

}
class APM extends employee{

}
class TeamLead extends employee{

}
class ProjectManager extends employee{

}

public class AssignmentNo3 {
    public static void main(String[] args) {
        int choice;
        do{
            System.out.println("\n\t1)PROGRAMMER"+"\n\t2)ASSISTANT PROJECT MANAGER"+"\n\t3)TEAM LEADER"+"\n\t4)PROJECT MANAGER");
            Scanner c=new Scanner (System.in);
            System.out.print("Enter your choice: ");
            choice=c.nextInt();
            switch(choice){
                case 1:
                    Programmer p=new Programmer();
                    p.getData();
                    p.input();
                    p.display();
                    p.salary();
                    break;
                case 2:
                    APM a=new APM();
                    a.getData();
                    a.input();
                    a.display();
                    a.salary();
                    break;
                case 3:
                    TeamLead t=new TeamLead();
                    t.getData();
                    t.input();
                    t.display();
                    t.salary();
                    break;
                case 4:
                    ProjectManager s=new ProjectManager();
                    s.getData();
                    s.input();
                    s.display();
                    s.salary();
                    break;
            }
        }while(choice!=5);
    }
}





