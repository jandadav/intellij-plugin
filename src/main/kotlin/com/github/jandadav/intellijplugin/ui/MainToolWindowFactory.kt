package com.github.jandadav.intellijplugin.ui

import com.github.jandadav.intellijplugin.services.MyProjectService
import com.intellij.openapi.project.Project
import com.intellij.openapi.vcs.LocalFilePath
import com.intellij.openapi.vcs.changes.Change
import com.intellij.openapi.vcs.changes.SimpleContentRevision
import com.intellij.openapi.wm.ToolWindow
import com.intellij.openapi.wm.ToolWindowFactory
import com.intellij.ui.content.ContentFactory

class MainToolWindowFactory: ToolWindowFactory {

    override fun createToolWindowContent(project: Project, toolWindow: ToolWindow) {

        val myProjectService = project.getService(MyProjectService::class.java)

        myProjectService.changes.add(
            Change(
                SimpleContentRevision("One", LocalFilePath("${project.basePath}/README.md", false), "1"),
                SimpleContentRevision("Two", LocalFilePath("${project.basePath}/README.md", false), "1")
            )
        )

        val mainToolWindow = MainJavaWindow(project, myProjectService)
        val contentFactory = ContentFactory.SERVICE.getInstance()
        val content = contentFactory.createContent(mainToolWindow.createComponent(), "AAA", false)
        toolWindow.getContentManager().addContent(content)

    }
}