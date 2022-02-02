package com.github.jandadav.intellijplugin.diff

import com.intellij.ui.components.JBTextField
import com.intellij.util.ui.FormBuilder

class EditorComponent {

    val myText = JBTextField()
        .apply { text = "HALAL PLUGIN" }
    val myMainPanel = FormBuilder.createFormBuilder()
        .addComponent(myText, 1)
        .panel

    fun getPanel() = myMainPanel
}