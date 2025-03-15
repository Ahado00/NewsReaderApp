package com.example.newsreade

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun NewsDetailScreen(newsArticle: NewsArticle, isBookmarked: Boolean, onBookmarkClick: () -> Unit) {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = newsArticle.title,
                style = TextStyle(fontSize = 20.sp),
                modifier = Modifier.weight(1f)
            )

            IconButton(onClick = onBookmarkClick) {
                if (isBookmarked) {
                    Icon(Icons.Default.CheckCircle, contentDescription = "Bookmarked")
                } else {
                    Icon(Icons.Default.AddCircle, contentDescription = "Not Bookmarked")
                }
            }
        }

        Text("Published on: ${newsArticle.date}")
        Spacer(modifier = Modifier.height(8.dp))
        Text(newsArticle.content)
    }
}


