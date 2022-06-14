public class LogicalOpTable_22_04 {
    public static void main(String args[]){
        boolean p,q;
        String a="P", b="Q", c="AND", d="OR", e="XOR", f="NOT";

        System.out.printf("%-8s%-8s%-8s%-8s%-8s%-8s%n", a, b, c, d, e, f);

        p = true; q = true;
        System.out.println(p+"\t"+q+"\t"+(p&q)+"\t"+(p|q)+"\t"+(p^q)+"\t"+!p);

        p = true; q = false;
        System.out.println(p+"\t"+q+"\t"+(p&q)+"\t"+(p|q)+"\t"+(p^q)+"\t"+!p);

        p = false; q = false;
        System.out.println(p+"\t"+q+"\t"+(p&q)+"\t"+(p|q)+"\t"+(p^q)+"\t"+!p);

        p = false; q = true;
        System.out.println(p+"\t"+q+"\t"+(p&q)+"\t"+(p|q)+"\t"+(p^q)+"\t"+!p);

    }
}
