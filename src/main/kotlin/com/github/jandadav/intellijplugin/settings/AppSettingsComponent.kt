package com.github.jandadav.intellijplugin.settings

import com.intellij.ui.components.JBCheckBox
import com.intellij.ui.components.JBLabel
import com.intellij.ui.components.JBTextField
import com.intellij.util.ui.FormBuilder

class AppSettingsComponent {

    val myUserNameText = JBTextField()
    val myIdeaUserStatus = JBCheckBox("Do you? DO YOU???")
    val myMainPanel = FormBuilder.createFormBuilder()
        .addLabeledComponent(JBLabel("Enter User Name"), myUserNameText, 1, false)
        .addComponent(myIdeaUserStatus, 1)
        .panel

    fun getPanel() = myMainPanel
}