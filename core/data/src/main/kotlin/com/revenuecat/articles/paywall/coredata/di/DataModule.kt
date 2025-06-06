/*
 * Copyright (c) 2025 RevenueCat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.revenuecat.articles.paywall.coredata.di

import com.revenuecat.articles.paywall.coredata.repository.ArticlesRepository
import com.revenuecat.articles.paywall.coredata.repository.ArticlesRepositoryImpl
import com.revenuecat.articles.paywall.coredata.repository.DetailsRepository
import com.revenuecat.articles.paywall.coredata.repository.DetailsRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
internal interface DataModule {

  @Binds
  fun bindsArticlesRepository(articlesRepositoryImpl: ArticlesRepositoryImpl): ArticlesRepository

  @Binds
  fun bindsDetailsRepository(detailsRepositoryImpl: DetailsRepositoryImpl): DetailsRepository
}
