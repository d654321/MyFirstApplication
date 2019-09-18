package com.jnu.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ButtonMainActivity extends AppCompatActivity {

    private Button buttonCn,buttonEn;
    private TextView textViewHelloWorld;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_main);

        buttonCn=(Button)this.findViewById(R.id.button_cn);
        buttonEn=(Button)this.findViewById(R.id.button_en);
        textViewHelloWorld=(TextView) this.findViewById(R.id.text_view_hello_world);

        buttonEn.setOnClickListener(new ClickerListener());
        buttonCn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewHelloWorld.setText(buttonCn.getText());
            }
        });
    }

    private class ClickerListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Button button=(Button)view;
            textViewHelloWorld.setText(button.getText());
        }
    }
}
