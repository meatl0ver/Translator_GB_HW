package raul.imashev.translator.di

import androidx.room.Room
import org.koin.dsl.module
import raul.imashev.historyscreen.history.HistoryInteractor
import raul.imashev.historyscreen.history.HistoryViewModel
import raul.imashev.model.DataModel
import raul.imashev.repository.*
import raul.imashev.repository.room.HistoryDataBase
import raul.imashev.translator.view.main.MainInteractor
import raul.imashev.translator.view.main.MainViewModel

val application = module {
    single { Room.databaseBuilder(get(), HistoryDataBase::class.java, "HistoryDB").build() }
    single { get<HistoryDataBase>().historyDao() }
    single<Repository<List<DataModel>>> { RepositoryImplementation(RetrofitImplementation()) }
    single<RepositoryLocal<List<DataModel>>> {
        RepositoryImplementationLocal(RoomDataBaseImplementation(get()))
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
