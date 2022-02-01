package raul.imashev.translator.di

import androidx.room.Room
import org.koin.core.qualifier.named
import org.koin.dsl.module
import raul.imashev.translator.model.data.DataModel
import raul.imashev.translator.model.datasourse.RetrofitImplementation
import raul.imashev.translator.model.datasourse.RoomDataBaseImplementation
import raul.imashev.translator.model.repository.Repository
import raul.imashev.translator.model.repository.RepositoryImplementation
import raul.imashev.translator.model.repository.RepositoryImplementationLocal
import raul.imashev.translator.model.repository.RepositoryLocal
import raul.imashev.translator.room.HistoryDataBase
import raul.imashev.translator.view.history.HistoryInteractor
import raul.imashev.translator.view.history.HistoryViewModel
import raul.imashev.translator.view.main.MainInteractor
import raul.imashev.translator.view.main.MainViewModel

val application = module {
    single { Room.databaseBuilder(get(), HistoryDataBase::class.java, "HistoryDB").build() }
    single { get<HistoryDataBase>().historyDao() }
    single<Repository<List<DataModel>>> { RepositoryImplementation(RetrofitImplementation()) }
    single<RepositoryLocal<List<DataModel>>> { RepositoryImplementationLocal(RoomDataBaseImplementation(get()))
    }
}

val mainScreen = module {
    factory { MainViewModel(get()) }
    factory { MainInteractor(get(), get()) }
}

val historyScreen = module {
    factory { HistoryViewModel(get()) }
    factory { HistoryInteractor(get(), get()) }
}