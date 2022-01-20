package raul.imashev.translator.view.base

import androidx.appcompat.app.AppCompatActivity
import raul.imashev.translator.model.data.AppState

abstract class BaseActivity<T : AppState> : AppCompatActivity() {

    abstract val model: BaseViewModel<T>

    abstract fun renderData(appState: T)
}