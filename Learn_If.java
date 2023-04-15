import javax.lang.model.util.ElementScanner6;

public class Learn_If {
    public static void main(String[] args) {
       Learn_If li = new Learn_If();
       li.find_highest_score(90,90);
    }

    void find_highest_score(int vk, int msd) {
        
    if (vk>msd) {
        System.out.println("viratkoli\t"+vk);
    }
    else if (msd>vk) {
        System.out.println("msdhoni\t"+msd);
    }
    else{
        System.out.println("vk and msd both are same :\t"+(vk+msd));
    }
    
    }
}
