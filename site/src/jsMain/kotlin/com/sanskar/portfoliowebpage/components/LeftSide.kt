package com.sanskar.portfoliowebpage.components

import androidx.compose.runtime.Composable
import com.sanskar.portfoliowebpage.styles.SocialIconStyle
import com.sanskar.portfoliowebpage.util.Res
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.forms.ButtonSize
import com.varabyte.kobweb.silk.components.forms.ButtonStyle
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import com.varabyte.kobweb.silk.theme.colors.ColorScheme
import com.varabyte.kobweb.silk.theme.colors.ColorSchemes
import kotlinx.browser.window
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun LeftSide(
    breakpoint: Breakpoint
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(all = 50.px),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = if (breakpoint <= Breakpoint.SM)
            Alignment.CenterHorizontally else Alignment.Start
    ) {
        SpanText(
            text = Res.String.NAME,
            modifier = Modifier
                .margin(bottom = 12.px)
                .fontFamily(Res.String.ROBOTO_CONDENSED)
                .color(Colors.Black)
                .fontSize(50.px)
                .fontWeight(FontWeight.Bold)
                .textAlign(
                    if (breakpoint <= Breakpoint.SM) TextAlign.Center
                    else TextAlign.Start
                )
        )
        SpanText(
            text = Res.String.PROFESSION,
            modifier = Modifier
                .margin(bottom = 24.px)
                .fontFamily(Res.String.ROBOTO_REGULAR)
                .color(Colors.Black)
                .fontSize(18.px)
        )
        Surface(
            modifier = Modifier
                .height(4.px)
                .width(40.px)
                .margin(bottom = 24.px)
                .background(
                    Res.Theme.BLUE.color
                )
                .align(
                    if (breakpoint <= Breakpoint.SM) Alignment.CenterHorizontally
                    else Alignment.Start
                )
        ) {}
        SpanText(
            modifier = Modifier
                .fontFamily(Res.String.ROBOTO_REGULAR)
                .fontSize(14.px)
                .color(Colors.Black)
                .opacity(50.percent)
                .lineHeight(2)
                .margin(bottom = 36.px)
                .textAlign(
                    if (breakpoint <= Breakpoint.SM) TextAlign.Center
                    else TextAlign.Start
                ),
            text = Res.String.ABOUT_ME
        )
        Button(
            modifier = com.sanskar.portfoliowebpage.styles.ButtonStyle.toModifier()
                .margin(bottom = 50.px),
            size = ButtonSize.LG,
            onClick = { window.location.href = Res.String.MY_EMAIL },
            colorScheme = ColorSchemes.Blue
        ) {
            Image(
                modifier = Modifier.margin(right = 12.px),
                src = Res.Icon.EMAIL_LIGHT
            )
            SpanText(
                modifier = Modifier
                    .fontSize(14.px)
                    .color(Colors.White)
                    .fontWeight(FontWeight.Bold)
                    .fontFamily(Res.String.ROBOTO_REGULAR),
                text = Res.String.BUTTON_TEXT
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .gap(12.px),
            horizontalArrangement = if (breakpoint <= Breakpoint.SM)
                Arrangement.Center else Arrangement.Start
        ) {
            SocialIcon.entries.filter {
                !it.name.contains("Light")
            }.forEach {
                IconButton(
                    modifier = SocialIconStyle.toModifier(),
                    icon = it.icon,
                    link = it.link
                )
            }
        }
    }
}
