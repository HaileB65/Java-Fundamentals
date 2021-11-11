package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {


        boolean a = true, b = true;

        boolean c = false;
        boolean d = true;

        System.out.println("a= " + a + "  b= " + b + "  c= " + c + "  d= " + d);

        if (a & b){
            System.out.println("a and b are true");
        }

        if (a && b){
            System.out.println("a and b are true");
        }

        if (a | c){
            System.out.println("a or c is true");
        }

        if (a || c){
            System.out.println("a or c is true");
        }

        if (a ^ c){  // ^ is the "XOR" operator
            System.out.println("only a or c is true");
        }

        if (c != d){  // ! is the "NOT" operator
            System.out.println("c is not equal to d");
        }



    }

}

