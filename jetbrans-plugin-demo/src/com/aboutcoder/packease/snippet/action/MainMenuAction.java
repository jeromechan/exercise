package com.aboutcoder.packease.snippet.action;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

/**
 * <Description>
 * Copyright © 2006-2017. All rights reserved.<br />
 *
 * @author chenjinlong<br />
 * @CreateDate 09/05/2017 2:17 PM<br />
 * @description <br />
 */
public class MainMenuAction extends AnAction {
    @Override
    public void actionPerformed(AnActionEvent anActionEvent) {
        System.out.println("anActionEvent = [" + anActionEvent + "]");
    }

    @Override
    public void update(AnActionEvent e) {
        e.getPresentation().setVisible(true);
    }
}
