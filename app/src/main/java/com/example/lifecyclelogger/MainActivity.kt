package com.example.lifecyclelogger

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {

    private val lifecycleEvents = mutableStateListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        addEvent("onCreate")

        setContent {
            LifecycleScreen(events = lifecycleEvents)
        }
    }

    override fun onStart() {
        super.onStart()
        addEvent("onStart")
    }

    override fun onResume() {
        super.onResume()
        addEvent("onResume")
    }

    override fun onPause() {
        super.onPause()
        addEvent("onPause")
    }

    override fun onStop() {
        super.onStop()
        addEvent("onStop")
    }

    override fun onRestart() {
        super.onRestart()
        addEvent("onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        addEvent("onDestroy")
    }

    private fun addEvent(event: String) {
        Log.d("LifecycleEvent", event)
        Toast.makeText(this, event, Toast.LENGTH_SHORT).show()
        lifecycleEvents.add(event)
    }
}

@Composable
fun LifecycleScreen(events: List<String>) {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp)) {

        Text("Activity Lifecycle Events", style = MaterialTheme.typography.headlineSmall)

        Spacer(modifier = Modifier.height(16.dp))

        LazyColumn {
            items(events) { event ->
                Text("• $event", style = MaterialTheme.typography.bodyLarge)
            }
        }
    }
}


