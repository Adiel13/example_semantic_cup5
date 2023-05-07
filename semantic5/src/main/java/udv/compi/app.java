package udv.compi;

import java.io.StringReader;

/**
 * Hello world!
 *
 */
public class app 
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "Hello World Semantic 5!" );
        String entrada = "2,a,5,7,c,5,d,2";
        Scanner lex = new Scanner(new StringReader(entrada));
        Parser sintax = new Parser(lex);
        
        sintax.parse();
        
    }
}
