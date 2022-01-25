package raul.imashev.translator.application

import android.app.Application
import org.koin.core.context.startKoin
import raul.imashev.translator.di.application
import raul.imashev.translator.di.mainScreen

class TranslatorApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(listOf(application, mainScreen))
        }
    }
}
