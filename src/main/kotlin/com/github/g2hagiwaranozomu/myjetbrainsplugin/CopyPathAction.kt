package com.github.g2hagiwaranozomu.myjetbrainsplugin

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.CommonDataKeys
import com.intellij.openapi.ide.CopyPasteManager
import java.awt.datatransfer.StringSelection


class CopyPathAction : AnAction() 
{
    override fun actionPerformed(e: AnActionEvent) 
    {
        val virtualFile = e.getRequiredData(CommonDataKeys.VIRTUAL_FILE)
        val project = e.getRequiredData(CommonDataKeys.PROJECT)

        // pathの取得
        val absolutePath = virtualFile.path

        // clipboardへのコピー
        CopyPasteManager.getInstance().setContents(StringSelection(absolutePath))
    }
}