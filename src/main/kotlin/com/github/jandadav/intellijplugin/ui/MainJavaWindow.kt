package com.github.jandadav.intellijplugin.ui

import com.intellij.openapi.project.Project
import com.intellij.openapi.vcs.LocalFilePath
import com.intellij.openapi.vcs.changes.Change
import com.intellij.openapi.vcs.changes.SimpleContentRevision
import com.intellij.openapi.vcs.changes.ui.SimpleChangesBrowser
import javax.swing.JButton
import javax.swing.JComponent
import javax.swing.JPanel

class MainJavaWindow(
    val project: Project
) {
    var panel: JPanel? = null
    var button1: JButton? = null
    var changes = mutableListOf<Change>();
    var simpleChangesBrowser1: SimpleChangesBrowser? = SimpleChangesBrowser(project, changes)

    fun createComponent(): JComponent = panel!!

    fun createUIComponents() {
        changes.add(
            Change(
                SimpleContentRevision("One", LocalFilePath("${project.basePath}/README.md", false), "1"),
                SimpleContentRevision("Two", LocalFilePath("${project.basePath}/README.md", false), "1")
            )
        )
    }
}