package com.github.g2hagiwaranozomu.myjetbrainsplugin

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.CommonDataKeys
import com.intellij.openapi.ide.CopyPasteManager
import java.awt.datatransfer.StringSelection


class CopyFileNameAction : AnAction() 
{
    override fun actionPerformed(e: AnActionEvent) 
    {
        val virtualFile = e.getRequiredData(CommonDataKeys.VIRTUAL_FILE)

        // nameの取得
        val absolutePath = virtualFile.path
        
        // ファイル名の取り出し
        val name = absolutePath.split("/").last()

        // clipboardへのコピー
        CopyPasteManager.getInstance().setContents(StringSelection(name))
    }
}
