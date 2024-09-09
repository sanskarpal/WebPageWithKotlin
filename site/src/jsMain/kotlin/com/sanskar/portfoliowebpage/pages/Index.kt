package com.sanskar.portfoliowebpage.pages

import androidx.compose.runtime.*
import com.sanskar.portfoliowebpage.components.ProfileCard
import com.sanskar.portfoliowebpage.util.Res
import com.varabyte.kobweb.compose.css.functions.LinearGradient
import com.varabyte.kobweb.compose.css.functions.linearGradient
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.backgroundImage
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import kotlinx.browser.localStorage

@Page
@Composable
fun HomePage() {

   Box(
      modifier = Modifier
         .fillMaxSize()
         .backgroundImage(
            linearGradient(
               dir = LinearGradient.Direction.ToRight,
               from = Res.Theme.GRADIENT_ONE.color,
               to = Res.Theme.GRADIENT_TWO.color
            )
         ),
      contentAlignment = Alignment.Center
   ) {
      ProfileCard()
   }
}
