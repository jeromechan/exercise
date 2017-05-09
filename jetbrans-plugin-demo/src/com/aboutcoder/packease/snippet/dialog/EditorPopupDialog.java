package com.aboutcoder.packease.snippet.dialog;

import com.intellij.ide.util.DefaultPsiElementCellRenderer;
import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.openapi.ui.LabeledComponent;
import com.intellij.psi.PsiClass;
import com.intellij.psi.PsiField;
import com.intellij.ui.CollectionListModel;
import com.intellij.ui.ToolbarDecorator;
import com.intellij.ui.components.JBList;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * <Description>
 * Copyright © 2006-2017. All rights reserved.<br />
 *
 * @author chenjinlong<br />
 * @CreateDate 09/05/2017 3:01 PM<br />
 * @description <br />
 */
public class EditorPopupDialog extends DialogWrapper {
    private CollectionListModel<PsiField> myFields;
    private final LabeledComponent<JPanel> myComponent;

    public EditorPopupDialog(@Nullable PsiClass psiClass) {
        super(psiClass.getProject());
        setTitle("Searching snippets");

        myFields = new CollectionListModel<PsiField>(psiClass.getAllFields());
        JList fieldList = new JBList(myFields);
        fieldList.setCellRenderer(new DefaultPsiElementCellRenderer());
        ToolbarDecorator decorator = ToolbarDecorator.createDecorator(fieldList);
        decorator.disableAddAction();
        JPanel panel = decorator.createPanel();
        myComponent = LabeledComponent.create(panel, "Fields to include in compareTo():");

        init();
    }

    @Nullable
    @Override
    protected JComponent createCenterPanel() {
        return myComponent;
    }
}
