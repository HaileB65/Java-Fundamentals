package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all relational operators below. These include:
 *
 * less than, less than or equal to, greater than, greater than or equal to, and equal to
 *
 */
class RelationalOperators {

    public static void main(String[] args) {


        int a = 3;
        int b = 8;
        int c = 18;
        int d = 12;
        int e = 22;
        int f = 22;

        System.out.println("a= " + a + "  b= " + b + "  c= " + c + "  d= " + d + "  e= " + e + "  f= " + f);

        if (a < b){
            System.out.println("a is less than b");
        }

        if (a <= b){
            System.out.println("a is less than or equal to b");
        }

        if (c > d){
            System.out.println("c is greater than d");
        }

        if (c >= d){
            System.out.println("c is greater than or equal to d");
        }

        if (e == f){
            System.out.println("e is equal to f");
        }







    }

}

