package raul.imashev.translator.di

import dagger.Module
import dagger.Provides
import raul.imashev.translator.model.data.RetrofitDataModel
import raul.imashev.translator.model.datasourse.DataSource
import raul.imashev.translator.model.datasourse.RetrofitImplementation
import raul.imashev.translator.model.datasourse.RoomDataBaseImplementation
import raul.imashev.translator.model.entity.DataModel
import raul.imashev.translator.model.repository.Repository
import raul.imashev.translator.model.repository.RepositoryImplementation
import javax.inject.Named
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Provides
    @Singleton
    @Named(NAME_REMOTE)
    internal fun provideRepositoryRemote(@Named(NAME_REMOTE) dataSourceRemote: DataSource<List<RetrofitDataModel>>): RepositoryImplementation =
        RepositoryImplementation(dataSourceRemote)

    @Provides
    @Singleton
    @Named(NAME_LOCAL)
    internal fun provideRepositoryLocal(@Named(NAME_LOCAL) dataSourceLocal: DataSource<List<RetrofitDataModel>>): RepositoryImplementation =
        RepositoryImplementation(dataSourceLocal)

    @Provides
    @Singleton
    @Named(NAME_REMOTE)
    internal fun provideDataSourceRemote(): DataSource<List<RetrofitDataModel>> =
        RetrofitImplementation()

    @Provides
    @Singleton
    @Named(NAME_LOCAL)
    internal fun provideDataSourceLocal(): DataSource<List<RetrofitDataModel>> =
        RoomDataBaseImplementation()
}