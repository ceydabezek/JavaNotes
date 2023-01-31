public class arrays {
    public static void main(String[] args) {
         String [] students = new String [4];
         students[0]="Jason";
         students[1]="Elen";
         students[2]="Tom";
         students[3]="Cristina";

         for (int i=0;i<students.length;i++){
            System.out.println(students[i]);
         }

         //ANOTHER WAY

         for (String student:students){
            System.out.println(student);

         }


}
}
