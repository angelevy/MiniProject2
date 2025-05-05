package com.angellevyne0045.miniproject2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.angellevyne0045.miniproject2.navigation.SetupNavGraph
import com.angellevyne0045.miniproject2.ui.theme.MIniProject2Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MIniProject2Theme {
                SetupNavGraph()
            }
        }
    }
}