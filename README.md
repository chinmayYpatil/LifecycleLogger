# 📱 Lifecycle Logger App(Jetpack Compose Activity Lifecycle)

This is a simple Android app that shows how the **Activity Lifecycle** works using **Jetpack Compose**.

When the app starts, stops, resumes, or gets destroyed, the app will:

✅ Show which lifecycle methods are called  
✅ Display a toast message  
✅ Show the events on the screen  

## How It Works

Each time a lifecycle method is called, we:

1. Add the event to a list  
2. Show it on the screen  
3. Show a small Toast  
4. Print it in Logcat


## Example Lifecycle Flow
| Action                  | Events Triggered                          |
|-------------------------|-------------------------------------------|
| App starts              | onCreate → onStart → onResume             |
| App goes to background  | onPause → onStop                          |
| App comes back          | onRestart → onStart → onResume            |
| App is closed           | onPause → onStop → onDestroy              |


![activity_lifecycle](https://github.com/user-attachments/assets/fee8f9ef-0c7f-4c5d-b1cf-6100e99dcabb)

## How to Run

1. Clone this project
2. Open in Android Studio
3. Run the app on a device or emulator
4. On your Log apply for the filter checkLog


## Screenshot
<img width="978" alt="Screenshot 2025-06-14 at 3 17 00 PM" src="https://github.com/user-attachments/assets/b373f8d7-46bf-4eb1-9468-19c2c5ee7ece" />
<img width="477" alt="Screenshot 2025-06-14 at 3 20 05 PM" src="https://github.com/user-attachments/assets/eebbdcdb-3090-48a9-b3da-2440bf00edb9" />



