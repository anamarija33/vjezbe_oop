package pckg_vj5;

public class DS_Student extends Student{
    public DS_Student(String name) {
        this.name = name;
    }


    protected void completedStudy(int num) {
        if(num < 2){
            System.out.println("Student did not apply for the last year of the studies");
        }else{
            System.out.println(getClass().getCanonicalName() + " is on the last year of the study programme!");
            System.out.println("In this year student will complete study by finishing graduate? thesis...");
        }
    }

    @Override
    protected void infoStudent() {
        super.infoStudent();

    }
}
