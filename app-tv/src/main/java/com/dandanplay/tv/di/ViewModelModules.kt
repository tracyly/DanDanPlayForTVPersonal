package com.dandanplay.tv.di

import com.dandanplay.tv.vm.*
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {

    viewModel { BangumiTimeLineViewModel(get()) }

    viewModel { BangumiDetailViewModel(get()) }

    viewModel { SearchBangumiViewModel(get()) }

    viewModel { SearchMagnetViewModel(get(), get(), get()) }

    viewModel { TorrentFileCheckViewModel(get(), get()) }

    viewModel { BangumiAreaViewModel(get(), get()) }
}