package com.aboutcoder.packease.snippet.action;

import com.aboutcoder.packease.snippet.dialog.EditorPopupDialog;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.LangDataKeys;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.editor.Editor;
import com.intellij.psi.PsiClass;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.util.PsiTreeUtil;

/**
 * <Description>
 * Copyright © 2006-2017. All rights reserved.<br />
 *
 * @author chenjinlong<br />
 * @CreateDate 09/05/2017 3:12 PM<br />
 * @description <br />
 */
public class EditorPopupMenuAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent anActionEvent) {
        EditorPopupDialog editorPopupDialog = new EditorPopupDialog(getPsiClassFromContext(anActionEvent));
        editorPopupDialog.show();
        if (editorPopupDialog.isOK()) {
            System.out.println("click ok");
            editorPopupDialog.close(1);
        } else {
            System.out.println("click cancel");
            editorPopupDialog.close(0);
        }
    }

    private PsiClass getPsiClassFromContext(AnActionEvent e) {
        PsiFile psiFile = e.getData(LangDataKeys.PSI_FILE);
        Editor editor = e.getData(PlatformDataKeys.EDITOR);
        if (psiFile == null || editor == null) {
            return null;
        }
        int offset = editor.getCaretModel().getOffset();
        PsiElement elementAt = psiFile.findElementAt(offset);
        return PsiTreeUtil.getParentOfType(elementAt, PsiClass.class);
    }
}
