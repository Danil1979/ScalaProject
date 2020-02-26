package MyProject

import java.net.URL

import MyProject.view.RootController
import javafx.scene.Parent
import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.Scene
import scalafxml.core.{FXMLLoader, NoDependencyResolver}
import MyProject.util.util.sectionAURL
import javafx.scene.layout.BorderPane

object RunMe extends JFXApp {
  val rootUrl: URL = getClass.getResource("/view/Root.fxml")
  val rootFxmlLoader: FXMLLoader = new FXMLLoader(rootUrl, NoDependencyResolver)
  val borderPaneRoot: Parent = rootFxmlLoader.load[Parent]()

  stage = new PrimaryStage
  val scene : Scene = new Scene(borderPaneRoot)
  stage.setScene(scene)



}