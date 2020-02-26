package MyProject.view

import scalafx.scene.layout.BorderPane

object RootBorder {

   var rootBorder:BorderPane = _
  def setRootBorder(r: BorderPane):Unit={
    this.rootBorder = r
  }
}
