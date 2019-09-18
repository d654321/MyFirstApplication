package com.jnu.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EditTextActivity extends AppCompatActivity {

    private Button buttonChangeLanguage;
    private TextView textViewLanguage;
    private EditText editTextCountry;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);

        buttonChangeLanguage=(Button)this.findViewById(R.id.button_change_language);
        textViewLanguage=(TextView)this.findViewById(R.id.text_view_language);
        editTextCountry=(EditText)this.findViewById(R.id.edit_text_country);


        buttonChangeLanguage.setOnClickListener(new ClickerListener());
    }

    private class ClickerListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            String country;
            country=editTextCountry.getText().toString();  //获取文本编辑框中的文本内容
            if(country.equals("cn")){
                buttonChangeLanguage.setText(R.string.change_language_cn);
                textViewLanguage.setText(R.string.language_cn);
            }
            if(country.equals("en")){
                buttonChangeLanguage.setText(R.string.change_language_en);
                textViewLanguage.setText(R.string.language_en);
            }
            if(country.equals("jp")){
                buttonChangeLanguage.setText(R.string.change_language_jp);
                textViewLanguage.setText(R.string.language_jp);
            }
            if(country.equals("kr")){
                buttonChangeLanguage.setText(R.string.change_language_kr);
                textViewLanguage.setText(R.string.language_kr);
            }
        }
    }
}
