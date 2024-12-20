public class Functions {
    static void fun() {
        System.out.println(1);
        fun();
    }
    static int x=0;
     static void siva(){
        if(x==5)
        return;
        System.out.println(x);
        x++;
        siva();
    }
    static int i=0;
    static void name(){
        if(i==5)
        return;
        System.out.println("SIVA RAMI REDDY");
        i++;
        name();
    }
    static int n=10;
    static void linear1ton(){
        if(i==n)
        return;
        System.out.print(i+" ");
        i++;
        linear1ton();
    }
    static void linear_nto1(){
        if(n<i)
        return;
        System.out.print(n+" ");
        n--;
        linear_nto1();

    }
    static void printing_numbers(int s,int m){
       if(s>m)
       return;
       System.out.println("Recursion");
       printing_numbers(s+1, m);
    }
    static void print1ton(int i,int m){
        if(i>m)
        return;
        System.out.println(i);
        print1ton(i+1, m);
    }
    static void printnto1(int k,int m){
        if(k<1)
        return;
        System.out.println(m);
        printnto1(m--,m);
    }
    static void print1tonback(int i,int m){
        if(i<1)
        return;
        print1tonback(i-1,m);
        System.out.println(i);
    }
    static void printnto1back(int i,int m){
        if(m==i)
        return;
        printnto1back(i+1, m);
        System.out.println(i);
    }
    static void sum(int m,int add){
        if(m<1){
        System.out.println("Sum of m numbers is :"+add);
        return;
        }
        sum(m-1,add+m);
    }
    static int sumn(int m) {
        if (m == 0)
            return 0;
        else
            return m + sumn(m - 1);
    }
    static int fact(int m){
        if(m==0)
            return 1;
        else 
           return m * fact(m-1);

    }
    static void reverse(int a[],int l,int r){
       if(l>=r)
       return;
       else{
        swap(a,l,r);
        reverse(a, l+1, r-1);
       }
}
static void swap(int a[],int l,int r){
int temp=a[l];
a[l]=a[r];
a[r]=temp;
}
  static void swap1(int a[],int i,int j){
    int temp=a[i];
    a[i]=a[j];
    a[j]=temp;
  }
  static void reverse1(int[] a, int i, int n) {
    if (i >= n / 2)
        return;
    else {
        swap1(a, i, n - i - 1);
        reverse1(a, i + 1, n);
    }
}
    static boolean palindrome(String s,int i,int n){
        if(i >=n/2) return true;
        if(s.charAt(i) != s.charAt(n-i-1))
        return false;
        else 
        return palindrome(s,i+1,n);
    }
    static int fibonacci(int n){
     if(n <= 1){
        return 1;
     }
     return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        //fun();
        //siva();
        //name();
        //linear1ton();
        //linear_nto1();
        //int m=5;
        //printing_numbers(1,m);
        //print1ton(1,m);
        //printnto1(m,m);
        //print1tonback(m,m);
        //printnto1back(1,m);
        //sum(m,0);
        //sumn(m);
        //System.out.println("Sum of first " + m + " natural numbers is: " + sumn(m));
        //fact(m);
        //System.out.println("Factorial of m is: " +fact(m));
        //int a[]={1,2,3,4,5};
        /*reverse(a,0,a.length-1);
        for (int i : a) {
        System.out.print(i + " ");
       }*/
       /*int[] a = {1, 2, 3, 4, 5};
       int n = a.length;
       reverse1(a, 0, n);
       for (int i = 0; i < n; i++) {
           System.out.print(a[i] + " ");
       }*/
      /*String s="VinniV";
      int n=s.length();
      boolean result = palindrome(s, 0, n);
      System.out.println(result +" "+"The given Strong is :"+s);*/
      int fibonacci =fibonacci(4);
      System.out.println(fibonacci);
}
}
