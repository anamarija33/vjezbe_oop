package pckg_vj5;

public class PDS_Student extends Student{
    public PDS_Student(String name) {
        this.name = name;
    }

    protected void completedStudy(int num) {
        if(num < 3){
            System.out.println("Student did not apply for the last year of the studies");
        }else{
            System.out.println("In this year student will complete study by finishing bachelor thesis...");
        }
    }

    @Override
    protected void infoStudent() {
        super.infoStudent();

    }
}
