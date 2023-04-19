public class Task18_Apr_2023 {
    public static void main(String[] args) {
        Task18_Apr_2023 taskes = new Task18_Apr_2023();
        // System.out.println("Task_1");
        // System.out.println("******");
        // taskes.task1();
        // System.out.println();
        // System.out.println("Task_2");
        // System.out.println("******");
        //taskes.task2();
        // System.out.println();
        // System.out.println("Task_3");
        // System.out.println("******");
        // taskes.task3();
        // System.out.println();
        // System.out.println("Task_4");
        // System.out.println("******");
        taskes.task4();
        // System.out.println();
        // taskes.task();
    }
    private void task() {
        int count = 1;
        while (count<=51) {
            System.out.println("Payilagam Tutorial Day :"+count);
            count = count+1;
            
        }
    }
    private void task4() {
        int count=1;
        while (count<1500) 
        {
            count = count*11;
            System.out.print(count+" ");
            // count = count*11;
        }
        
    }
    private void task3() {
        int count=0;
        while (count<15) {
            count=count+3;
            System.out.print(count+" ");   
        }
    }
    private void task2() {
        int count = 1;
        while (count<15) {
            System.out.print(count+" ");
            count= count+3;
        }
    }
    void task1() {
        int count=2;
        while (count<=10) {
        System.out.print(count+" ");
            count= count+2;
        }
    }

    
}
