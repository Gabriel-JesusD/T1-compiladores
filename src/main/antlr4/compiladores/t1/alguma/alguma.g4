lexer grammar alguma;

KeyWord: 'algoritmo' | 'declare' | 'literal' | 'inteiro' | 'real' | 'logico' | 'ou' | 'nao' | 'leia' | 'se' | 'fim_se' 
| 'senao' | 'entao' | 'falso' | 'verdadeiro' | 'caso' | 'e' | 'fim_caso' | 'escreva' | 'seja' | 'para' | 'ate' | 'faca' 
| 'fim_para' | 'enquanto' | 'fim_enquanto' | 'registro' | 'fim_registro' | 'tipo' | 'procedimento' 
| 'var' | 'fim_procedimento' | 'funcao' | 'fim_funcao' | 'retorne' | 'constante' | 'fim_algoritmo';
NUM_INT	: ('0'..'9')+;
NUM_REAL	: ('0'..'9')+ ('.' ('0'..'9')+)?;
Digito	:	'0'..'9';
IDENT	:	([a-zA-Z])([a-zA-Z]|Digito|'_')*;
Comentario  :  '{' (~('\n'|'\r'|'{'|'}'))* '}' '\r'? '\n'? {skip();};
Nao_Fechado  :  '{' (~('\n'|'\r'|'{'|'}'))* '\r'? '\n'?;
CADEIA 	: '"' ( ESC_SEQ | ~('"'|'\\'|'\n'|'\r') )* '"';
Literal_Nao_Fechada: '"' ( ESC_SEQ | ~('"'|'\\') )* '\r'? '\n'?;
fragment
ESC_SEQ	: '\\\'';
DP : ':' | '..';
AP : '(' | '[';
FP : ')' | ']';
Virg: ',';
WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {skip();}
    ;
OP_REL	:	'>' | '>=' | '<' | '<=' | '<>' | '=';
OP_ATRI : '<-';
OP_ACESSO: '.';
OP_ARIT	:	'+' | '-' | '*' | '/' | '%' | '^' | '&';
ERR : ~('a');