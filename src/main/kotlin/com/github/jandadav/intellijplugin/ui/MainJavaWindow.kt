package com.github.jandadav.intellijplugin.ui

import com.github.jandadav.intellijplugin.services.MyProjectService
import com.intellij.openapi.project.Project
import com.intellij.openapi.vcs.LocalFilePath
import com.intellij.openapi.vcs.changes.Change
import com.intellij.openapi.vcs.changes.SimpleContentRevision
import com.intellij.openapi.vcs.changes.ui.SimpleChangesBrowser
import javax.swing.JButton
import javax.swing.JComponent
import javax.swing.JPanel

class MainJavaWindow(
    val project: Project,
    val projectService: MyProjectService,
) {
    var panel: JPanel? = null //leWHY nullable
    var button1: JButton? = null
    var simpleChangesBrowser1: SimpleChangesBrowser? = null

    fun createComponent(): JComponent = panel!!

    fun createUIComponents() {
        simpleChangesBrowser1 = SimpleChangesBrowser(project, projectService.changes)
    }
}