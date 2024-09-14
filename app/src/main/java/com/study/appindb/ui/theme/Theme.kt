package com.study.appindb.ui.theme

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.TweenSpec
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.shapes
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color


private val LightColorPalette = TallyColors(
    bottomBar = l_white1,
    background = l_background,
    listItem = l_white,
    divider = l_white3,
    chatPage = l_background,
    textPrimary = l_black3,
    textPrimaryMe = l_black3,
    textSecondary = l_grey1,
    onBackground = l_grey3,
    icon = l_icon,
    iconCurrent = l_iconSelect,
    badge = l_red1,
    onBadge = l_white,
    bubbleMe = l_green1,
    bubbleOthers = l_white,
    textFieldBackground = l_white,
    more = l_grey4,
    chatPageBgAlpha = 0f,
)
private val DarkColorPalette = TallyColors(
    bottomBar = d_black1,
    background = d_background,
    listItem = d_black3,
    divider = d_black4,
    chatPage = d_background,
    textPrimary = d_white4,
    textPrimaryMe = d_black6,
    textSecondary = d_grey1,
    onBackground = d_grey3,
    icon = d_icon,
    iconCurrent = d_iconSelect,
    badge = d_red1,
    onBadge = d_white,
    bubbleMe = d_green2,
    bubbleOthers = d_black5,
    textFieldBackground = d_black7,
    more = d_grey5,
    chatPageBgAlpha = 0f,
)
//private val NewYearColorPalette = TallyColors(
//    bottomBar = red4,
//    background = red5,
//    listItem = red2,
//    divider = red3,
//    chatPage = red5,
//    textPrimary = l_white,
//    textPrimaryMe = d_black6,
//    textSecondary = grey2,
//    onBackground = grey2,
//    icon = d_white5,
//    iconCurrent = l_green3,
//    badge = yellow1,
//    onBadge = l_black3,
//    bubbleMe = d_green2,
//    bubbleOthers = red6,
//    textFieldBackground = red7,
//    more = red8,
//    chatPageBgAlpha = 1f,
//)

private val LocalWeComposeColors = compositionLocalOf {
    LightColorPalette
}

object AppInDBTheme {
    val colors: TallyColors
        @Composable
        get() = LocalWeComposeColors.current
    enum class Theme {
        Light, Dark
    }
}

@Stable
class TallyColors(
    bottomBar: Color,
    background: Color,
    listItem: Color,
    divider: Color,
    chatPage: Color,
    textPrimary: Color,
    textPrimaryMe: Color,
    textSecondary: Color,
    onBackground: Color,
    icon: Color,
    iconCurrent: Color,
    badge: Color,
    onBadge: Color,
    bubbleMe: Color,
    bubbleOthers: Color,
    textFieldBackground: Color,
    more: Color,
    chatPageBgAlpha: Float,
) {
    var bottomBar: Color by mutableStateOf(bottomBar)
        private set
    var background: Color by mutableStateOf(background)
        private set
    var listItem: Color by mutableStateOf(listItem)
        private set
    var chatListDivider: Color by mutableStateOf(divider)
        private set
    var chatPage: Color by mutableStateOf(chatPage)
        private set
    var textPrimary: Color by mutableStateOf(textPrimary)
        private set
    var textPrimaryMe: Color by mutableStateOf(textPrimaryMe)
        private set
    var textSecondary: Color by mutableStateOf(textSecondary)
        private set
    var onBackground: Color by mutableStateOf(onBackground)
        private set
    var icon: Color by mutableStateOf(icon)
        private set
    var iconCurrent: Color by mutableStateOf(iconCurrent)
        private set
    var badge: Color by mutableStateOf(badge)
        private set
    var onBadge: Color by mutableStateOf(onBadge)
        private set
    var bubbleMe: Color by mutableStateOf(bubbleMe)
        private set
    var bubbleOthers: Color by mutableStateOf(bubbleOthers)
        private set
    var textFieldBackground: Color by mutableStateOf(textFieldBackground)
        private set
    var more: Color by mutableStateOf(more)
        private set
    var chatPageBgAlpha: Float by mutableFloatStateOf(chatPageBgAlpha)
        private set
}

@Composable
fun AppInDBTheme(theme: AppInDBTheme.Theme = AppInDBTheme.Theme.Light, content: @Composable() () -> Unit) {
    val targetColors = when (theme) {
        AppInDBTheme.Theme.Light -> LightColorPalette
        AppInDBTheme.Theme.Dark -> DarkColorPalette
//        TallyTheme.Theme.NewYear -> NewYearColorPalette
    }

    val bottomBar = animateColorAsState(targetColors.bottomBar, TweenSpec(600), label = "")
    val background = animateColorAsState(targetColors.background, TweenSpec(600), label = "")
    val listItem = animateColorAsState(targetColors.listItem, TweenSpec(600), label = "")
    val chatListDivider = animateColorAsState(targetColors.chatListDivider, TweenSpec(600), label = "")
    val chatPage = animateColorAsState(targetColors.chatPage, TweenSpec(600), label = "")
    val textPrimary = animateColorAsState(targetColors.textPrimary, TweenSpec(600), label = "")
    val textPrimaryMe = animateColorAsState(targetColors.textPrimaryMe, TweenSpec(600), label = "")
    val textSecondary = animateColorAsState(targetColors.textSecondary, TweenSpec(600), label = "")
    val onBackground = animateColorAsState(targetColors.onBackground, TweenSpec(600), label = "")
    val icon = animateColorAsState(targetColors.icon, TweenSpec(600), label = "")
    val iconCurrent = animateColorAsState(targetColors.iconCurrent, TweenSpec(600), label = "")
    val badge = animateColorAsState(targetColors.badge, TweenSpec(600), label = "")
    val onBadge = animateColorAsState(targetColors.onBadge, TweenSpec(600), label = "")
    val bubbleMe = animateColorAsState(targetColors.bubbleMe, TweenSpec(600), label = "")
    val bubbleOthers = animateColorAsState(targetColors.bubbleOthers, TweenSpec(600), label = "")
    val textFieldBackground = animateColorAsState(targetColors.textFieldBackground, TweenSpec(600), label = "")
    val more = animateColorAsState(targetColors.more, TweenSpec(600), label = "")
    val chatPageBgAlpha = animateFloatAsState(targetColors.chatPageBgAlpha, TweenSpec(600), label = "")

    val colors = TallyColors(
        bottomBar = bottomBar.value,
        background = background.value,
        listItem = listItem.value,
        divider = chatListDivider.value,
        chatPage = chatPage.value,
        textPrimary = textPrimary.value,
        textPrimaryMe = textPrimaryMe.value,
        textSecondary = textSecondary.value,
        onBackground = onBackground.value,
        icon = icon.value,
        iconCurrent = iconCurrent.value,
        badge = badge.value,
        onBadge = onBadge.value,
        bubbleMe = bubbleMe.value,
        bubbleOthers = bubbleOthers.value,
        textFieldBackground = textFieldBackground.value,
        more = more.value,
        chatPageBgAlpha = chatPageBgAlpha.value,
    )

    CompositionLocalProvider(LocalWeComposeColors provides colors) {
        MaterialTheme(
            shapes = shapes,
            content = content
        )
    }
}
