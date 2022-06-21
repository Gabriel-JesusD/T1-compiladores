// Generated from d:\7thSemester\Compiladores\Codigo\T1\alguma-lexico\src\main\antlr4\compiladores\t1\alguma\alguma.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class alguma extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		KeyWord=1, NUM_INT=2, NUM_REAL=3, Digito=4, IDENT=5, Comentario=6, Nao_Fechado=7, 
		CADEIA=8, Literal_Nao_Fechada=9, DP=10, AP=11, FP=12, Virg=13, WS=14, 
		OP_REL=15, OP_ATRI=16, OP_ACESSO=17, OP_ARIT=18, ERR=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"KeyWord", "NUM_INT", "NUM_REAL", "Digito", "IDENT", "Comentario", "Nao_Fechado", 
			"CADEIA", "Literal_Nao_Fechada", "ESC_SEQ", "DP", "AP", "FP", "Virg", 
			"WS", "OP_REL", "OP_ATRI", "OP_ACESSO", "OP_ARIT", "ERR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "','", null, null, "'<-'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "KeyWord", "NUM_INT", "NUM_REAL", "Digito", "IDENT", "Comentario", 
			"Nao_Fechado", "CADEIA", "Literal_Nao_Fechada", "DP", "AP", "FP", "Virg", 
			"WS", "OP_REL", "OP_ATRI", "OP_ACESSO", "OP_ARIT", "ERR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public alguma(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "alguma.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 5:
			Comentario_action((RuleContext)_localctx, actionIndex);
			break;
		case 14:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void Comentario_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u0199\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u0121\n\2\3\3\6\3\u0124\n\3\r"+
		"\3\16\3\u0125\3\4\6\4\u0129\n\4\r\4\16\4\u012a\3\4\3\4\6\4\u012f\n\4\r"+
		"\4\16\4\u0130\5\4\u0133\n\4\3\5\3\5\3\6\3\6\3\6\3\6\7\6\u013b\n\6\f\6"+
		"\16\6\u013e\13\6\3\7\3\7\7\7\u0142\n\7\f\7\16\7\u0145\13\7\3\7\3\7\5\7"+
		"\u0149\n\7\3\7\5\7\u014c\n\7\3\7\3\7\3\b\3\b\7\b\u0152\n\b\f\b\16\b\u0155"+
		"\13\b\3\b\5\b\u0158\n\b\3\b\5\b\u015b\n\b\3\t\3\t\3\t\7\t\u0160\n\t\f"+
		"\t\16\t\u0163\13\t\3\t\3\t\3\n\3\n\3\n\7\n\u016a\n\n\f\n\16\n\u016d\13"+
		"\n\3\n\5\n\u0170\n\n\3\n\5\n\u0173\n\n\3\13\3\13\3\13\3\f\3\f\3\f\5\f"+
		"\u017b\n\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\5\21\u018f\n\21\3\22\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\2\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\2\27\f\31\r\33\16\35\17\37\20!\21#\22%\23\'\24)\25\3\2\13\4\2C\\c|\6"+
		"\2\f\f\17\17}}\177\177\6\2\f\f\17\17$$^^\4\2$$^^\4\2**]]\4\2++__\5\2\13"+
		"\f\17\17\"\"\7\2\'(,-//\61\61``\3\2cc\2\u01d4\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\3\u0120\3\2\2\2\5\u0123\3\2\2\2\7\u0128\3\2\2\2\t\u0134\3\2\2\2\13"+
		"\u0136\3\2\2\2\r\u013f\3\2\2\2\17\u014f\3\2\2\2\21\u015c\3\2\2\2\23\u0166"+
		"\3\2\2\2\25\u0174\3\2\2\2\27\u017a\3\2\2\2\31\u017c\3\2\2\2\33\u017e\3"+
		"\2\2\2\35\u0180\3\2\2\2\37\u0182\3\2\2\2!\u018e\3\2\2\2#\u0190\3\2\2\2"+
		"%\u0193\3\2\2\2\'\u0195\3\2\2\2)\u0197\3\2\2\2+,\7c\2\2,-\7n\2\2-.\7i"+
		"\2\2./\7q\2\2/\60\7t\2\2\60\61\7k\2\2\61\62\7v\2\2\62\63\7o\2\2\63\u0121"+
		"\7q\2\2\64\65\7f\2\2\65\66\7g\2\2\66\67\7e\2\2\678\7n\2\289\7c\2\29:\7"+
		"t\2\2:\u0121\7g\2\2;<\7n\2\2<=\7k\2\2=>\7v\2\2>?\7g\2\2?@\7t\2\2@A\7c"+
		"\2\2A\u0121\7n\2\2BC\7k\2\2CD\7p\2\2DE\7v\2\2EF\7g\2\2FG\7k\2\2GH\7t\2"+
		"\2H\u0121\7q\2\2IJ\7t\2\2JK\7g\2\2KL\7c\2\2L\u0121\7n\2\2MN\7n\2\2NO\7"+
		"q\2\2OP\7i\2\2PQ\7k\2\2QR\7e\2\2R\u0121\7q\2\2ST\7q\2\2T\u0121\7w\2\2"+
		"UV\7p\2\2VW\7c\2\2W\u0121\7q\2\2XY\7n\2\2YZ\7g\2\2Z[\7k\2\2[\u0121\7c"+
		"\2\2\\]\7u\2\2]\u0121\7g\2\2^_\7h\2\2_`\7k\2\2`a\7o\2\2ab\7a\2\2bc\7u"+
		"\2\2c\u0121\7g\2\2de\7u\2\2ef\7g\2\2fg\7p\2\2gh\7c\2\2h\u0121\7q\2\2i"+
		"j\7g\2\2jk\7p\2\2kl\7v\2\2lm\7c\2\2m\u0121\7q\2\2no\7h\2\2op\7c\2\2pq"+
		"\7n\2\2qr\7u\2\2r\u0121\7q\2\2st\7x\2\2tu\7g\2\2uv\7t\2\2vw\7f\2\2wx\7"+
		"c\2\2xy\7f\2\2yz\7g\2\2z{\7k\2\2{|\7t\2\2|\u0121\7q\2\2}~\7e\2\2~\177"+
		"\7c\2\2\177\u0080\7u\2\2\u0080\u0121\7q\2\2\u0081\u0121\7g\2\2\u0082\u0083"+
		"\7h\2\2\u0083\u0084\7k\2\2\u0084\u0085\7o\2\2\u0085\u0086\7a\2\2\u0086"+
		"\u0087\7e\2\2\u0087\u0088\7c\2\2\u0088\u0089\7u\2\2\u0089\u0121\7q\2\2"+
		"\u008a\u008b\7g\2\2\u008b\u008c\7u\2\2\u008c\u008d\7e\2\2\u008d\u008e"+
		"\7t\2\2\u008e\u008f\7g\2\2\u008f\u0090\7x\2\2\u0090\u0121\7c\2\2\u0091"+
		"\u0092\7u\2\2\u0092\u0093\7g\2\2\u0093\u0094\7l\2\2\u0094\u0121\7c\2\2"+
		"\u0095\u0096\7r\2\2\u0096\u0097\7c\2\2\u0097\u0098\7t\2\2\u0098\u0121"+
		"\7c\2\2\u0099\u009a\7c\2\2\u009a\u009b\7v\2\2\u009b\u0121\7g\2\2\u009c"+
		"\u009d\7h\2\2\u009d\u009e\7c\2\2\u009e\u009f\7e\2\2\u009f\u0121\7c\2\2"+
		"\u00a0\u00a1\7h\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3\7o\2\2\u00a3\u00a4"+
		"\7a\2\2\u00a4\u00a5\7r\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7t\2\2\u00a7"+
		"\u0121\7c\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa\7p\2\2\u00aa\u00ab\7s\2\2"+
		"\u00ab\u00ac\7w\2\2\u00ac\u00ad\7c\2\2\u00ad\u00ae\7p\2\2\u00ae\u00af"+
		"\7v\2\2\u00af\u0121\7q\2\2\u00b0\u00b1\7h\2\2\u00b1\u00b2\7k\2\2\u00b2"+
		"\u00b3\7o\2\2\u00b3\u00b4\7a\2\2\u00b4\u00b5\7g\2\2\u00b5\u00b6\7p\2\2"+
		"\u00b6\u00b7\7s\2\2\u00b7\u00b8\7w\2\2\u00b8\u00b9\7c\2\2\u00b9\u00ba"+
		"\7p\2\2\u00ba\u00bb\7v\2\2\u00bb\u0121\7q\2\2\u00bc\u00bd\7t\2\2\u00bd"+
		"\u00be\7g\2\2\u00be\u00bf\7i\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c1\7u\2\2"+
		"\u00c1\u00c2\7v\2\2\u00c2\u00c3\7t\2\2\u00c3\u0121\7q\2\2\u00c4\u00c5"+
		"\7h\2\2\u00c5\u00c6\7k\2\2\u00c6\u00c7\7o\2\2\u00c7\u00c8\7a\2\2\u00c8"+
		"\u00c9\7t\2\2\u00c9\u00ca\7g\2\2\u00ca\u00cb\7i\2\2\u00cb\u00cc\7k\2\2"+
		"\u00cc\u00cd\7u\2\2\u00cd\u00ce\7v\2\2\u00ce\u00cf\7t\2\2\u00cf\u0121"+
		"\7q\2\2\u00d0\u00d1\7v\2\2\u00d1\u00d2\7k\2\2\u00d2\u00d3\7r\2\2\u00d3"+
		"\u0121\7q\2\2\u00d4\u00d5\7r\2\2\u00d5\u00d6\7t\2\2\u00d6\u00d7\7q\2\2"+
		"\u00d7\u00d8\7e\2\2\u00d8\u00d9\7g\2\2\u00d9\u00da\7f\2\2\u00da\u00db"+
		"\7k\2\2\u00db\u00dc\7o\2\2\u00dc\u00dd\7g\2\2\u00dd\u00de\7p\2\2\u00de"+
		"\u00df\7v\2\2\u00df\u0121\7q\2\2\u00e0\u00e1\7x\2\2\u00e1\u00e2\7c\2\2"+
		"\u00e2\u0121\7t\2\2\u00e3\u00e4\7h\2\2\u00e4\u00e5\7k\2\2\u00e5\u00e6"+
		"\7o\2\2\u00e6\u00e7\7a\2\2\u00e7\u00e8\7r\2\2\u00e8\u00e9\7t\2\2\u00e9"+
		"\u00ea\7q\2\2\u00ea\u00eb\7e\2\2\u00eb\u00ec\7g\2\2\u00ec\u00ed\7f\2\2"+
		"\u00ed\u00ee\7k\2\2\u00ee\u00ef\7o\2\2\u00ef\u00f0\7g\2\2\u00f0\u00f1"+
		"\7p\2\2\u00f1\u00f2\7v\2\2\u00f2\u0121\7q\2\2\u00f3\u00f4\7h\2\2\u00f4"+
		"\u00f5\7w\2\2\u00f5\u00f6\7p\2\2\u00f6\u00f7\7e\2\2\u00f7\u00f8\7c\2\2"+
		"\u00f8\u0121\7q\2\2\u00f9\u00fa\7h\2\2\u00fa\u00fb\7k\2\2\u00fb\u00fc"+
		"\7o\2\2\u00fc\u00fd\7a\2\2\u00fd\u00fe\7h\2\2\u00fe\u00ff\7w\2\2\u00ff"+
		"\u0100\7p\2\2\u0100\u0101\7e\2\2\u0101\u0102\7c\2\2\u0102\u0121\7q\2\2"+
		"\u0103\u0104\7t\2\2\u0104\u0105\7g\2\2\u0105\u0106\7v\2\2\u0106\u0107"+
		"\7q\2\2\u0107\u0108\7t\2\2\u0108\u0109\7p\2\2\u0109\u0121\7g\2\2\u010a"+
		"\u010b\7e\2\2\u010b\u010c\7q\2\2\u010c\u010d\7p\2\2\u010d\u010e\7u\2\2"+
		"\u010e\u010f\7v\2\2\u010f\u0110\7c\2\2\u0110\u0111\7p\2\2\u0111\u0112"+
		"\7v\2\2\u0112\u0121\7g\2\2\u0113\u0114\7h\2\2\u0114\u0115\7k\2\2\u0115"+
		"\u0116\7o\2\2\u0116\u0117\7a\2\2\u0117\u0118\7c\2\2\u0118\u0119\7n\2\2"+
		"\u0119\u011a\7i\2\2\u011a\u011b\7q\2\2\u011b\u011c\7t\2\2\u011c\u011d"+
		"\7k\2\2\u011d\u011e\7v\2\2\u011e\u011f\7o\2\2\u011f\u0121\7q\2\2\u0120"+
		"+\3\2\2\2\u0120\64\3\2\2\2\u0120;\3\2\2\2\u0120B\3\2\2\2\u0120I\3\2\2"+
		"\2\u0120M\3\2\2\2\u0120S\3\2\2\2\u0120U\3\2\2\2\u0120X\3\2\2\2\u0120\\"+
		"\3\2\2\2\u0120^\3\2\2\2\u0120d\3\2\2\2\u0120i\3\2\2\2\u0120n\3\2\2\2\u0120"+
		"s\3\2\2\2\u0120}\3\2\2\2\u0120\u0081\3\2\2\2\u0120\u0082\3\2\2\2\u0120"+
		"\u008a\3\2\2\2\u0120\u0091\3\2\2\2\u0120\u0095\3\2\2\2\u0120\u0099\3\2"+
		"\2\2\u0120\u009c\3\2\2\2\u0120\u00a0\3\2\2\2\u0120\u00a8\3\2\2\2\u0120"+
		"\u00b0\3\2\2\2\u0120\u00bc\3\2\2\2\u0120\u00c4\3\2\2\2\u0120\u00d0\3\2"+
		"\2\2\u0120\u00d4\3\2\2\2\u0120\u00e0\3\2\2\2\u0120\u00e3\3\2\2\2\u0120"+
		"\u00f3\3\2\2\2\u0120\u00f9\3\2\2\2\u0120\u0103\3\2\2\2\u0120\u010a\3\2"+
		"\2\2\u0120\u0113\3\2\2\2\u0121\4\3\2\2\2\u0122\u0124\4\62;\2\u0123\u0122"+
		"\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126"+
		"\6\3\2\2\2\u0127\u0129\4\62;\2\u0128\u0127\3\2\2\2\u0129\u012a\3\2\2\2"+
		"\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u0132\3\2\2\2\u012c\u012e"+
		"\7\60\2\2\u012d\u012f\4\62;\2\u012e\u012d\3\2\2\2\u012f\u0130\3\2\2\2"+
		"\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0133\3\2\2\2\u0132\u012c"+
		"\3\2\2\2\u0132\u0133\3\2\2\2\u0133\b\3\2\2\2\u0134\u0135\4\62;\2\u0135"+
		"\n\3\2\2\2\u0136\u013c\t\2\2\2\u0137\u013b\t\2\2\2\u0138\u013b\5\t\5\2"+
		"\u0139\u013b\7a\2\2\u013a\u0137\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u0139"+
		"\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d"+
		"\f\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0143\7}\2\2\u0140\u0142\n\3\2\2"+
		"\u0141\u0140\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144"+
		"\3\2\2\2\u0144\u0146\3\2\2\2\u0145\u0143\3\2\2\2\u0146\u0148\7\177\2\2"+
		"\u0147\u0149\7\17\2\2\u0148\u0147\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014b"+
		"\3\2\2\2\u014a\u014c\7\f\2\2\u014b\u014a\3\2\2\2\u014b\u014c\3\2\2\2\u014c"+
		"\u014d\3\2\2\2\u014d\u014e\b\7\2\2\u014e\16\3\2\2\2\u014f\u0153\7}\2\2"+
		"\u0150\u0152\n\3\2\2\u0151\u0150\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151"+
		"\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0156"+
		"\u0158\7\17\2\2\u0157\u0156\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015a\3"+
		"\2\2\2\u0159\u015b\7\f\2\2\u015a\u0159\3\2\2\2\u015a\u015b\3\2\2\2\u015b"+
		"\20\3\2\2\2\u015c\u0161\7$\2\2\u015d\u0160\5\25\13\2\u015e\u0160\n\4\2"+
		"\2\u015f\u015d\3\2\2\2\u015f\u015e\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f"+
		"\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0164\3\2\2\2\u0163\u0161\3\2\2\2\u0164"+
		"\u0165\7$\2\2\u0165\22\3\2\2\2\u0166\u016b\7$\2\2\u0167\u016a\5\25\13"+
		"\2\u0168\u016a\n\5\2\2\u0169\u0167\3\2\2\2\u0169\u0168\3\2\2\2\u016a\u016d"+
		"\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016f\3\2\2\2\u016d"+
		"\u016b\3\2\2\2\u016e\u0170\7\17\2\2\u016f\u016e\3\2\2\2\u016f\u0170\3"+
		"\2\2\2\u0170\u0172\3\2\2\2\u0171\u0173\7\f\2\2\u0172\u0171\3\2\2\2\u0172"+
		"\u0173\3\2\2\2\u0173\24\3\2\2\2\u0174\u0175\7^\2\2\u0175\u0176\7)\2\2"+
		"\u0176\26\3\2\2\2\u0177\u017b\7<\2\2\u0178\u0179\7\60\2\2\u0179\u017b"+
		"\7\60\2\2\u017a\u0177\3\2\2\2\u017a\u0178\3\2\2\2\u017b\30\3\2\2\2\u017c"+
		"\u017d\t\6\2\2\u017d\32\3\2\2\2\u017e\u017f\t\7\2\2\u017f\34\3\2\2\2\u0180"+
		"\u0181\7.\2\2\u0181\36\3\2\2\2\u0182\u0183\t\b\2\2\u0183\u0184\b\20\3"+
		"\2\u0184 \3\2\2\2\u0185\u018f\7@\2\2\u0186\u0187\7@\2\2\u0187\u018f\7"+
		"?\2\2\u0188\u018f\7>\2\2\u0189\u018a\7>\2\2\u018a\u018f\7?\2\2\u018b\u018c"+
		"\7>\2\2\u018c\u018f\7@\2\2\u018d\u018f\7?\2\2\u018e\u0185\3\2\2\2\u018e"+
		"\u0186\3\2\2\2\u018e\u0188\3\2\2\2\u018e\u0189\3\2\2\2\u018e\u018b\3\2"+
		"\2\2\u018e\u018d\3\2\2\2\u018f\"\3\2\2\2\u0190\u0191\7>\2\2\u0191\u0192"+
		"\7/\2\2\u0192$\3\2\2\2\u0193\u0194\7\60\2\2\u0194&\3\2\2\2\u0195\u0196"+
		"\t\t\2\2\u0196(\3\2\2\2\u0197\u0198\n\n\2\2\u0198*\3\2\2\2\30\2\u0120"+
		"\u0125\u012a\u0130\u0132\u013a\u013c\u0143\u0148\u014b\u0153\u0157\u015a"+
		"\u015f\u0161\u0169\u016b\u016f\u0172\u017a\u018e\4\3\7\2\3\20\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}