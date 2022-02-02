package com.github.jandadav.intellijplugin.ui

import com.intellij.openapi.project.Project
import com.intellij.openapi.vcs.FilePath
import com.intellij.openapi.vcs.LocalFilePath
import com.intellij.openapi.vcs.changes.Change
import com.intellij.openapi.vcs.changes.ContentRevision
import com.intellij.openapi.vcs.changes.SimpleContentRevision
import com.intellij.openapi.vcs.changes.ui.SimpleChangesBrowser
import com.intellij.ui.components.JBLabel
import com.intellij.util.ui.FormBuilder
import javax.swing.JPanel

class MainToolWindow(project: Project) {

    val label = JBLabel("OHAI LABEL")

    val c1 = Change(
        SimpleContentRevision("One", LocalFilePath("${project.basePath}/README.md", false), "1"),
        SimpleContentRevision("Two", LocalFilePath("${project.basePath}/README.md", false), "1"))
    val changeList = listOf(c1)
    val changeBrowser = SimpleChangesBrowser(project, changeList).apply {

    }


    val mainPanel: JPanel = FormBuilder.createFormBuilder()
        .addComponent(changeBrowser)
        .panel

    fun getPanel() = mainPanel

}