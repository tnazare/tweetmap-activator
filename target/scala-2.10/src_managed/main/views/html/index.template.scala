
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(Seq[Any](/*3.2*/main("Welcome to Play Framework")/*3.35*/ {_display_(Seq[Any](format.raw/*3.37*/("""

    <div class="well">
        <h1>"""),_display_(Seq[Any](/*6.14*/message)),format.raw/*6.21*/("""</h1>
    </div>

""")))})),format.raw/*9.2*/("""
"""))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Apr 16 13:45:34 CEST 2014
                    SOURCE: /Users/tnazare/git/tweetmap-activator/hello-play-scala/app/views/index.scala.html
                    HASH: 282376816519902d43c8bf9eb6bf8f3a88d32b97
                    MATRIX: 556->1|667->18|704->21|745->54|784->56|857->94|885->101|934->120
                    LINES: 19->1|22->1|24->3|24->3|24->3|27->6|27->6|30->9
                    -- GENERATED --
                */
            