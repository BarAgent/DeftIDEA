/*
 * Copyright 2013, Bruce Mitchener, Jr.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.dylanfoundry.deft.filetypes.intr;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.vfs.CharsetToolkit;
import com.intellij.openapi.vfs.VirtualFile;
import org.dylanfoundry.deft.DeftBundle;
import org.dylanfoundry.deft.DeftIcons;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class MelangeInterfaceFileType extends LanguageFileType {
  public static final LanguageFileType INSTANCE = new MelangeInterfaceFileType();
  @NonNls
  public static final String DEFAULT_EXTENSION = "intr";

  private MelangeInterfaceFileType() {
    super(MelangeInterfaceLanguage.INSTANCE);
  }

  @NonNls
  @NotNull
  @Override
  public String getName() {
    return DeftBundle.message("filetypes.intr.name");
  }

  @NonNls
  @NotNull
  @Override
  public String getDescription() {
    return DeftBundle.message("filetypes.intr.description");
  }

  @NonNls
  @NotNull
  @Override
  public String getDefaultExtension() {
    return DEFAULT_EXTENSION;
  }

  @Override
  public Icon getIcon() {
    return DeftIcons.MELANGE_INTERFACE_FILE;
  }

  @Override
  public String getCharset(@NotNull VirtualFile virtualFile, byte[] bytes) {
    return CharsetToolkit.UTF8;
  }
}

