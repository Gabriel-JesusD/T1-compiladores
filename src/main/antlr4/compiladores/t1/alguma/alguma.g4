lexer grammar alguma;
//Definida todas as palavras chave
KeyWord: 'algoritmo' | 'declare' | 'literal' | 'inteiro' | 'real' | 'logico' | 'ou' | 'nao' | 'leia' | 'se' | 'fim_se' 
| 'senao' | 'entao' | 'falso' | 'verdadeiro' | 'caso' | 'e' | 'fim_caso' | 'escreva' | 'seja' | 'para' | 'ate' | 'faca' 
| 'fim_para' | 'enquanto' | 'fim_enquanto' | 'registro' | 'fim_registro' | 'tipo' | 'procedimento' 
| 'var' | 'fim_procedimento' | 'funcao' | 'fim_funcao' | 'retorne' | 'constante' | 'fim_algoritmo';
NUM_INT	: ('0'..'9')+; // Definição de numeros inteiros, qualquer combinação que tenha pelo menos um
NUM_REAL	: ('0'..'9')+ ('.' ('0'..'9')+)?; //Definição de numeros reais, que devem possuir um ponto e outra sequencia de numero após
Digito	:	'0'..'9'; //Definição de um digito, que pode vir a estar combinado em um nome de variavel
IDENT	:	([a-zA-Z])([a-zA-Z]|Digito|'_')*; //O identificador é uma sequência de caracteres começada em letra
//que aceita letras digitos e _

//Ignora comentario, sendo esse qualquer sequencia de caracteres em uma linha dentro de {}
Comentario  :  '{' (~('\n'|'\r'|'{'|'}'))* '}' '\r'? '\n'? {skip();}; 
//Para comentarios nao fechados é verificado se ocorre uma abertura de parenteses sem fecha na mesma linha
Nao_Fechado  :  '{' (~('\n'|'\r'|'{'|'}'))* '\r'? '\n'?;
//Uma Cadeia é uma sequencia de caracteres que estejam dentro de ""
CADEIA 	: '"' ( ESC_SEQ | ~('"'|'\\'|'\n'|'\r') )* '"';
//A mesma logica do comentario utilizada para cadeias nao fechadas
Literal_Nao_Fechada: '"' ( ESC_SEQ | ~('"'|'\\') )* '\r'? '\n'?;
fragment
ESC_SEQ	: '\\\'';
//Dois pontos
DP : ':' | '..';
//Abre parenteses
AP : '(' | '[';
//Fecha Parenteses
FP : ')' | ']';
//Virgula
Virg: ',';
//White Space
WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {skip();}
    ;
//Operador relacional
OP_REL	:	'>' | '>=' | '<' | '<=' | '<>' | '=';
//Operador Atribuição
OP_ATRI : '<-';
//Operador Acesso
OP_ACESSO: '.';
//Operador Aritmetico
OP_ARIT	:	'+' | '-' | '*' | '/' | '%' | '^' | '&';
//Para erro qualquer outro caracter que não for achado até agora, vai ser um erro
ERR : ~('a');