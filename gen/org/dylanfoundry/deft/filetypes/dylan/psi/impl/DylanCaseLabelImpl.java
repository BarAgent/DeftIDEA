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

public class DylanCaseLabelImpl extends ASTWrapperPsiElement implements DylanCaseLabel {

  public DylanCaseLabelImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public DylanExpression getExpression() {
    return findChildByClass(DylanExpression.class);
  }

  @Override
  @Nullable
  public DylanExpressions getExpressions() {
    return findChildByClass(DylanExpressions.class);
  }

  @Override
  @Nullable
  public DylanOperandTails getOperandTails() {
    return findChildByClass(DylanOperandTails.class);
  }

  @Override
  @Nullable
  public DylanUnparenthesizedExpression getUnparenthesizedExpression() {
    return findChildByClass(DylanUnparenthesizedExpression.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitCaseLabel(this);
    else super.accept(visitor);
  }

}
