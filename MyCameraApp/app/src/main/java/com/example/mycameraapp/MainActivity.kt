package com.example.mycameraapp

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private var our_request_code : Int = 123 // can number can be given

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun takePhoto(view: View) {
        // start an intent to capture image

        val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        // start the result
        // check if the task can be performed or not
        if (intent.resolveActivity(packageManager) != null) {
            startActivityForResult(intent, our_request_code)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == our_request_code && resultCode == RESULT_OK) {
            // if result is ok and our request code is equal to request code
            val imageView : ImageView = findViewById(R.id.image)
            // start bitmap
            val bitmap = data?.extras?.get("data") as Bitmap
            // set image bitmap
            imageView.setImageBitmap(bitmap)
        }
    }
}