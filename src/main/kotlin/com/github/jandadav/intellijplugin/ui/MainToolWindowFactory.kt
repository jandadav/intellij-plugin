package com.github.jandadav.intellijplugin.ui

import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.ToolWindow
import com.intellij.openapi.wm.ToolWindowFactory
import com.intellij.ui.content.ContentFactory

class MainToolWindowFactory: ToolWindowFactory {

    override fun createToolWindowContent(project: Project, toolWindow: ToolWindow) {
        val mainToolWindow = MainToolWindow()
        val contentFactory = ContentFactory.SERVICE.getInstance()
        val content = contentFactory.createContent(mainToolWindow.getPanel(), "", false)
        toolWindow.getContentManager().addContent(content)

    }
}