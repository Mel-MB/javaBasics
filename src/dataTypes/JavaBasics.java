package dataTypes;

import java.time.LocalDate;
import java.util.Date;
import java.lang.reflect.Field;


public class JavaBasics {
    /**
     * Java primitive data types
     */
    //Numbers
    // whole numbers

    // from -128 to 127 (size: 1 byte)
    static byte aByte = -128;
    // from -32,768 to 32,767 (size: 2 bytes)
    static short smallNumber = 1568;
    // from -2,147,483,648 to 2,147,483,647 (size: 4 bytes)
    static int number = 450;
    // from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 (size: 8 bytes)
    static long bigNumber = 72684349219889L;


    // Fractional numbers

    // from 6 to 7 decimal digits (size: 4 bytes)
    static float unpreciseDecimalNumber =  9.394572F;
    // up to 15 decimal digits (size: 8 bytes)
    static double decimalNumber = 100.011232847;

    static boolean bool = true; // or false 1 byte

    // Single character/letter or ASCII values (size: 2 bytes)
    static char a ='A';


    /**
     * Java reference type
     */
    static String text = "Hi Java";
    static Date date = new Date();
    static LocalDate nowDate = LocalDate.now();
    // Also works with any java or self created class



    public static void main(){
        StringBuilder result = new StringBuilder();
        String newLine = System.getProperty("line.separator");

        result.append( " Java data types {" );
        result.append(newLine);

        //determine fields declared in this class only (no fields of superclass)
        Field[] fields = JavaBasics.class.getFields();

        //print field names paired with their values
        for ( Field field : fields  ) {
            result.append("  ");
            try {
                result.append( field.getName() );
                result.append(": ");
                //requires access to private field:
                result.append( field.get(JavaBasics.class));
            } catch ( IllegalAccessException ex ) {
                System.out.println(ex);
            }
            result.append(newLine);
        }
        result.append("}");

        System.out.print(result);
    }



}
