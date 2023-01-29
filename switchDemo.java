public class switchDemo {
    public static void main(String[] args) {
        char grade = 'A';

        switch (grade) {
            case 'A':
            System.out.println("Exellent : passed");
            break;
            case 'B':
            System.out.println("very good : passed");
            break;
            case 'C':
            System.out.println("Good : passed");
            break;
            case 'D':
            System.out.println("Not bad : passed");
            break;
            case 'F':
            System.out.println("Not passed");
            break;
            default:
            System.out.println("invalid");

        }
        }


}

