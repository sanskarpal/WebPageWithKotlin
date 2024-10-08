package com.sanskar.portfoliowebpage.components

import androidx.compose.runtime.Composable
import com.sanskar.portfoliowebpage.util.Res
import com.sanskar.portfoliowebpage.util.Res.Dimens.BORDER_RADIUS
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.CSSSizeValue
import org.jetbrains.compose.web.css.CSSUnit
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.px

@Composable
fun IconButton(
    modifier: Modifier = Modifier,
    link: String = "",
    icon: String,
    iconSize: CSSSizeValue<CSSUnit.px> = Res.Dimens.ICON_SIZE.px,
    onClick: (() -> Unit) ? = null
) {
    Link(path = link){
        Box(
            modifier = Modifier
                .padding(all = 8.px)
                .borderRadius(r = BORDER_RADIUS.px)
                .cursor(Cursor.Pointer)
                .border(
                    width = 1.px,
                    style = LineStyle.Solid,
                    color =  Res.Theme.SOCIAL_ICON_BACKGROUND_LIGHT.color
                )
                .onClick { onClick?.invoke() }
        ) {
            Image(
                modifier = Modifier.size(iconSize),
                src = icon
            )
        }
    }
}

enum class SocialIcon(
    val icon: String,
    val link: String
) {
    Github(
        icon = Res.Icon.GITHUB,
        link = "https://github.com/sanskarpal"
    ),
    GithubLight(
        icon = Res.Icon.GITHUB_LIGHT,
        link = "https://github.com/sanskarpal"
    ),
    Linkedin(
        icon = Res.Icon.LINKEDIN,
        link = "https://www.linkedin.com/in/sanskar-pal-493691225/"
    ),
    LinkedinLight(
        icon = Res.Icon.LINKEDIN_LIGHT,
        link = "https://www.linkedin.com/in/sanskar-pal-493691225/"
    ),
    Instagram(
        icon = Res.Icon.INSTAGRAM,
        link = "https://www.instagram.com/_sanskar_pal_"
    ),
    InstagramLight(
        icon = Res.Icon.INSTAGRAM_LIGHT,
        link = "https://www.instagram.com/_sanskar_pal_"
    )
}