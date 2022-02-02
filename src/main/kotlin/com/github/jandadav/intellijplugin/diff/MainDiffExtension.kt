package com.github.jandadav.intellijplugin.diff

import com.github.jandadav.intellijplugin.MyBundle
import com.intellij.diff.DiffContext
import com.intellij.diff.DiffExtension
import com.intellij.diff.FrameDiffTool
import com.intellij.diff.requests.DiffRequest
import com.intellij.diff.tools.simple.SimpleOnesideDiffViewer
import com.intellij.diff.util.Side
import com.intellij.icons.AllIcons
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.editor.impl.EditorEmbeddedComponentManager
import com.intellij.openapi.editor.markup.GutterIconRenderer
import com.intellij.openapi.editor.markup.HighlighterLayer
import javax.swing.Icon

class MainDiffExtension: DiffExtension() {

    val component = EditorComponent()
    val offset = 0
    val props = EditorEmbeddedComponentManager.Properties(
        EditorEmbeddedComponentManager.ResizePolicy.none(),
        null,
        true,
        false,
        0,
        offset)

    override fun onViewerCreated(viewer: FrameDiffTool.DiffViewer, context: DiffContext, request: DiffRequest) {
        println("Diff Extension onViewerCreated")
        //TODO make some decision logic which view is the right one

        if (viewer is SimpleOnesideDiffViewer) {
            createIcons(viewer)
        }
    }

    fun createIcons(viewer: SimpleOnesideDiffViewer) {

        val editorEmbeddedComponentManager = EditorEmbeddedComponentManager.getInstance()
        editorEmbeddedComponentManager.addComponent(viewer.editor , component.getPanel(), props)

        for (logicalLine in 0 until viewer.editor.document.lineCount) {
            println(logicalLine)
            val highlighter = viewer.editor.markupModel.addLineHighlighter(logicalLine, HighlighterLayer.LAST, null)
            highlighter.gutterIconRenderer = MyGutterIconRenderer()
        }
    }
}

class MyGutterIconRenderer : GutterIconRenderer() {
    override fun equals(other: Any?): Boolean {
        TODO("Not yet implemented")
    }

    override fun hashCode(): Int {
        TODO("Not yet implemented")
    }

    override fun getIcon(): Icon {
        return AllIcons.Icons.Ide.MenuArrow
    }

}