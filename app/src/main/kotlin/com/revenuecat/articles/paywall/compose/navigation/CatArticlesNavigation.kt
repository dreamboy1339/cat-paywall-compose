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
package com.revenuecat.articles.paywall.compose.navigation

import androidx.compose.animation.SharedTransitionScope
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.revenuecat.articles.paywal.feature.article.CatArticlesDetail
import com.revenuecat.articles.paywall.core.navigation.CatArticlesScreen
import com.revenuecat.articles.paywall.feature.home.CatArticlesHome

fun NavGraphBuilder.catArticlesNavigation(sharedTransitionScope: SharedTransitionScope) {
  with(sharedTransitionScope) {
    composable<CatArticlesScreen.CatHome> {
      CatArticlesHome(animatedVisibilityScope = this)
    }

    composable<CatArticlesScreen.CatArticle>(
      typeMap = CatArticlesScreen.CatArticle.typeMap,
    ) {
      CatArticlesDetail(animatedVisibilityScope = this)
    }
  }
}
