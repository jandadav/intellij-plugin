package com.github.jandadav.intellijplugin.settings

import com.intellij.openapi.options.Configurable
import org.jetbrains.annotations.Nls
import javax.swing.JComponent

class AppSettingsConfigurable: Configurable {

    lateinit var appSettingsComponent: AppSettingsComponent

    override fun createComponent(): JComponent? {
        appSettingsComponent = AppSettingsComponent()
        return appSettingsComponent.getPanel()
    }

    override fun isModified(): Boolean {
        //TODO("Not yet implemented")
        return false
    }

    override fun apply() {
        TODO("Not yet implemented")
    }

    @Nls(capitalization = Nls.Capitalization.Title)
    override fun getDisplayName() = "Intellij Plugin"
}