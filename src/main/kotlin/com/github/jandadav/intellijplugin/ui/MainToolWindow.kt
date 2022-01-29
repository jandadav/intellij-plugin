package com.github.jandadav.intellijplugin.ui

import com.intellij.ui.components.JBLabel
import com.intellij.util.ui.FormBuilder
import javax.swing.JPanel

class MainToolWindow{

    val label = JBLabel("OHAI LABEL")


    val mainPanel: JPanel = FormBuilder.createFormBuilder()
        .addComponent(label)
        .panel

    fun getPanel() = mainPanel

}