package com.github.g2hagiwaranozomu.myjetbrainsplugin.services

import com.intellij.openapi.project.Project
import com.github.g2hagiwaranozomu.myjetbrainsplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
