class Array{

  static  void methodFirst(){
    int tempArray []= new int [2];
    System.out.println("hello");
    }
       public static void main(String arg[]){
       int arra[] =  {1,2,3,4,5,6,7};

       for(int i=0;i<2;i++){
           tempArray[i]=arra[i];

       }

       for(int i=0;i<2;i++){
         System.out.println(tempArray[i]);
       }
    methodFirst();
    }
}