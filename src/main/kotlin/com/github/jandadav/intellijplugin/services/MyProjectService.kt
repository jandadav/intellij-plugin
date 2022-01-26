package com.github.jandadav.intellijplugin.services

import com.intellij.openapi.project.Project
import com.github.jandadav.intellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
