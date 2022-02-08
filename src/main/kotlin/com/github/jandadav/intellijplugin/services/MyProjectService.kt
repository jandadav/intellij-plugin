package com.github.jandadav.intellijplugin.services

import com.intellij.openapi.project.Project
import com.github.jandadav.intellijplugin.MyBundle
import com.intellij.openapi.vcs.changes.Change

class MyProjectService(project: Project) {

    val changes = mutableListOf<Change>()

    init {
        println(MyBundle.message("projectService", project.name))
    }

}
