package com.github.jandadav.intellijplugin.diff

import com.github.jandadav.intellijplugin.MyBundle
import com.intellij.diff.DiffContext
import com.intellij.diff.DiffExtension
import com.intellij.diff.FrameDiffTool
import com.intellij.diff.requests.DiffRequest

class MainDiffExtension: DiffExtension() {

    override fun onViewerCreated(viewer: FrameDiffTool.DiffViewer, context: DiffContext, request: DiffRequest) {
        println("Diff Extension onViewerCreated")
    }
}