/* Generated By:JJTree: Do not edit this line. ASTIfStatement.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package org.apache.commons.jexl3.parser;

public
class ASTIfStatement extends JexlNode {
  public ASTIfStatement(int id) {
    super(id);
  }

  public ASTIfStatement(Parser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=d88cbd9ae207b7607f5952fdc4eba369 (do not edit this line) */
