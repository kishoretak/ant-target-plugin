package com.github.kishoretak.anttargetplugin.services

import com.github.kishoretak.anttargetplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
