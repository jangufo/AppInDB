package com.study.appindb.ui.shared

import android.graphics.drawable.Icon
import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color

class NavigationItem(
    @DrawableRes val iconId: Int,
    val title: String,
    val color: Color,
    val colorSelected: Color
) {
}

