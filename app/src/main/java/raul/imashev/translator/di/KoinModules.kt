package raul.imashev.translator.di

import org.koin.core.qualifier.named
import org.koin.dsl.module
import raul.imashev.translator.model.data.DataModel
import raul.imashev.translator.model.datasourse.RetrofitImplementation
import raul.imashev.translator.model.datasourse.RoomDataBaseImplementation
import raul.imashev.translator.model.repository.Repository
import raul.imashev.translator.model.repository.RepositoryImplementation
import raul.imashev.translator.view.main.MainInteractor
import raul.imashev.translator.view.main.MainViewModel

val application = module {
    single<Repository<List<DataModel>>>(named(NAME_REMOTE)) { RepositoryImplementation(RetrofitImplementation()) }
    single<Repository<List<DataModel>>>(named(NAME_LOCAL)) { RepositoryImplementation(RoomDataBaseImplementation()) }
}

val mainScreen = module {
    factory { MainInteractor(get(named(NAME_REMOTE)), get(named(NAME_LOCAL))) }
    factory { MainViewModel(get()) }
}
