package MyProject.view

import MyProject.util.util.sectionAURL
import javafx.scene.Parent
import scalafx.scene.Scene
import scalafx.scene.control.TextField
import scalafxml.core.macros.sfxml
import scalafxml.core.{FXMLLoader, NoDependencyResolver}
import scala.compat.java8.FunctionConverters._
@sfxml
class SectionAController(val income: TextField) {
  income.setText("hello")

  def callSectionA(): Unit ={
    println("Section A")

  }

}
