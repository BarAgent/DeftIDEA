// This is a generated file. Not intended for manual editing.
package org.dylanfoundry.deft.filetypes.dylan.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.dylanfoundry.deft.filetypes.dylan.psi.DylanTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.dylanfoundry.deft.filetypes.dylan.psi.*;

public class DylanExpressionNoSymbolImpl extends ASTWrapperPsiElement implements DylanExpressionNoSymbol {

  public DylanExpressionNoSymbolImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public DylanBinaryOperand getBinaryOperand() {
    return findChildByClass(DylanBinaryOperand.class);
  }

  @Override
  @NotNull
  public DylanBinaryOperandNoSymbol getBinaryOperandNoSymbol() {
    return findNotNullChildByClass(DylanBinaryOperandNoSymbol.class);
  }

  @Override
  @Nullable
  public DylanBinaryOperator getBinaryOperator() {
    return findChildByClass(DylanBinaryOperator.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitExpressionNoSymbol(this);
    else super.accept(visitor);
  }

}
