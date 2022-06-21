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
            alguma lex = new alguma(c); //passa o charstream lido do arquivo para o "compilador" identificar o token

            Token t = null;
            while((t = lex.nextToken()).getType() != Token.EOF){ //pega o proximo token enquanto não encontrar o fim do arquivo
                String text = '\'' + t.getText() + '\''; //converte o texto do token lido para o formato entre ''
                String aType = alguma.VOCABULARY.getDisplayName(t.getType()); // Converte o tipo desse token para string
                
                if(aType == "Nao_Fechado"){ //Caso seja comentario nao fechado
                    p.println("Linha " + t.getLine() + ": " + "comentario nao fechado");
                    break;
                }
                else if(aType == "Literal_Nao_Fechada"){ //Caso seja literal "" nao fechado
                    p.println("Linha " + t.getLine() + ": " + "cadeia literal nao fechada");
                    break;
                }
                else if(aType == "ERR"){ //Em caso de Simbolo nao identificado
                    p.println("Linha " + t.getLine() + ": " + t.getText() + " - simbolo nao identificado");
                    break;
                }
                else if(aType == "IDENT" || aType == "CADEIA" || aType == "NUM_INT" || aType == "NUM_REAL"){
                    // caso de tokens/ tipos definidos
                    p.println("<"+ text + "," + aType + ">");
                }
                else //caso geral de palavras reservadas, cujo nome do token é o mesmo que a string lida
                    p.println("<"+ text + "," + text + ">");
            }

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
