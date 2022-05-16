package com.example.mymessenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SendMessage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_message);
    }

    public void onSendMessage(View view) {
        EditText editText = findViewById(R.id.message);
        String message = editText.getText().toString();
        Intent sendMessage = new Intent(Intent.ACTION_SEND);
        sendMessage.setType("text/plain");
        sendMessage.putExtra(Intent.EXTRA_TEXT, message);
        Intent chosenIntent = Intent.createChooser(sendMessage, "Send message via...");
        startActivity(chosenIntent);
    }
}