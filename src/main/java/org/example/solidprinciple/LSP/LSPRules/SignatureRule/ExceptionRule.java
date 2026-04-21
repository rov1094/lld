package org.example.solidprinciple.LSP.LSPRules.SignatureRule;

// Exception Rule:
// A subclass should throw fewer or narrower exceptions 
// (but not additional or broader exceptions) than the ParentC.
// Java enforces this only for checked Exceptions.

/* 
└── java.lang.Exception                        // Conditions your application might want to catch
    ├── java.io.IOException                    // Checked I/O failures
    │   ├── java.io.FileNotFoundException
    │   ├── java.io.EOFException
    │   └── java.net.MalformedURLException
    ├── java.lang.ClassNotFoundException       // Checked reflect/… failures
    ├── java.lang.InterruptedException         // Checked thread interruption
    ├── java.sql.SQLException                  // Checked SQL/database errors
    ├── java.text.ParseException               // Checked parsing errors
    └── java.lang.RuntimeException             // Unchecked; subclasses may be thrown anywhere
        ├── java.lang.ArithmeticException      // e.g. divide by zero
        ├── java.lang.NullPointerException
        ├── java.lang.ArrayIndexOutOfBoundsException
        ├── java.lang.StringIndexOutOfBoundsException
        ├── java.lang.IllegalArgumentException
        │    └── java.lang.NumberFormatException
        ├── java.lang.IllegalStateException
        ├── java.lang.UnsupportedOperationException
        └── java.lang.IndexOutOfBoundsException // ParentC of the two “…OutOfBounds” above
*/

class ParentC {
    public void getValue() throws RuntimeException {
        throw new RuntimeException("ParentC error");
    }
}

// Subclass overrides getValue and throws the narrower ChildCException
class ChildC extends ParentC {
    @Override
    public void getValue() throws ArithmeticException {
        throw new ArithmeticException("ChildC error");
        //throw new Exception("ChildC error"); // This is wrong & not allowed
    }
}

// ClientC that invokes getValue and catches the ParentC exception type
class ClientC {
    private ParentC p;

    public ClientC(ParentC p) {
        this.p = p;
    }

    public void takeValue() {
        try {
            p.getValue();
        } catch (RuntimeException e) {
            System.out.println("RuntimeException occurred: " + e.getMessage());
        }
    }
}

public class ExceptionRule {
    public static void main(String[] args) {
        ParentC ParentC = new ParentC();
        ChildC ChildC   = new ChildC();

        ClientC ClientC = new ClientC(ParentC);
        ClientC ClientC1 = new ClientC(ChildC);

        ClientC.takeValue();
        ClientC1.takeValue();
    }
}