package raul.imashev.translator.presenter

import raul.imashev.translator.model.data.AppState
import raul.imashev.translator.view.base.View

interface Presenter <T : AppState, V : View> {

    fun attachView(view: V)

    fun detachView(view: V)

    fun getData(word: String, isOnline: Boolean)
}
