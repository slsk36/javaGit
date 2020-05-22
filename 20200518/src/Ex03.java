interface Printablee {
    void printLine(String str);
}

class SimplePrinter implements Printablee { 
    public void printLine(String str) {
        System.out.println(str);
    }
}

class MultiPrinter extends SimplePrinter {
    public void printLine(String str) {
        super.printLine("start of multi...");        
        super.printLine(str);
        super.printLine("end of multi");
    }
}

public class Ex03 {
    Ex03(){
        Printablee prn1 = new SimplePrinter();
        Printablee prn2 = new MultiPrinter();
        
        if(prn1 instanceof Printablee)
            prn1.printLine("This is a simple printer.");

        System.out.println();

        if(prn2 instanceof Printablee)
            prn2.printLine("This is a multiful printer.");
    }
        public static void main(String[] args) {
        	new Ex03();
    }
}