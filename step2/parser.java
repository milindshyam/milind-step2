import org.antlr.v4.runtime.*;
import static java.lang.System.*;
import java.io.PrintWriter;
import java.io.File;

public class parser{
	public static void main(String[] args) throws Exception{
		Lexer l = new MicroLexer(new ANTLRFileStream(args[0]));		
		MicroParser p = new MicroParser(new CommonTokenStream(l));
		p.setErrorHandler(new ErrorStrategy());
		//try catch??
		if (parser.program()){
			System.out.println("Accepted");
		}
		else{
			System.out.println("Not Accepted");			
		}
	}
}
