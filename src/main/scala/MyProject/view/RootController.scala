package MyProject.view

import MyProject.util.util.sectionAURL
import javafx.event.ActionEvent
import javafx.scene.layout.AnchorPane
import scalafx.scene.layout.BorderPane
import scalafxml.core.macros.sfxml
import scalafxml.core.{FXMLLoader, NoDependencyResolver}
import MyProject.view.RootBorder._


@sfxml
class RootController( val event: ActionEvent, val RootBorder: BorderPane) {

  val buttonFxmlLoader: FXMLLoader = new FXMLLoader(getClass.getResource("/view/Buttons.fxml"), NoDependencyResolver)
  val buttonRoot: AnchorPane = buttonFxmlLoader.load()
  val sectionAFXMLLoader: FXMLLoader = new FXMLLoader(sectionAURL, NoDependencyResolver)
  val sectionAURLRoot :AnchorPane= sectionAFXMLLoader.load()

  setRootBorder(RootBorder)
  RootBorder.setCenter(buttonRoot)
  def callA:Unit={
    RootBorder.setCenter(sectionAURLRoot)
    }
  def callB:Unit={
//    RootBorder.setCenter(buttonRoot)
  }
  def back:Unit={
    RootBorder.setCenter(buttonRoot)
  }
}

