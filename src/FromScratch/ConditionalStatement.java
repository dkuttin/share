package FromScratch;

public class ConditionalStatement {
    public static void main (String args[]){
        System.out.println("hello world");
        for (int i = 1; i<=10;i++){
            System.out.println("for loop"+ i);
        }
        int j =1;
        while (j<=10){
            System.out.println("while loop" + j);
            if (j==5){
                break;
            }
            j++;
        }
        int k = 1;
        switch (k) {
            case 10:
                System.out.println("it is 10");
                break;
            case 20:
                System.out.println("it is 20");
                break;
            default:
                System.out.println("default value");
                break;
        }
    }
}
