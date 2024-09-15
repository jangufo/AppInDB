package com.study.appindb.views.homescreen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * 主页上面显示日期和搜索框的顶栏
 */
@Composable
fun TopBarView(modifier: Modifier = Modifier) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(top = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            modifier = Modifier
                .wrapContentWidth(),
            text = "2024-09" ?: "---",
            fontWeight = FontWeight.Medium,
            fontSize = 20.sp,
            letterSpacing = 0.15.sp
        )
        Spacer(
            modifier = Modifier.weight(weight = 1f)
        )
        Box(
            modifier = Modifier
                .clip(shape = CircleShape)
                .offset(x = 16.dp)
                .clickable {

                }
                .padding(horizontal = 16.dp, vertical = 16.dp),
        ) {
            Icon(
                Icons.Outlined.Search,
                contentDescription = "搜索",
                modifier = Modifier.size(size = 35.dp)
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
private fun TopBarPreview() {
    TopBarView()
}
