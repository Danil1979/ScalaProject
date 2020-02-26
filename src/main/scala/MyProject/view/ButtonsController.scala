package MyProject.view


import MyProject.util.util._
import javafx.event.ActionEvent
import javafx.scene.layout.AnchorPane
import scalafxml.core.macros.sfxml
import scalafxml.core.{FXMLLoader, NoDependencyResolver}
import MyProject.view.RootBorder.rootBorder
@sfxml
class ButtonsController()  {
  println("Its ButtonsController")
  val sectionAFXMLLoader: FXMLLoader = new FXMLLoader(sectionAURL, NoDependencyResolver)
  val sectionAURLRoot :AnchorPane= sectionAFXMLLoader.load()

 
  def callSectionA(event: ActionEvent): Unit ={
    println("Section A")
    rootBorder.setCenter(sectionAURLRoot)

  }

}
