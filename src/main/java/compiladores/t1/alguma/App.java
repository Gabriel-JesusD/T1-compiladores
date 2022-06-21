package compiladores.t1.alguma;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import org.antlr.v4.parse.ANTLRParser.atom_return;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // try(PrintWriter p = new PrintWriter(new FileWriter(args[1]))) {//saida

        try(PrintWriter p = new PrintWriter(new FileWriter(args[1]))) {//saida
            CharStream c = CharStreams.fromFileName(args[0]);//entrada
            alguma lex = new alguma(c);

            Token t = null;
            while((t = lex.nextToken()).getType() != Token.EOF){
                String text = '\'' + t.getText() + '\'';
                String aType = alguma.VOCABULARY.getDisplayName(t.getType());
                // System.out.println("ON " + text + " we have " + aType);
                if(aType == "Nao_Fechado"){
                    p.println("Linha " + t.getLine() + ": " + "comentario nao fechado");
                    break;
                }
                else if(aType == "Literal_Nao_Fechada"){
                    p.println("Linha " + t.getLine() + ": " + "cadeia literal nao fechada");
                    break;
                }
                else if(aType == "ERR"){
                    p.println("Linha " + t.getLine() + ": " + t.getText() + " - simbolo nao identificado");
                    break;
                }
                else if(aType == "IDENT" || aType == "CADEIA" || aType == "NUM_INT" || aType == "NUM_REAL"){
                    p.println("<"+ text + "," + aType + ">");
                }
                else
                    p.println("<"+ text + "," + text + ">");
            }

        } catch (Exception e) {
            System.err.println(e.getMessage());
            //TODO: handle exception
        }
    }
}
