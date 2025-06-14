package com.example.lifecyclelogger

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {

    private val lifecycleEvents = mutableStateListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("check", "onCreate called")
        addEvent("onCreate")

        setContent {
            LifecycleScreen(events = lifecycleEvents)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("checkLog", "onStart called")
        addEvent("onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("checkLog", "onResume called")
        addEvent("onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("checkLog", "onPause called")
        addEvent("onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("checkLog", "onStop called")
        addEvent("onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("checkLog", "onRestart called")
        addEvent("onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("checkLog", "onDestroy called")
        addEvent("onDestroy")
    }

    private fun addEvent(event: String) {
        Log.d("LifecycleLogger", "Event added: $event")
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