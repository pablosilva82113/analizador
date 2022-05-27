
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Thu Jan 14 22:11:42 CST 2021
//----------------------------------------------------

package codigo;

import java_cup.runtime.Symbol;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Thu Jan 14 22:11:42 CST 2021
  */
public class Sintax extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Sintax() {super();}

  /** Constructor which sets the default scanner. */
  public Sintax(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Sintax(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\047\000\002\002\004\000\002\002\003\000\002\003" +
    "\004\000\002\003\003\000\002\003\004\000\002\003\003" +
    "\000\002\003\004\000\002\003\003\000\002\003\004\000" +
    "\002\003\003\000\002\003\005\000\002\003\004\000\002" +
    "\003\003\000\002\004\007\000\002\004\005\000\002\004" +
    "\010\000\002\004\006\000\002\004\006\000\002\004\005" +
    "\000\002\004\007\000\002\004\007\000\002\004\007\000" +
    "\002\004\010\000\002\004\010\000\002\006\011\000\002" +
    "\013\003\000\002\013\005\000\002\013\005\000\002\013" +
    "\005\000\002\013\006\000\002\013\007\000\002\007\015" +
    "\000\002\010\011\000\002\011\012\000\002\012\011\000" +
    "\002\014\010\000\002\014\007\000\002\005\005\000\002" +
    "\005\007" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\145\000\014\006\017\007\007\012\005\013\015\034" +
    "\016\001\002\000\022\002\ufff8\006\ufff8\007\ufff8\011\ufff8" +
    "\012\ufff8\013\ufff8\030\ufff8\034\ufff8\001\002\000\004\025" +
    "\142\001\002\000\022\002\ufff5\006\ufff5\007\ufff5\011\ufff5" +
    "\012\ufff5\013\ufff5\030\ufff5\034\ufff5\001\002\000\004\025" +
    "\130\001\002\000\022\002\ufffe\006\ufffe\007\ufffe\011\ufffe" +
    "\012\ufffe\013\ufffe\030\ufffe\034\ufffe\001\002\000\004\002" +
    "\127\001\002\000\022\002\ufffa\006\ufffa\007\ufffa\011\ufffa" +
    "\012\ufffa\013\ufffa\030\ufffa\034\ufffa\001\002\000\022\002" +
    "\ufffc\006\ufffc\007\ufffc\011\ufffc\012\ufffc\013\ufffc\030\ufffc" +
    "\034\ufffc\001\002\000\020\002\000\006\017\007\007\011" +
    "\101\012\005\013\015\034\016\001\002\000\004\025\054" +
    "\001\002\000\006\014\032\023\031\001\002\000\004\025" +
    "\020\001\002\000\010\005\022\034\023\035\021\001\002" +
    "\000\004\026\030\001\002\000\004\034\025\001\002\000" +
    "\004\026\024\001\002\000\022\002\ufff0\006\ufff0\007\ufff0" +
    "\011\ufff0\012\ufff0\013\ufff0\030\ufff0\034\ufff0\001\002\000" +
    "\004\005\026\001\002\000\004\026\027\001\002\000\022" +
    "\002\ufff2\006\ufff2\007\ufff2\011\ufff2\012\ufff2\013\ufff2\030" +
    "\ufff2\034\ufff2\001\002\000\022\002\ufff1\006\ufff1\007\ufff1" +
    "\011\ufff1\012\ufff1\013\ufff1\030\ufff1\034\ufff1\001\002\000" +
    "\006\005\046\035\045\001\002\000\010\005\034\034\035" +
    "\035\033\001\002\000\022\002\ufff3\006\ufff3\007\ufff3\011" +
    "\ufff3\012\ufff3\013\ufff3\030\ufff3\034\ufff3\001\002\000\006" +
    "\005\040\034\041\001\002\000\004\015\036\001\002\000" +
    "\004\035\037\001\002\000\022\002\uffee\006\uffee\007\uffee" +
    "\011\uffee\012\uffee\013\uffee\030\uffee\034\uffee\001\002\000" +
    "\004\033\044\001\002\000\004\005\042\001\002\000\024" +
    "\002\ufff4\006\ufff4\007\ufff4\011\ufff4\012\ufff4\013\ufff4\030" +
    "\ufff4\033\043\034\ufff4\001\002\000\022\002\uffea\006\uffea" +
    "\007\uffea\011\uffea\012\uffea\013\uffea\030\uffea\034\uffea\001" +
    "\002\000\022\002\uffec\006\uffec\007\uffec\011\uffec\012\uffec" +
    "\013\uffec\030\uffec\034\uffec\001\002\000\022\002\uffef\006" +
    "\uffef\007\uffef\011\uffef\012\uffef\013\uffef\030\uffef\034\uffef" +
    "\001\002\000\006\005\047\034\050\001\002\000\004\033" +
    "\053\001\002\000\004\005\051\001\002\000\004\033\052" +
    "\001\002\000\022\002\uffeb\006\uffeb\007\uffeb\011\uffeb\012" +
    "\uffeb\013\uffeb\030\uffeb\034\uffeb\001\002\000\022\002\uffed" +
    "\006\uffed\007\uffed\011\uffed\012\uffed\013\uffed\030\uffed\034" +
    "\uffed\001\002\000\004\034\056\001\002\000\004\026\072" +
    "\001\002\000\004\037\057\001\002\000\004\035\060\001" +
    "\002\000\004\036\061\001\002\000\004\035\062\001\002" +
    "\000\006\026\uffdd\034\064\001\002\000\004\026\uffde\001" +
    "\002\000\004\014\065\001\002\000\006\005\067\035\066" +
    "\001\002\000\004\026\uffdc\001\002\000\004\034\070\001" +
    "\002\000\004\005\071\001\002\000\004\026\uffdb\001\002" +
    "\000\004\027\073\001\002\000\014\006\017\007\007\012" +
    "\005\013\015\034\016\001\002\000\020\006\017\007\007" +
    "\011\101\012\005\013\015\030\103\034\016\001\002\000" +
    "\022\002\ufff9\006\ufff9\007\ufff9\011\ufff9\012\ufff9\013\ufff9" +
    "\030\ufff9\034\ufff9\001\002\000\022\002\ufff6\006\ufff6\007" +
    "\ufff6\011\ufff6\012\ufff6\013\ufff6\030\ufff6\034\ufff6\001\002" +
    "\000\022\002\uffff\006\uffff\007\uffff\011\uffff\012\uffff\013" +
    "\uffff\030\uffff\034\uffff\001\002\000\022\002\ufffb\006\ufffb" +
    "\007\ufffb\011\ufffb\012\ufffb\013\ufffb\030\ufffb\034\ufffb\001" +
    "\002\000\004\027\106\001\002\000\022\002\ufffd\006\ufffd" +
    "\007\ufffd\011\ufffd\012\ufffd\013\ufffd\030\ufffd\034\ufffd\001" +
    "\002\000\022\002\uffdf\006\uffdf\007\uffdf\011\uffdf\012\uffdf" +
    "\013\uffdf\030\uffdf\034\uffdf\001\002\000\004\011\101\001" +
    "\002\000\022\002\ufff7\006\ufff7\007\ufff7\011\ufff7\012\ufff7" +
    "\013\ufff7\030\ufff7\034\ufff7\001\002\000\014\006\017\007" +
    "\007\012\005\013\015\034\016\001\002\000\020\006\017" +
    "\007\007\011\101\012\005\013\015\030\110\034\016\001" +
    "\002\000\004\012\111\001\002\000\004\025\112\001\002" +
    "\000\006\024\114\034\115\001\002\000\004\026\126\001" +
    "\002\000\004\026\uffe8\001\002\000\004\022\116\001\002" +
    "\000\012\005\120\024\121\034\122\035\117\001\002\000" +
    "\004\026\uffe6\001\002\000\006\005\123\034\124\001\002" +
    "\000\004\026\uffe7\001\002\000\004\026\uffe5\001\002\000" +
    "\004\026\uffe4\001\002\000\004\005\125\001\002\000\004" +
    "\026\uffe3\001\002\000\022\002\uffe0\006\uffe0\007\uffe0\011" +
    "\uffe0\012\uffe0\013\uffe0\030\uffe0\034\uffe0\001\002\000\004" +
    "\002\001\001\002\000\006\024\114\034\115\001\002\000" +
    "\004\026\132\001\002\000\004\027\133\001\002\000\014" +
    "\006\017\007\007\012\005\013\015\034\016\001\002\000" +
    "\020\006\017\007\007\011\101\012\005\013\015\030\135" +
    "\034\016\001\002\000\024\002\uffe9\006\uffe9\007\uffe9\010" +
    "\136\011\uffe9\012\uffe9\013\uffe9\030\uffe9\034\uffe9\001\002" +
    "\000\004\027\137\001\002\000\014\006\017\007\007\012" +
    "\005\013\015\034\016\001\002\000\020\006\017\007\007" +
    "\011\101\012\005\013\015\030\141\034\016\001\002\000" +
    "\022\002\uffe2\006\uffe2\007\uffe2\011\uffe2\012\uffe2\013\uffe2" +
    "\030\uffe2\034\uffe2\001\002\000\006\024\114\034\115\001" +
    "\002\000\004\026\144\001\002\000\004\027\145\001\002" +
    "\000\014\006\017\007\007\012\005\013\015\034\016\001" +
    "\002\000\020\006\017\007\007\011\101\012\005\013\015" +
    "\030\147\034\016\001\002\000\022\002\uffe1\006\uffe1\007" +
    "\uffe1\011\uffe1\012\uffe1\013\uffe1\030\uffe1\034\uffe1\001\002" +
    "" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\145\000\020\002\010\003\013\004\007\006\012\007" +
    "\011\010\003\012\005\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\016\004\076\006\101\007\077\010\074\011\103\012" +
    "\075\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\014" +
    "\054\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\005" +
    "\062\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\016\003\073" +
    "\004\007\006\012\007\011\010\003\012\005\001\001\000" +
    "\016\004\076\006\101\007\077\010\074\011\103\012\075" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\011\104\001\001\000\002\001" +
    "\001\000\016\003\106\004\007\006\012\007\011\010\003" +
    "\012\005\001\001\000\016\004\076\006\101\007\077\010" +
    "\074\011\103\012\075\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\013\112\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\013\130\001" +
    "\001\000\002\001\001\000\002\001\001\000\016\003\133" +
    "\004\007\006\012\007\011\010\003\012\005\001\001\000" +
    "\016\004\076\006\101\007\077\010\074\011\103\012\075" +
    "\001\001\000\002\001\001\000\002\001\001\000\016\003" +
    "\137\004\007\006\012\007\011\010\003\012\005\001\001" +
    "\000\016\004\076\006\101\007\077\010\074\011\103\012" +
    "\075\001\001\000\002\001\001\000\004\013\142\001\001" +
    "\000\002\001\001\000\002\001\001\000\016\003\145\004" +
    "\007\006\012\007\011\010\003\012\005\001\001\000\016" +
    "\004\076\006\101\007\077\010\074\011\103\012\075\001" +
    "\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Sintax$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Sintax$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Sintax$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    private Symbol s;
    
    public void syntax_error(Symbol s){
        this.s = s;
    }

    public Symbol getS(){
        return this.s;
}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Sintax$actions {
  private final Sintax parser;

  /** Constructor */
  CUP$Sintax$actions(Sintax parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Sintax$do_action(
    int                        CUP$Sintax$act_num,
    java_cup.runtime.lr_parser CUP$Sintax$parser,
    java.util.Stack            CUP$Sintax$stack,
    int                        CUP$Sintax$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Sintax$result;

      /* select the action based on the action number */
      switch (CUP$Sintax$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // DECLARACION_FOR ::= Identificador Igual Comillas Identificador Comillas 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION_FOR",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // DECLARACION_FOR ::= Identificador Igual Numero 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION_FOR",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // SENTENCIA_FOR ::= Identificador In Numero Conector Numero 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_FOR",10, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // SENTENCIA_FOR ::= Identificador In Numero Conector Numero DECLARACION_FOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_FOR",10, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-5)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // FOR ::= For Parentesis_a SENTENCIA_FOR Parentesis_c Llave_a SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("FOR",8, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // DO_WHILE ::= Do Llave_a SENTENCIA Llave_c While Parentesis_a SENTENCIA_BOOLEANA Parentesis_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DO_WHILE",7, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-7)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // WHILE ::= While Parentesis_a SENTENCIA_BOOLEANA Parentesis_c Llave_a SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("WHILE",6, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // IF_ELSE ::= If Parentesis_a SENTENCIA_BOOLEANA Parentesis_c Llave_a SENTENCIA Llave_c Else Llave_a SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("IF_ELSE",5, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-10)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // SENTENCIA_BOOLEANA ::= Identificador Op_relacional Comillas Identificador Comillas 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // SENTENCIA_BOOLEANA ::= Identificador Op_relacional Comillas Comillas 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // SENTENCIA_BOOLEANA ::= Identificador Op_relacional Identificador 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // SENTENCIA_BOOLEANA ::= Identificador Op_relacional Numero 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // SENTENCIA_BOOLEANA ::= Identificador Op_relacional Op_booleano 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // SENTENCIA_BOOLEANA ::= Op_booleano 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // IF ::= If Parentesis_a SENTENCIA_BOOLEANA Parentesis_c Llave_a SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("IF",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // DECLARACION ::= Identificador Igual Comillas Identificador Comillas P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-5)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // DECLARACION ::= Identificador Op_atribucion Comillas Identificador Comillas P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-5)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // DECLARACION ::= Identificador Igual Comillas Comillas P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // DECLARACION ::= Identificador Op_atribucion Comillas Comillas P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // DECLARACION ::= Identificador Igual Identificador Suma Numero 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // DECLARACION ::= Identificador Op_atribucion Numero 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // DECLARACION ::= Print Parentesis_a Identificador Parentesis_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // DECLARACION ::= Print Parentesis_a Numero Parentesis_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // DECLARACION ::= Print Parentesis_a Comillas Identificador Comillas Parentesis_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-5)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // DECLARACION ::= Identificador Igual Numero 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // DECLARACION ::= Identificador Igual Comillas Identificador Comillas 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // SENTENCIA ::= FOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // SENTENCIA ::= SENTENCIA FOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // SENTENCIA ::= SENTENCIA DO_WHILE DO_WHILE 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // SENTENCIA ::= WHILE 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // SENTENCIA ::= SENTENCIA WHILE 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // SENTENCIA ::= IF_ELSE 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // SENTENCIA ::= SENTENCIA IF_ELSE 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // SENTENCIA ::= IF 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // SENTENCIA ::= SENTENCIA IF 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // SENTENCIA ::= DECLARACION 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // SENTENCIA ::= SENTENCIA DECLARACION 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= SENTENCIA 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).value;
		RESULT = start_val;
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Sintax$parser.done_parsing();
          return CUP$Sintax$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

