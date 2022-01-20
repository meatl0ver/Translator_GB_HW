package raul.imashev.translator.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import raul.imashev.translator.view.main.MainActivity

@Module
abstract class ActivityModule {

    @ContributesAndroidInjector
    abstract fun contributeMainActivity(): MainActivity
}