package com.study.appindb.ui.shared

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.study.appindb.R
import com.study.appindb.ui.theme.AppInDBTheme

// Android15 以上应用不能强制全屏了
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainScreen() {
    var selectTab by mutableIntStateOf(0)
    val navItems = listOf(
        NavigationItem(
            iconId = R.drawable.res_home1,
            title = "首页",
            color = AppInDBTheme.colors.icon,
            colorSelected = AppInDBTheme.colors.iconCurrent
        ),
        NavigationItem(
            iconId = R.drawable.res_calendar1,
            title = "日历",
            color = AppInDBTheme.colors.icon,
            colorSelected = AppInDBTheme.colors.iconCurrent
        ),
        NavigationItem(
            iconId = R.drawable.res_statistical1,
            title = "统计",
            color = AppInDBTheme.colors.icon,
            colorSelected = AppInDBTheme.colors.iconCurrent
        ),
        NavigationItem(
            iconId = R.drawable.res_my1,
            title = "我的",
            color = AppInDBTheme.colors.icon,
            colorSelected = AppInDBTheme.colors.iconCurrent
        )
    )
    AppInDBTheme {
        Scaffold(bottomBar = {
            NavigationBar(Modifier.height(75.dp)) {
                navItems.forEachIndexed { index, item ->
                    NavigationBarItem(
                        icon = {
                            Icon(
                                painter = painterResource(item.iconId),
                                contentDescription = item.title,
                                Modifier.size(26.dp)
                            )
                        },
                        label = { Text(text = item.title, fontSize = 12.sp) },
                        selected = selectTab == index,
                        onClick = { selectTab = index }
                    )
                }
            }
        }
        ) {
           when(selectTab){
               0-> Column(){}
               1-> Column(){}
               2-> Column(){}
               3-> Column(){}
           }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun MainScreenPreview() {
    MainScreen()
}


@SuppressLint("UnrememberedMutableState")
@Preview(showBackground = true)
@Composable
private fun NavigationBarPreview() {
    val navItems = listOf(
        NavigationItem(
            iconId = R.drawable.res_home1,
            title = "首页",
            color = AppInDBTheme.colors.icon,
            colorSelected = AppInDBTheme.colors.iconCurrent
        ),
        NavigationItem(
            iconId = R.drawable.res_calendar1,
            title = "日历",
            color = AppInDBTheme.colors.icon,
            colorSelected = AppInDBTheme.colors.iconCurrent
        ),
        NavigationItem(
            iconId = R.drawable.res_statistical1,
            title = "统计",
            color = AppInDBTheme.colors.icon,
            colorSelected = AppInDBTheme.colors.iconCurrent
        ),
        NavigationItem(
            iconId = R.drawable.res_my1,
            title = "我的",
            color = AppInDBTheme.colors.icon,
            colorSelected = AppInDBTheme.colors.iconCurrent
        )
    )
    var selectTab by mutableIntStateOf(0)
    NavigationBar(Modifier.height(75.dp)) {
        navItems.forEachIndexed { index, item ->
            NavigationBarItem(
                icon = {
                    Icon(
                        painter = painterResource(item.iconId),
                        contentDescription = item.title,
                        Modifier.size(26.dp)
                    )
                },
                label = { Text(text = item.title, fontSize = 12.sp) },
                selected = selectTab == index,
                onClick = { selectTab = index }
            )
        }
    }
}