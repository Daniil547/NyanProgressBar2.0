package com.github.daniil547.nyanprogressbar20.services

import com.github.daniil547.nyanprogressbar20.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
