public class Fibona {
//Siva Program 
  public static void main(String[] args) {
  Fibona fp=new Fibona();
    // fp.square_root(100);
    // fp.Find_Fibo_Using_Third_Variable();
    // fp.Find_Fibo_Without_Using_Third_Variable();
    fp.find_primeno_in_Fibo();
}

private void find_primeno_in_Fibo() {
    int no1=2,no2=3;
    while (no1<=100) {
        boolean result = Primeno(no1);
        if (result==true) {
            System.out.println(no1+" is a Fibonacci Series Prime Number.");
        }
        no2=no1+no2;
        no1=no2-no1;
        
    }
}

private boolean Primeno(int no1) {
    int count=0,div=2;
    while (div<no1) {
        if (no1%div==0) {
            //System.out.println(div);
            count++;
        }
        div++;
    }
    if (count==0) {
        return true;
    } else {
        return false;
    }

}

private void Find_Fibo_Without_Using_Third_Variable() {
    int no1=0,no2=1;
    while (no1<=21) {
        System.out.println(no1);
        no2=no1+no2;
        no1=no2-no1;
        
    }
}

private void Find_Fibo_Using_Third_Variable() {
    int no1=0,no2=1;
    while (no1<=8) {
        System.out.println(no1+" ");
        int no3=no1+no2;
        no1=no2;
        no2=no3;
    }
}

private void square_root(int no) {
    int div=2;
    while(true)  //div and quotions is same for squareroot
    {
    if(no/div==div)
    {
      System.out.println(div);
      break;
    }
    div++;
    }
}

}