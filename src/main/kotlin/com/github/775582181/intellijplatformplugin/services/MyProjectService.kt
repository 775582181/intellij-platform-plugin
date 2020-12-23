package com.github.775582181.intellijplatformplugin.services

import com.intellij.openapi.project.Project
import com.github.775582181.intellijplatformplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
