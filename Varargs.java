public class Varargs {
    static void names(String ...names){

        for (String name   : names) {
            System.out.println(name);



        }
    
        }
        public static void main(String[] args){
            names("jay","vishal" ,"piyush","chaitanya");
            names("ghoda","buffalo");


        
    }

}
