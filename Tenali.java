public class Tenali {
    public static void main(String[] args) {
        Tenali story = new Tenali();
        // story.find_security(1024);
        // System.out.println("Flowers Story Task");
        // System.out.println("******* ***** ****");
        // story.find_flowers(7);
        story.print_1();
    }

    void print_1() {
        System.out.print(1+" ");
        System.out.print(1+" ");
        System.out.print(1+" ");
        System.out.print(1+" ");
        System.out.print(1+" ");
    }

    void find_flowers(int temples) {
        int flowers = 1;
        while (temples>0) {
            flowers = flowers *2;
            System.out.println("Flowers count"+ flowers);
            temples = temples-1;
            System.out.println("Temples count is :"+temples);
        }
        System.out.println("Total Flowers count is :"+ flowers);

    }

    void find_security(int beats) {
        int security = 0;
        while (beats>1) {
            System.out.println("Each security gets :"+(beats/2));
            beats = beats/2;
            security = security+1;
            
        }
        System.out.println("Total no of security :"+ security);

    }
}
