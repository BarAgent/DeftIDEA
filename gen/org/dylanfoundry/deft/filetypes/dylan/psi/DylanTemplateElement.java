// This is a generated file. Not intended for manual editing.
package org.dylanfoundry.deft.filetypes.dylan.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DylanTemplateElement extends PsiElement {

  @Nullable
  DylanHashWord getHashWord();

  @Nullable
  DylanSeparator getSeparator();

  @Nullable
  DylanSubstitution getSubstitution();

  @Nullable
  DylanTemplate getTemplate();

  @Nullable
  DylanWordName getWordName();

}
