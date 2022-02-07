package Activity08;

public class Activity08 {
    public static void main(String[] a){
        try {
            Activity08.exceptionTest("Will print to console");
            Activity08.exceptionTest(null); // Exception is thrown here
            Activity08.exceptionTest("Won't execute");
        } catch(CustomException mae) {
            System.out.println("Inside catch block: " + mae.getMessage());
        }
    }

    static void exceptionTest(String str) throws CustomException {
        if(str == null) {
            throw new CustomException("String value is null");
        } else {
            System.out.println(str);
        }
    }
}
