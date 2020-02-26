package MyProject.view

import MyProject.util.util.sectionAURL
import javafx.scene.Parent
import scalafx.scene.Scene
import scalafx.scene.control.{TextField, TextFormatter}
import scalafxml.core.macros.sfxml
import scalafx.scene.control.TextFormatter.Change
import scalafxml.core.{FXMLLoader, NoDependencyResolver}

@sfxml
class SectionAController(val income: TextField) {
  income.setText("hello")

  val filter: Change => Change = { change: Change =>
    if (isLegitNumber(change.text)) change else null
  }

  val formatter = new TextFormatter[String](filter)

  income.textFormatter = formatter

  def callSectionA(): Unit ={
    println("Section A")
  }

  // Accepts negative sign but not leading zeros
  def isLegitNumber(input: String): Boolean = {
    input.matches("-?(0|[1-9]\\\\d*)")
  }
}
