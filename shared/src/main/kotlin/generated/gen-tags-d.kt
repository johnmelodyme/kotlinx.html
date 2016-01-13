package kotlinx.html

import kotlinx.html.*
import kotlinx.html.impl.*
import kotlinx.html.attributes.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

open class DATALIST(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("datalist", consumer, initialAttributes), HtmlInlineTag {

}
fun DATALIST.option(classes : String? = null, block : OPTION.() -> Unit = {}) : Unit = OPTION(attributesMapOf("class", classes), consumer).visit(block)
fun DATALIST.option(classes : String? = null, content : String = "") : Unit = OPTION(attributesMapOf("class", classes), consumer).visit({+content})


open class DD(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("dd", consumer, initialAttributes), HtmlBlockTag {

}

open class DEL(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("del", consumer, initialAttributes), HtmlInlineTag {
    var cite : String
        get()  = attributeStringString.get(this, "cite")
        set(newValue) {attributeStringString.set(this, "cite", newValue)}

    var dateTime : String
        get()  = attributeStringString.get(this, "datetime")
        set(newValue) {attributeStringString.set(this, "datetime", newValue)}


}

open class DETAILS(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("details", consumer, initialAttributes), HtmlBlockTag {
    var open : Boolean
        get()  = attributeBooleanTicker.get(this, "open")
        set(newValue) {attributeBooleanTicker.set(this, "open", newValue)}


}
fun DETAILS.legEnd(classes : String? = null, block : LEGEND.() -> Unit = {}) : Unit = LEGEND(attributesMapOf("class", classes), consumer).visit(block)


open class DFN(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("dfn", consumer, initialAttributes), HtmlInlineTag {

}

open class DIALOG(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("dialog", consumer, initialAttributes), HtmlBlockTag {

}

open class DIV(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("div", consumer, initialAttributes), HtmlBlockTag {

}

open class DL(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("dl", consumer, initialAttributes), CommonAttributeGroupFacade {

}
fun DL.dd(classes : String? = null, block : DD.() -> Unit = {}) : Unit = DD(attributesMapOf("class", classes), consumer).visit(block)

fun DL.dt(classes : String? = null, block : DT.() -> Unit = {}) : Unit = DT(attributesMapOf("class", classes), consumer).visit(block)


open class DT(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("dt", consumer, initialAttributes), HtmlInlineTag {

}

