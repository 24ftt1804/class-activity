public class Week4 {

    public static void main(String[] args) {
    //  left associativity
    //  3+5
    //  right associativity
//int a=10;
//int b =20;
//int c = a+b; //a x b

        // * -multiply divide /
        //System.out.println((a%2));

        //int d = ++a + b; // 10+1=11 + 20 = 31
        //System.out.println(d); //31
        //System.out.println(a); //11
        //System.out.println(b); //20
        
        
        //int d = a++ + b; //a=10 + 20+30, a=a+1, a=10+1
        //System.out.println(d); //30
        //System.out.println(a); //11
        //System.out.println(b); //20

        //int c = 2;
        //int d = c++;
        //int e = c;
        //System.out.println(d);
        //system.out println(e);

        //int a = 3; 
        //System.out.println(--a); //3 = a=a-1, a=3-1=2
        //System.out.println(a--); //use current value, 2.. then print, next decrease by 1 a=a-1, a=2-1=1
        //System.out.println(a);   //1

        int a = 3, b = 7, c;
        c = a++ + --b; //a++ > a = a+1, a=3+1=4 COMPUTATION WISE a=3, b=b-1, b=7-1=6 c= 3+6 = 9
        System.out.println(a++); //atm a=4, a=a+1, a=4+1=5
        System.out.println(--b); //atm b = 7, 7-1= 6-1=5
        System.out.println(++c); //atm c=9, c=c+1 c=9+1=10
    
    
        

    }
}
    